package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}