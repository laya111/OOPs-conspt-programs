 class Branh
{
    private int	bId;
    private String Bname;
     public void bInfo()
{
 System.out.println("Branch details:");
 System.out.println("Branch id"+bId);

}
class Acc_Info extends Branch
{
   int accNo;
String accName;
 static String ifsc;
 static String branch;
String add;
public void get_info()
 
{

   accNo=28390;
  accName="Laya";
  ifsc="Bk0075";
    branch="Shubhash_chowk";
   add="plotNo/298/1 Nilam Shramajivi nagar,Solapur 413006";	
}
void disp_data
{
	System.out.println("********Account details******");
    System.out.println("Account No.:"+accNo);
   System.out.println("Account Name.:"+accName);
  System.out.println("Ifsc code:"+ifsc);
  System.out.println("Branch:"+branch);
    System.out.println("Address:"+add);
}
  }
    class Banks
     {
	  public static void main(String args[])
	{
     	  Acc_Info ac=new Acc_Info();
	  ac.get_info();
	  ac.disp_data();
  	}
     }

