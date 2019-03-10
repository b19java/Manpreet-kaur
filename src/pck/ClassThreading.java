package pck;


class MyThread1 extends Thread
{
public void run()
{
//try
//{
for(int i=1;i<=10;i++)
{
System.out.println(Thread.currentThread().getName());

/*if(i==5)
Thread.sleep(10000);
*/}
}
}
//catch(InterruptedException e)
//{}

//}

class MyThread2 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
}
 class ClassThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.setName("MyThread1");
		t2.setName("MyThread2");
		t1.start();
		t2.start();
	}

}
