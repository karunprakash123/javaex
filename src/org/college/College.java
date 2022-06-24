 package org.college;

public class College {
 public void collegeName() {
   System.out.println("College Name:TCAS");
	}
 public void collegeCode() {
	 System.out.println("College Code:410");
 }
 public void collegeRank() {
   System.out.println("College Rank:1st");	 
 }
 public static void main(String[] args) {
	College c = new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	Student s = new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	Hostel h = new Hostel();
	h.hostelName();
	Department d = new Department();
	d.deptName();
}
}
