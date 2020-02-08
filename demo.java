class A 
{
int i,j;
A(int a,int b)
{
i=a;
j=b;
}
void show()
{
System.out.println("the value of i:"+i);
System.out.println("the value of j:"+j);
}
}
class B extends A
{
int k;
B(int a,int b,int c)
{
k=c;
}
void show()
{
System.out.println("the value of k:"+k);
}
}
class demo
{
public static void main(String args[])
{
B b=new B(10,20,30);
b.show();
}
}