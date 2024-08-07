class Ganavi{

Clip clip;
String email;

Ganavi(Clip clip,String email)
{
this.clip=clip;
this.email=email;

}
public void show(){
System.out.println("email:"+email);
clip.show();

}
}