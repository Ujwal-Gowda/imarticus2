package Even;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5!=== 1 * 2 * 3 * 4 * 5
		
				int res = recFact(5);
				
				System.out.println(res);
				
			}

			private static int fact(int n) {
				int res =1;
				for(int i=1;i<=n;i++) {
					res = res * i;
				}
				return res;
			}
			
			private static int recFact(int n) {
				
				if(n>0)  return n * recFact(n-1);
				else return 1;
				
			}
			

	}


