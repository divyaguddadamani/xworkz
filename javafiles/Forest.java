class ForestRunner{

public static void main(String[] forestInfo)
{
	
	if(forestInfo.length==4){
 String name= forestInfo[0];
 String area=forestInfo[1];
 String establishyear=forestInfo[2];
 String state=forestInfo[3];
 
  System.out.println("Name:"+name);
  System.out.println("Area:"+area);
  System.out.println("Establishyear:"+establishyear);
  System.out.println("State:"+state);

	}else
	{
	System.out.println("atleast 4 items are needed");
	}
 
 
}
}