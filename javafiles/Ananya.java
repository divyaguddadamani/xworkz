class Ananya
{

Knife knife;
long mobileNo;

Ananya(Knife knife,long mobileNo)
{
	
	this.knife=knife;
	this.mobileNo=mobileNo;
	
}
public void details()
{
	System.out.println("mobileNo:"+mobileNo);
	knife.details();
	
}

}