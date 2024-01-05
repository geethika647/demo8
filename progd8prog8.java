//PRIVATE PUBLIC
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
class Test5
{
public static void main(String args[])
{
Student sob=new Student();
sob.setId(1111);
sob.setName("aryan");
System.out.println("Id:"+sob.getId());
System.out.println("Name:"+sob.getName());
Student sob1=new Student();
sob1.setId(2222);
sob1.setName("karan");
System.out.println("Id:"+sob1.getId());
System.out.println("Name:"+sob1.getName());
Student sob2=new Student();
sob2.setId(3333);
sob2.setName("tom");
System.out.println("Id:"+sob2.getId());
System.out.println("Name:"+sob2.getName());
Student sob3=new Student();
sob3.setId(4444);
sob3.setName("jerry");
System.out.println("Id:"+sob3.getId());
System.out.println("Name:"+sob3.getName());
Student sob4=new Student();
sob4.setId(5555);
sob4.setName("Shinchan");
System.out.println("Id:"+sob4.getId());
System.out.println("Name:"+sob4.getName());


}
}


