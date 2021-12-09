package Static;

public class StringSample {
	
	public static void string() {
		String str="hello";
		String str2= new String("hello");
		 System.out.println(str.indexOf(str2));
		 System.out.println(str2.concat("water"));
		 System.out.println(str.lastIndexOf(4));
	}
	public static void main(String[] args) {
		String name1="mani";
		String name2="mani";
		String s=new String("mani");
		System.out.println(name1);
		
		System.out.println(name2.charAt(3));
		System.out.println(name1.contentEquals(name2));
		System.out.println(name2.equals(s));
		System.out.println(name2==s);
		StringSample sa=new StringSample();
		sa.string();
	}

}
