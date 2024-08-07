class KnifeRunner
{

public static void main(String[] args)
{
	Knife knife=new Knife(.5,.75);
	Ananya ananya=new Ananya(knife,8123791097l);
	ananya.details();
	
	Knife knife1=new Knife(.25,.5);
	Ananya ananya1=new Ananya(knife1,8867640457);
	ananya1.details();
	
}
}