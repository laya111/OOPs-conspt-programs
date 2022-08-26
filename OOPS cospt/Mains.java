return class Name
{
	private int age;
 	public int getAge()
{
	return age;
}
	public void setAge(int age)
{	
	this.age=age;
}
 
 	 
}

 class Mains
{
 public static void main(String []args)
{
	Name n=new Name();
 	n.setAge(19);
	System.out.println("Age :"+n.getAge());
 }
}
