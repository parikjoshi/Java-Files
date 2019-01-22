class demo
{
void add(Integer a,Integer b)
{
System.out.println(a+b);
}
}

public class wrapper
{
public static void main(String[]args)
{
demo d = new demo();
int a=10;
int b=20;
d.add(a,b);
}
}