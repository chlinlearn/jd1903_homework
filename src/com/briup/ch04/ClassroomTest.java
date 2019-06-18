package com.briup.ch04;

public class ClassroomTest 
{
	public static void main(String[] args) 
	{
		//创建Classroom对象
		Classroom classroom = new Classroom();

		//创建Teacher对象，并将Teacher分配到Classroom中
		//int id, String name, double salary, int clRoomId, int age
		Teacher teacher = new Teacher(1001,"tom",5000.0,520,35);
		classroom.setTeacher(teacher);
		
		//创建3个Student对象，并将Student分配到Classroom中
		Student student1 = new Student(2001, "student1", 18);
		Student student2 = new Student(2002, "student2", 19);
		Student student3 = new Student(2003, "student3", 20);
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		classroom.addStudent(student3);

		//调用Classroom中的其它方法，测试方法的业务逻辑是否准确
		System.out.println("共有学生："+classroom.getStudentNum()+"人");
		//输出所有学生信息
		Student[] students = classroom.getStudents();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].print();
			}		
		}
		
		//输出当前老师的信息
		Teacher tea = classroom.getTeacher();
		tea.print();
		
		//输出当前教室中的教师和学生的信息
		classroom.print();
		
		//删除学生
		if(classroom.removeStudent(1)) {
			System.out.println("删除学生成功");
		}
		
		classroom.print();
		
		
	}
}

