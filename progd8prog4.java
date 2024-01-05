//JAVA PROGRAM TO GET THE CUBE OF THE GIVEN NUMBER USING THE STATIC METHOD
class Calculator
{
static int cube(int x)
{
return x*x*x;
}
public static void main(String args[])
{
int result= Calculator.cube(8);
System.out.println(result);
}
}
