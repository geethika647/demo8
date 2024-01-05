//STATIC NESTED CLASS
class TestOuter1
{
static int data=80;
static class Inner
{
static void msg()
{
System.out.println("data is "+data);
}
}
public static void main(String args[])
{
TestOuter.Inner obj=new TestOuter.Inner();
TestOuter1.Inner.msg();//no need to createthe instance of static nested class
}
}