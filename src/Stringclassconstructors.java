
public class Stringclassconstructors {
	
	public static void main(String[] args)
	{
		
		//these are the 6 constructors present in STRING class.
	
	String a = new String();
	
	String b = new String("ABC");
	
	StringBuffer sb = new StringBuffer("HI");
	String c = new String(sb);
    c.concat("Hello");
	sb.append("  Bollo");
    System.out.println(c);
    System.out.println(sb);
    
    
    StringBuilder sib = new StringBuilder("Name");
    String d = new String(sib);
    d.concat("Hello");
	sib.append("  Bollo");
    System.out.println(d);
    System.out.println(sib);
    
    
    char[] ch = {'j','a','v','a'};
    String sub = new String(ch);
    System.out.println(sub);
    
    
    byte bi[]  = {97,98,99,100};
    String bil = new String(bi);
    System.out.println(bil);
    
	}
    
    
}
