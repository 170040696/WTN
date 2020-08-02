package B;

public class Stringss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String st="hi hellow array how r you";
   String sp="hle";
   
 
   System.out.println(st);
   System.out.println(sp);
   System.out.println(st.charAt(2));
   System.out.println(st.indexOf("w"));
   System.out.println(st.lastIndexOf("e"));
   System.out.println(st.equals(sp));
   System.out.println(st.compareTo(sp));
   String b=st.substring(st.length()-6);
   System.out.println(b);
   System.out.println(b.equals(sp));
   String d="50";
   char b1=d.charAt(0);
   System.out.println(b1);
   int i=50;
   char a2[]=st.toCharArray();
   System.out.println(a2);
   
   String l1="";
   for(int j=0;j<a2.length;j++)
   {
	   l1=l1+String.valueOf(a2[j]);
	   
   }
   String r=new String(a2);
   System.out.println(r);
   String s="akanksha";
   String t="rathensh";
   String k=s.substring(s.length()-2);
   System.out.println();
   System.out.println(k);
   int a=123;
   int len=String.valueOf(a).length();
   System.out.print(len);
   String c1="tathnesh";
   String c2="rathnesh";
   int n=c1.compareTo(c2);
   System.out.print(n);
   String nag="nagen";
   StringBuilder sb=new StringBuilder(nag);
   String rev=(sb.reverse()).toString();
   System.out.print(rev);
   System.out.println();
   String m="akanksha";
   m=m.substring(m.length()-2);
   System.out.print(m);
	}

}
