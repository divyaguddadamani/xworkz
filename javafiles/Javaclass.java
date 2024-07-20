class Javaclass{
public static void info(String name,String add,byte age, short sal,double weight){
	
	System.out.println("name:"+name);
		System.out.println("add:"+add);
			System.out.println("age:"+age);
				System.out.println("sal:"+sal);

	
}
public static void main(String[] args){
	
	byte temp=22;
	
	System.out.println("run");
	info("divya","gkk",(byte)22,(short)2000, 52.35f);
}
}