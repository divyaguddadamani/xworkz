class Keybunch
{
Key key;
String material;

Keybunch(String material,Key key)
{
	this.material=material;
	this.key=key;
	
}
public void display()
{
	System.out.println("material"+material);
	key.display();
}

}