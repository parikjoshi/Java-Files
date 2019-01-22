class parminder
{
void fname()
{
System.out.println("My first name is...");
}
}

class kaur extends parminder
{
void mname()
{
System.out.println("My mname is...");
}
}

class joshi extends parminder
{
void lname()
{
System.out.println("my lname is...");
}
}

public class name2
{
public static void main(String [] args)
{
joshi j=new joshi();
kaur k=new kaur();
{
j.fname();
k.mname();
j.lname();
}
}
}