package learn_java1;

public class swapping {

	public static void main(String[] args) {
		int salary1=30000;
		int salary2=400000;
		
		int salary3=salary1;
		salary1= salary2;
		salary2=salary3;
     
		System.out.println("My Salary1  "+salary1+"  Salary2  "+salary2);
		
		
		int s1=40;
		int s2=50;
		
		 s1=s1-s2;
		 s2=s1+s2;
		 s1=s2-s1;
		 System.out.println(" S1  "+s1+"  S2  "+s2);
		
		 //String Swapping
		 String st="Jenifer";
		 String st1="Jayaraj";
		 
		 st=st+st1;
		 st1=st.substring(0,st.length()-st1.length());
		 st=st.substring(st1.length());
		 
		 System.out.println(" S1  "+st+"  S2  "+st1);
	}

}
