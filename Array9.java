import java.util.Scanner;
public class Array9
{
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter rows ");
int rows = s.nextInt(); 
System.out.println("Enter columns ");
int cols = s.nextInt(); 

int [][] first = new int[rows][cols];

System.out.println("Enter Values of array row wise");

for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
first[i][j] = s.nextInt();
}
}
int sum=0;
for(int i=0;i<rows;i++)
{
   for(int j=0;j<cols;j++)
     {
       System.out.print(first[i][j] + " ");
       if(i+j==(row-1))
        {
           sum=sum+first[i][j];	
        }
      }
}	  
System.out.println("sum is -  "+sum);
}
}

