class Compani{
int id;
String cname;
String location;
SE se=new SE("darshan",2,"trainee",20000);

Compani()
{
System.out.println("run");
}
Compani(int id,String cname,String location)
{
	this.id=id;
	this.cname=cname;
	this.location=location;
}
public void show(){
System.out.println("id:"+this.id);
System.out.println("cname:"+this.cname);
System.out.println("location:"+this.location);
this.se.show();
}


}