class Hotel
{
String Hname="panjurli";
Owner owner=new Owner("Divya",22,'f');

Hotel()
{
	System.out.println("run constructor");
}
public void display()
{
System.out.println("HOTEL NAME:"+Hname);
this.owner.display();

}
}