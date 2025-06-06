package Day2;

public class MultiDimensional {

	public static void main(String[] args) {
		int[][] numbers = {{1,2},{10,20}};
		int n=5;
		int sum=0;
		for (int i = 1; i <=n; i++) {
			System.out.println("10");
			System.out.println("");
			for(int j=1; j<=i;j++) {
				System.out.print(i);
				sum = j*10;
				System.out.println(sum);
			}
			
			System.out.println("");
		}

	}

}
