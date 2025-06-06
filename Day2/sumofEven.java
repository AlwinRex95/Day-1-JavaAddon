package Day2;


public class sumofEven {

	public static void main(String[] args) {
		
		int[] number=new int[6];
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		number[5]=6;
		
//		int[] number= {1,2,3,4,5};
		int sum=0;
		int count=0;
//		System.out.println(number[3]);
		System.out.println(number.length);
		for (int i=0;i<=number.length-1;i++) {
			if(number[i] % 2 ==0) {
				
			}
		    sum = sum+number[i];
		    count++;
			System.out.println(number[i]);
		}
		System.out.println("sum is:"+sum);
	//Reverse number
//		for (int i=number.length-1;i>=0 ;i--) {
//			System.out.println(number[i]);
//		}
	}

}
