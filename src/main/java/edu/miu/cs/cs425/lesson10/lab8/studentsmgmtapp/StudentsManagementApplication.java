package edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Classroom;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Student;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Transcript;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.repository.ClassroomRepository;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.repository.IStudentRepository;

@SpringBootApplication
public class StudentsManagementApplication implements CommandLineRunner{
	@Autowired
	private IStudentRepository studentRepository;
	@Autowired
	private ClassroomRepository classroomRepository;
	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to StudentsMgmtApp version 1.0");

		Transcript t1=new Transcript("BS Computer Science");
		Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019,5,24),t1);

		saveStudent(s1);
		

		Transcript t2=new Transcript("Master Computer Science");
		Student s2 = new Student("000-61-0001", "Darphy", "Lynn", "Smith", 3.45, LocalDate.of(2019,5,24),t2);

		saveStudent(s2);
		
		Classroom classroom = new Classroom("McLug", "M001", Arrays.asList(s1, s2));
		classroomRepository.save(classroom);
		
	
	}

	private void saveStudent(Student s) {
		studentRepository.save(s);
	}
//	private void saveClassroom(Classroom c) {
//		studentRepository.save(c);
//	}
	
//	private Iterable<Student> getListOfStudents() {
//		return studentRepository.findAll();
//	}

}
