
public class FinalVsImmutabiltyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here final is applied for StringBuffer object, so final effect is not going to show on this object.
		//bcz final is applied only for variables, whereas immutability concept is applied for objects.
		
		final StringBuffer s = new StringBuffer("Durga");
		s.append("Software");
		System.out.println(s);
	

	}

}
