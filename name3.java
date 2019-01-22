import java.util.Scanner;

class Student
{
	String name;
void Name()
{
	
Scanner s=new Scanner(System.in);
System.out.println("Enter Student Name: ");
String Name=s.nextLine();
System.out.println("student Name is : "+Name);
}
}
class S1 extends Student
{
	int Roll;
void Roll()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter S1 Roll: ");
int Roll=s.nextInt();
System.out.println("S1 Roll is : "+Roll);
}
}
public class name3
{
public static void main(String []args)
{
S1 a=new S1();
{
a.Name();
a.Roll();
}
}
}
