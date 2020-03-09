package edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.repository;

import org.springframework.data.repository.CrudRepository;

import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Classroom;

public interface ClassroomRepository extends CrudRepository<Classroom, Long>{

}
