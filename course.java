abstract class Student
{
abstract void details();
}
class name extends Student
{
void details()
{
System.out.println("Student name is Parminder kour ");
}
}
class Roll extends Student
{
void details()
{
System.out.println("Student Roll is 15222 ");
}
}
class course extends Student
{
void details()
{
System.out.println("Student course is Android ");
}
}
class test
{
public static void main(String []args)
{
Student s=new course();
s.details();
}
}