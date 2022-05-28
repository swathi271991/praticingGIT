
public class StringBUFFERCONCEPTAndConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//when there is frequent modification done on the content then go for stringBuffer concept bcz even though we change the content 100000 times only 1 object will be creared
		//when there is no change in the content of the string then go for STRING concept.
		
		String s = new String("swathi");
		StringBuffer sb = new StringBuffer("swathi");
		StringBuffer su = new StringBuffer(s);
		System.out.println(s.equals(sb)); //both are not same
		System.out.println(s.equals(sb));
		System.out.println(sb.capacity());
		
		//1  StringBuffer sb1 = new StringBuffer();
		
		StringBuffer sb1 = new StringBuffer(); //default empty StringBuffer() constructor capacity is 16 if we add more than 16 characters then (CC+1)*2
		System.out.println(sb1.capacity());
		sb1.append("fghjkl;lkjhgfghjkl;lkjhgfddghjkl;'lkjhgfdhjkl;';lkjhgf");
		System.out.println(sb1.capacity());
		
		//2 StringBuffer sb1 = new StringBuffer(int initialCapacity);
		StringBuffer sb2 = new StringBuffer(1000);
		System.out.println(sb2.capacity());
		
		//3 StringBuffer sb1 = new StringBuffer(String s); HERE INITIAl capacity formula is  = s.lenght+16
		
		StringBuffer sb3 = new StringBuffer("Swathi");
		System.out.println(sb3.capacity()); //22
		
		
		
		
		
		
		
	
		
	}

}
