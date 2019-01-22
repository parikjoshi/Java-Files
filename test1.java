class A
{
void getdata(int a,int b)
{
int add();
System.out.println("Super Class Method is :");
return (a+b);
}
}
class B extends A
{
int mul();
System.out.println("sub Class Method is :");
return (a*b);
}
class test1
{
public static void main(String args[])
{
B.ob=new B();
int add,mul;
ob.getdata(5,3);
add=ob.add();
mul=ob.mul();
System.out.println("Addition is"+add());
System.out.println("Multiplication is"+mul());
}
}
