package com.natixis.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natixis.db.model.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
