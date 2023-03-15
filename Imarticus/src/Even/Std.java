package Even;

import java.util.Arrays;
import java.util.List;

class Student{
	int id;
    List<String> adharList;
   
	
public Student(int id, List<String> adharList) {
		super();
		this.id = id;
		this.adharList = adharList;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<String> getAdharList() {
	return adharList;
}

public void setAdharList(List<String> adharList) {
	this.adharList = adharList;
}



@Override
public String toString() {
	return "Student [id=" + id + ", adharList=" + adharList + ",  ]";
}
}


public class Std {
public static void main (String [] args)
{
	Student s1= new Student (1,  Arrays.asList("11111", "22222"));

	Student s2= new Student (2,  Arrays.asList("33333", "44444"));

	Student s3= new Student(3,  Arrays.asList("55555", "66666"));

	Student s4= new Student(4,  Arrays.asList("77777", "88888"));

List<Student> stdList= Arrays.asList(s1, s2, s3, s4);
stdList.stream().map(x->x.getAdharList()).forEach(y->System.out.println(y));
//System.out.println(max);
//Float max = stdList.stream().map(x->x.getFees()).reduce((a,b)->a>b?a:b).get();

//stdList.stream().sorted((o1, o2)->o1.getFees().compareTo(o2.getFees())
//		).forEach(x->System.out.println(x.getFees()));

}
}

