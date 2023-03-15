package Even;

import java.util.ArrayList;
import java.util.List;


class Employees implements Cloneable{
	
	private List<String> dataList;

	public Employees(List<String> dataList) {
		super();
		this.dataList = dataList;
	}
	
	public Employees() {
		dataList = new ArrayList<String>();
	}
	
	public void loadData(){
		dataList.add("HYD");
		dataList.add("Delhi");
		dataList.add("Bangalore");
	}
	
	
	
	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public Employees clone() {
		List<String>  tempList = new ArrayList<String>();
		
		for(String val:this.dataList) {
			tempList.add(val);
		}
		
		return new Employees(tempList);
	}

	@Override
	public String toString() {
		return "Employees [dataList=" + dataList + "]";
	}
	
	
}


public class PatternClone{

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Employees emps = new Employees();
		
		emps.loadData();
		
		
		Employees e1 = emps.clone();
		Employees e2 = emps.clone();
		
		List<String> e1List =e1.getDataList();
		
		List<String> e2List =e2.getDataList();
		
		e1List.add("Jaipur");
		
		e2List.remove(0);
		
		System.out.println(emps);
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}





