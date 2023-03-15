package Even;

import java.util.ArrayList;
import java.util.List;


class Students implements Cloneable{
	
	private List<String> dataList;

	public Students(List<String> dataList) {
		super();
		this.dataList = dataList;
	}
	
	public Students() {
		dataList = new ArrayList<String>();
	}
	
	public void loadData(){
		dataList.add("Arun");
		dataList.add("Barath");
		dataList.add("charan");
	}
	
	
	
	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public Students clone() {
		List<String>  tempList = new ArrayList<String>();
		
		for(String val:this.dataList) {
			tempList.add(val);
		}
		
		return new Students(tempList);
	}

	@Override
	public String toString() {
		return "Students [dataList=" + dataList + "]";
	}
	
	
}


public class ProxyPatternStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Students std = new Students();
		
		std.loadData();
		
		
		Students s1 = std.clone();
		Students s2 = std.clone();
		
		List<String> s1List =s1.getDataList();
		
		List<String> s2List =s2.getDataList();
		
		s1List.add("Dhanush");
		
		s2List.remove(0);
		
		System.out.println(std);
		System.out.println(s1);
		System.out.println(s2);
		
		
	}



	}


