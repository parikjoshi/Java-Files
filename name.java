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

public class name
{
public static void main(String [] args)
{
kaur k=new kaur();
{
k.fname();
k.mname();
}
}
}