package com.kitchenstory.kitchenstorybackend.repository;

import com.kitchenstory.kitchenstorybackend.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, Long> {

    @Query(value = "SELECT * FROM admin_user p WHERE p.username = :username AND p.password = :password", nativeQuery = true)
    public List<AdminUser> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT * FROM admin_user p WHERE p.username = :username", nativeQuery = true)
    public List<AdminUser> findByUsername(@Param("username") String username);

    @Transactional
    @Modifying
    @Query(value = " update admin_user p set  p.password = :password where p.username = :username", nativeQuery = true)
    public void updatePassword(@Param("username") String username, @Param("password") String password);



}
