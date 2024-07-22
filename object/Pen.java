class Pen{

String penName;
int quantity;
String penColour;
int price;

public Pen(String penName,int quantity,String penColour,int price)
{
		System.out.println("parameterised constructor is invokeing");					 

this.penName=penName;
this.quantity=quantity;
this.penColour=penColour;
this.price=price;
}

public void penAccount(){
	System.out.println("the pen Name is:" +penName);
	System.out.println("the pen quantity is:" +quantity);
	System.out.println("the pen colour is:" +penColour);
	System.out.println("the pen price is:" +price);


}
}