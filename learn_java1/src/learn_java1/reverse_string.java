package learn_java1;

public class reverse_string {

	public static void main(String[] args) {
		//1.StringBuffer
		String st="Welcome";
		StringBuffer sb=new StringBuffer();
		sb.append(st);
		System.out.println(sb.reverse());
      
		//2.for loop
		String st1="Bangalore";
		String rev=" ";
		
		for (int i =st1.length()-1; i>=0; i--) {
			
			rev=rev+st1.charAt(i);	
			
		}
		System.out.println(rev);
		
		//3.StringBuilder
		String st2="Mangalore";
		
		StringBuilder stb=new StringBuilder();
		stb.append(st2);
		System.out.println(stb.reverse());
	}
	
	

}
