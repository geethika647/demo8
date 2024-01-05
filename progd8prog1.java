//JAVA PROGRAM TO DEMOSTRATE THE USE OF STATIC VARIABLE
class Student7
{
int id;
String name;
static String college =" mtiet";
Student7(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+" "+name+" "+college);
}
public static void main(String args[])
{
Student7 s1=new Student7(111,"aryan");
Student7.college="Mtie";
s1.display();
}
}

