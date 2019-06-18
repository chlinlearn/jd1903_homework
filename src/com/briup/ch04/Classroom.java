package com.briup.ch04;

public class Classroom  
{
	public Teacher teacher;						//保存教师	
	public Student[] students = new Student[40];//保存学生
	public int index = 0;						//保存学生数量

	public Teacher getTeacher(){
		//返回教室中的教师
		return teacher;
	}

	public Student[] getStudents(){
		//返回所有的学生
		return students;
	}

	public void setTeacher(Teacher tea){
		//更换教师
		this.teacher = tea;
	}

	public void addStudent(Student stu){
		//增加学生
		students[index] = stu;
		index++;
	}

	public boolean removeStudent(int idx){
		//删除学生
		//students[idx] = new Student(0, null, 0);
		students[idx] = null;
		index--;
		return true;
	}

	public int getStudentNum(){
		//返回教室中学生的数量
		return index;
	}

	public void print(){
		//输出当前教室中的教师和学生的信息
		getTeacher().print();
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null) {
				students[i].print();
			}		
		}
		
	}
}

