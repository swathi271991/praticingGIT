
public class MethodsOfStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("Selenium");

		//1
		System.out.println(s.length());//8

		//2
		System.out.println(s.capacity()); //s.lenght+16 = 24

		//3
		System.out.println(s.charAt(2)); //l

		//4
		s.setCharAt(2, 'W');
		System.out.println(s); //SeWenium

		//9 Reverse method is used to reverse the string

		System.out.println(s.reverse()); //muineWeS

		//5 (to add values at the end of the string---append always adds at last
		s.append("  Automation");
		s.append("  true");
		s.append("  1");
		System.out.println(s); //SeWenium  Automation  true  1

		//6 insert is used to add some text/value in some index position.

		System.out.println(s.insert(9, "hi")); //insert adds at any specified position// SeWenium hi Automation  true  1

		//7 delete is used to delete the text/charachters from begin index to (end-1) index.

		System.out.println(s.delete(9, 11)); //SeWenium  Automation  true  1

		//8 particular character will be deleted in the specified index

		System.out.println(s.deleteCharAt(2)); //Seenium  Automation  true  1
		
		//9 public void setLength(int length) to get only 9 chacterts what ever characs more than 9 will be ignored. if less then spaces are added.
		
		StringBuffer sb = new StringBuffer("AishwaryaAbhi");
		sb.setLength(9);
		System.out.println(sb);
		
		//10 public void ensureCapacity(int capacity) if we want to increase capacity dynamically then we use ensurecapacity
		
		System.out.println(sb.capacity()); //29 (lenght of string + 16) = 29
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity()); //1000
		
		//11 public void trimToSize() //is used to save memory if we dnt want to add any more characters in the string.
		
		StringBuffer sb5 = new StringBuffer(1000); 
		System.out.println(sb5.capacity()); //1000
		sb5.append("ABC");
		sb5.trimToSize(); 
		System.out.println(sb5.capacity());//3
		
		
		
		
		
		
		
		





	}

}
