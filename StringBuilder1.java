class  StringBuilder1{
	public static void main (String[] args) {
StringBuilder sb=new StringBuilder("Hello");
sb.append(" java");
System.out.println(sb);
StringBuilder sb1=new StringBuilder("Hello");
sb1.insert(1,"java");
System.out.println(sb1);
StringBuilder sb2=new StringBuilder("Hello");
sb2.replace(1,3,"java");
System.out.println(sb2);
StringBuilder sb3=new StringBuilder("hello");
sb3.delete(1,3);
System.out.println(sb3);
StringBuilder sb4=new StringBuilder("hello");
sb4.reverse();
System.out.println(sb4);
}
}