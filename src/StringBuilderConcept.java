
public class StringBuilderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Every method present inside StringBuffer is Synchronized this is the disadvantage, In which at a time only 1 thread can operate which makes performance slow
		//For MultiThread concept StringBuffer will not be used. SO thread safety is present.
		
		//StringBuilder is used in MultiThread concept
		//Every method in StringBuilder is NonSynchronized, all the methods in the StringBuffer is same in StringBuilder as well.
		//Here multple threads can access the methods in StringBuilders simultaneously. No Thread safe
		

		
		//**************** String, StringBuffer are thread safe and synchronized
		// StringBuilder is not synchronized
		
	//	METHOD CHAINING: 
    // ---------------
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("swathi").append("chaganti").reverse().insert(2, "shreyanvi").delete(3, 7);
		System.out.println(sb);
		
		
			
			
	}

}
