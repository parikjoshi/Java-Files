class demo
{
void add(int a,int b)
{
System.out.println(a+b);
}
}

public class wrapper1
{
public static void main(String[]args)
{
demo d = new demo();
Integer a=new Integer(10);
Integer b=new Integer(20);
d.add(a,b);
}
}