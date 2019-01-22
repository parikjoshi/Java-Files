abstract class Animal
{
void run()
{
System.out.println("Animals are in the jungle ");
}
abstract void fast();
void walk()
{
System.out.println("Animals are walking");
}
}
class dog extends Animal
{
void fast()
{
System.out.println("Dog is barking");
}
}
class test11
{
public static void main(String []args)
{
Animal a=new dog();
a.fast();
a.walk();
a.run();
}
}