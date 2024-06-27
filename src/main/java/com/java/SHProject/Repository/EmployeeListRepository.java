package com.java.SHProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.java.SHProject.Entity.EmployeesList;

@Repository
public interface EmployeeListRepository extends JpaRepository<EmployeesList, Integer> {

}