package com.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dxc.model.Employee;

@Repository
public interface UserDao extends JpaRepository<Employee,Integer> {

}
