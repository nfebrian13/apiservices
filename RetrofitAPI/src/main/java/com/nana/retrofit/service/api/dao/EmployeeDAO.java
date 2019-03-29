package com.nana.retrofit.service.api.dao;

import com.nana.retrofit.service.api.domain.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	public List<Employee> getEmployeeAll() {
		List<Employee> emp = new ArrayList<Employee>();

		Employee emp1 = new Employee();
		emp1.setName("Nana Febriana");
		emp1.setIdNumber("1104110076");
		emp1.setDivision("Information Technology");
		emp1.setAddress("Dusun Krajan 1 RT 09 Rw 02 Desa Tanjung Sari Timur Kecamatan Cikaum Kabupaten Subang");

		emp.add(emp1);

		Employee emp2 = new Employee();
		emp2.setName("Sandi Oktavian Nugraha");
		emp2.setIdNumber("1104110077");
		emp2.setDivision("Developer");
		emp2.setAddress("Dusun Krajan 1 RT 09 Rw 02 Desa Tanjung Sari Timur Kecamatan Cikaum Kabupaten Subang");

		emp.add(emp2);

		return emp;

	}
}
