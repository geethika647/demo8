//PRIVATE PUBLIC THROUGH ARRAYS
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
class Testarray
{
public static void main(String args[])
{
Student[] sob=new Student[5];
sob[0]=new Student();
sob[0].setId(1111);
sob[0].setName("aryan");
System.out.println("Id:"+sob[0].getId());
System.out.println("Name:"+sob[0].getName());
sob[1]=new Student();
sob[1].setId(2222);
sob[1].setName("karan");
System.out.println("Id:"+sob[1].getId());
System.out.println("Name:"+sob[1].getName());
sob[2]=new Student();
sob[2].setId(3333);
sob[2].setName("tom");
System.out.println("Id:"+sob[2].getId());
System.out.println("Name:"+sob[2].getName());
sob[3]=new Student();
sob[3].setId(4444);
sob[3].setName("jerry");
System.out.println("Id:"+sob[3].getId());
System.out.println("Name:"+sob[3].getName());
sob[4]=new Student();
sob[4].setId(5555);
sob[4].setName("Shinchan");
System.out.println("Id:"+sob[4].getId());
System.out.println("Name:"+sob[4].getName());
}
}


