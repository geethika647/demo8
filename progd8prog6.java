//STATIC NESTED CLASS
class TestOuter
{
static int data=80;
static class Inner
{
void msg()
{
System.out.println("data is "+data);
}
}
public static void main(String args[])
{
TestOuter.Inner obj=new TestOuter.Inner();
obj.msg();
}
}