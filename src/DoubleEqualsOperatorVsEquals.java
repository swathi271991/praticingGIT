public class DoubleEqualsOperatorVsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//   Object(class)  (equals method present defined in Object class and its is meant for reference/address comparison)
		//         |
		//     ---------
		//     |        |
		//   String    StringBuffer (StringBuffer doesn't over ride equals method so it is also meant for reference/address comparison only)
		// (String class overrides equals method present in Object class and its meant for content comparison)

		// Here String is only literal, the object is created in String Constant Pool memory.
		
		String s11 = "Swathi";
		String s13 = "Swathi";
		
		System.out.println(s11==s13); //TRUE
		System.out.println(s11.equals(s13)); //TRUE
		         
		//when new keyword is used then object is created in heap memory mainly and  a copy is created in SCP memory for future reusable purpose.
		
		String s1 = new String("Swathi"); //s1 is new object 
		String s2 = new String("Swathi"); //s2 is new object 
		
		System.out.println(s1==s2); //here reference is compared (FALSE)
		System.out.println(s1.equals(s2)); //here content is compared bcz equals method is overrided (TRUE)
		
		
		StringBuffer s12 = new StringBuffer("Swathi"); //s12 is new object
		StringBuffer s22 = new StringBuffer("Swathi");//s22 is new object 
		
		System.out.println(s12==s22); //here reference is compared  (FALSE)
		System.out.println(s12.equals(s22)); //here also reference is only compared bcz equals method is not overrided (FALSE) and object class equals method is only executed by default.
		
				

	}

}
