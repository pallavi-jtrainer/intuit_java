package com.springpeople.SpringBootJdbcProject.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springpeople.SpringBootJdbcProject.entity.Student;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	class StudentMapper implements RowMapper<Student> {
		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setStudentId(rs.getInt("STUDENTID"));
			student.setStudentName(rs.getString("STUDENTNAME"));
			student.setEmail(rs.getString("EMAIL"));
			return student;
		}
		
	}
	
	public int updateEmail(int id, String newEmail) {
//		return jdbcTemplate.update("update student set email = '" + newEmail + "' where studentid = " + id);
		
		return jdbcTemplate.update("update student set email = ? where studentid = ?", newEmail, id);
	}
	
	public int deleteStudent(int id) {
		return jdbcTemplate.update("delete from student where studentid = " + id);
	}
	
	public Student getStudentDetails(int id) {
		return jdbcTemplate.queryForObject("select * from student where studentid = " + id, new StudentMapper());
	}
	
	public List<Student> listAll() {
		return jdbcTemplate.query("select * from student", new StudentMapper());
	}
	
	public int insertStudent(Student student) {
		return jdbcTemplate.update("insert into student (studentId, studentName, email)" 
				+ " values (?, ?, ?)", new Object[] {
					student.getStudentId(), student.getStudentName(), student.getEmail()	
				});
	}
}
