package Task2;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("String Wrord: Welcome to JavaAddon Class");
		String word="Welcome to JavaAddon Class";
				
		int vowel=0,consonant=0;
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			  
			if (Character.isLetter(ch)) {
				
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowel++;
				}else  {
				
					consonant++;
				} 
			}			
		}		
		System.out.println("vowel  :"+vowel);
		System.out.println("consonant  :"+consonant);

	}

}
