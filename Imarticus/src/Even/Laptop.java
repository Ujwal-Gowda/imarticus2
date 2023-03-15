package Even;


	import java.util.Arrays;
	import java.util.List;

	public class Laptop {

		public static void main(String[] xyz) {
			

			
			List<String> laptopList = Arrays.asList("Dell","HP","Apple","Asus");
			
			
			for(int i=0;i<laptopList.size();i++) {
				System.out.println(laptopList.get(i));
			}
			
			for(String laptop:laptopList) {
				System.out.print(laptop+" ");
			}
			
			laptopList.forEach((y)->{
				System.out.print(y+"-");
			});
		System.out.println();
		}

		

}
