package Stringp;

public class stringBuffer {
	public static void main(String[] args) {
		StringBuffer sbf =new StringBuffer("mani");
		sbf.append(" kumar");
		//sbf.reverse();
		sbf.replace(2, 4, "vine");
		
		System.out.println(sbf);
		StringBuilder sb=new StringBuilder("ms");
		sb.append(" dhoni");
		sb.deleteCharAt(4);
		
		System.out.println(sb);
		StringBuffer sbf2 =new StringBuffer("WELCOME");
		//sbf2.insert(2, "hi");
		//sbf2.delete(2,4);
	    sbf2.substring(3);
		System.out.println(sbf2);
		StringBuffer sbf3 =new StringBuffer("java");
		sbf3.substring(1);
		System.out.println(sbf3);
		
	}

}
