package com.springpeople.SpringCoreJavaConfigDemo.entity;

public class Courses {
	private int courseId;
	private String courseName;
	
	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "[courseId=" + courseId + ", courseName=" + courseName + "]";
	}
}
