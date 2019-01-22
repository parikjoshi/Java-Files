abstract class Student
{
abstract void name();
}
class girl extends Student
{
void name()
{
System.out.println("Student name is Parminder kour");
}
public static void main(String []args)
{
Student s=new girl();
s.name();
}
}