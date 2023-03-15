package Even;

import java.util.Arrays;

import java.util.List;

class Student{
	int id;
    int  marks;
	
	public Student(int id, int marks) {
		super();
		this.id = id;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarkst() {
		return marks;
	}

	public void setMarksList(List<String> marksList) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks+ "]";
	}
	
	
}

public class Stud {

public static void main (String [] args)
{
	Student s1= new Student (1,  85);

	Student s2= new Student (2,  90);

	Student s3= new Student(3,  60);

	Student s4= new Student(4,  50);

List<Student> stdList= Arrays.asList(new Student (1,  85),
		);


int max= stdList.stream().map(x->x.getMarks()).reduce((a,b)->a>b?a:b).get();


System.out.println(max);

}
}










