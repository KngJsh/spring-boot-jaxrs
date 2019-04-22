package net.jmd.jaxrs.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import net.jmd.jaxrs.model.Student;

@Repository
public class StudentRepository {

	Map<Long, Student> students = new HashMap<Long, Student>();

	@PostConstruct
	public void init() {
		students.put(101l, new Student(101l, "Jane", "Doe", "Junior", true, LocalDate.now().minusDays(2L)));
		students.put(102l, new Student(102l, "Martin", "Fowler", "Senior", true, LocalDate.now().minusYears(2L)));
		students.put(103l, new Student(103l, "Roy", "Fielding", "Freshman", true, LocalDate.now().minusYears(1L)));
		students.put(104l, new Student(104l, "Hans", "Müller", "Alumnus", false, LocalDate.now().minusYears(10L)));
	}

	public Collection<Student> findAll() {
		return students.values();
	}

	public Optional<Student> findById(Long id) {
		Student student = null;
		if (students.containsKey(id))
			student = students.get(id);
		return Optional.ofNullable(student);
	}
}
