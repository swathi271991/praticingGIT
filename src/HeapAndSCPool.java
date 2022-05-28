public class HeapAndSCPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for every STring new object a new object got created in heap area and a copy is created in SCP
		//for every string literal a new object is created in SCP area.

		 /* String s = new String("durga");
		s.concat("solutions");
		System.out.println(s);
		s = s.concat("Hitech SOFTWARE");
		System.out.println(s);
		
		
		String s1 = new String("Spring");
		s1.concat("fall");
		String s2 = s1.concat("comparision");
		s2.concat("summer");
		System.out.println(s1);
		System.out.println(s2); */
		
		
		String s1 = new String("you cannot change me");
		String s2 = new String("you cannot change me");
		
		System.out.println(s1==s2); //false
		
		String s3 = "you cannot change me";
		
		System.out.println(s1==s3);// false
		
		String s4 = "you cannot change me";
		
		System.out.println(s3==s4); //true
		
		String s5 = "you cannot" + " change me";
		
		System.out.println(s4==s5); //true
		
		String s6 = "you cannot";
		
		String s7 = s6 + " change me";
		
		System.out.println(s4==s7); //false
		
		final String s8 = "you cannot";
		
		String s9 = s8 + " change me";
		
		System.out.println(s4==s9);//true
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
