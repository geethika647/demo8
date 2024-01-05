//PRIVATE PUBLIC THROUGH FOR LOOP
import java.util.Scanner;
class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public   int getId()
{
return  this.id;
}
public   String getName()
{
return this.name;
}
}
class Testarray1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
Student[] sob=new Student[5];
for(int i=0;i<5;i++)
{
sob[i]=new Student();
sob[i].setId(scob.nextInt());
sob[i].setName(scob.next());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++)
{
System.out.println("ID:"+sob[j].getId());
System.out.println("Name:"+sob[j].getName());
}
}
}
