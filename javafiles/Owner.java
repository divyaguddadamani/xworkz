class Owner
{

String name;
int age;
char gender;

Owner()
{
System.out.println("run ");
}
Owner(String name, int age,char gender)
{

this.name=name;
this.age=age;
this.gender=gender;

}
public void display()
{
	System.out.println("NAME:"+name);
	System.out.println("AGE:"+age);
	System.out.println("GENDER:"+gender);
}

}