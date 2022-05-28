
public class Stringexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "selenium"; //String is immutable(can't be changed once created)
		String b = s.concat("Automation"); //if we try to concatinate using another string then new object will be created, 
		//if we assign a new variable then the concatinated String object will be stored in new variable else it is gone to garbage collection.
		System.out.println(s);
		System.out.println(b);
	}

}
