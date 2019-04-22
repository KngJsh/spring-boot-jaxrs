package net.jmd.jaxrs.service;

import java.util.Collection;

import javax.ws.rs.core.Response;

import net.jmd.jaxrs.exception.StudentNotFoundException;
import net.jmd.jaxrs.model.Student;
import net.jmd.jaxrs.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}

	public Collection<Student> getAllStudents() {
		return repository.findAll();
	}

	public Response getById(Long id) {
		Student student = repository.findById(id).orElseThrow(StudentNotFoundException::new);
		return Response.ok(student).build();
	}
}
