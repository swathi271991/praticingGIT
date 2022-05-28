
public class MethodsOfStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1 public char charAt(int index)
		
		String s = new String("Selenium");
		System.out.println(s.charAt(5));
	
		
	//2 public String concat(String s)
		s = s.concat("Automation");
		//s = s+ "Automation";
		//s += "Automation";
		System.out.println(s);
		
	//3 public boolean equals(Object o)	
		
		String a = "Hi";
		String b = "Hi";
		String c = "hi";
		
		System.out.println(a==b); //true
		System.out.println(a.equals(b)); //true
		System.out.println(c.equals(a));//false
		
	//4 public boolean equalsIgnoreCase(Object o)
		System.out.println(c.equalsIgnoreCase(a));//true
		
		
	//5 public boolean IsEmpty()
		
		String s8 = "";
		String si = "JAVA";
		System.out.println(s8.isEmpty()); //true
		System.out.println(si.isEmpty()); //false
		
	//6 public int length(String s)
		
		String s2 = "SeleNium";
		System.out.println(s2.length()); //lenght() method is only applicable for String, whereas length variable is applicable for arrays.
		
		String s3[] = {"hi", "bye"};
		System.out.println(s3.length); //lenght is used to calcluate for array 
		
	//7 public String replace(char oldchar, char newchar)
		
		String s4 = "JAVA";
		System.out.println(s4.replace('A', 'I'));
		System.out.println(s4.replaceAll(s4, "SELENIUM"));
	
    //8 public String substring(int beginindex)
		
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2, 5));
		
    //9 public int indexOf(char ch)
		
        System.out.println(s4.indexOf('V'));
        
     //10 public int lastIndexOf(char ch)
        
        System.out.println(s4.lastIndexOf('A'));
        
      //11 public String toLowerCase(String s)
        
        System.out.println(s2.toLowerCase());
        
      //12 public String toUpperCase(String s)
        
        System.out.println(s2.toUpperCase());
        
       //13 public String trim() //trim() method removes space only from starting or ending of the string not in the middle of the string.
        
        String s7 = "  Hyderabad";
        System.out.println(s7.toUpperCase().trim());
	}

}
