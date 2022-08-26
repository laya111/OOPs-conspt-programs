import java.util.Scanner;
class  Bal
{
 private int bal=1000;
 private String name;
public void set_bal( int bal)
{   
	
	this.bal=bal+this.bal;
   

}
 public int get_data()
{
    return(bal);	
}
}
 class BnkInfo
{
 public static void main(String args[])
{
 Bal b=new Bal();
Scanner sc=new Scanner(System.in);
	System.out.println("enter amount :");
	b.bal=sc.nextInt();

 
 b.get_data();

 }
}