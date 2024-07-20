class Palace{

public static void main(String[] palaceInfo)
{
	
	if(palaceInfo.length==4){
 String name= palaceInfo[0];
 String location=palaceInfo[1];
 String builtBy=palaceInfo[2];
 String builtYear=palaceInfo[3];
 
  System.out.println("Name:"+name);
  System.out.println("Location:"+location);
  System.out.println("BuiltBy:"+builtBy);
  System.out.println("BuiltYear:"+builtYear);

	}else
	{
	System.out.println("atleast 4 items are needed");
	}
 
 
}
}