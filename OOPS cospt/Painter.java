interface Shape{
	void area(); 
	void perimeter();
}
 class Circle implements Shape{
	private int r;
	public Circle(int r){
	this.r=r;
}
 	public void area(){
	double area1=3.14*r*r; 
	System.out.println("\nArea of circle: "+area1);
	} 
	public void perimeter(){
	double peri1=3.14*(r+r);
	System.out.println("Perimeter of circle: "+peri1);
     }
   }
 	class Rectangle implements Shape{
	private int length, breadth; 
	public Rectangle(int length, int breadth){
	this.length=length;
	this.breadth=breadth;
   }
 public void area(){
  double area2=length*breadth; 
 System.out.println("\nArea of rectangle :"+area2);
} 
 public void perimeter(){
 double peri2=2*(length+breadth);
 System.out.println("Perimeter of rectangle: "+peri2);
      }
}
    class Square implements Shape{
 	  private int side;
 	  public Square(int side){
  	  this.side=side;
	}
   public void area(){
   double area3=(side*side); 
    System.out.println("\n\nArea of circle: "+area3);
}

    public void perimeter(){
	double peri3=4*side; 
     System.out.println("Perimeter of circle: "+peri3);
  } 
}
	class Painter{
	public static void main(String args[])
   {
	Shape s=new Circle(8);
	s.area();
	s.perimeter();
	s=new Rectangle(6,7);
	s.area();
	s.perimeter();
     s=new Square(6);
	s.area();
	s.perimeter();
}
   }