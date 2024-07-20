class Birds{
	public static void peacock()
	{
		System.out.println("nice");
	}
	public static void hen()
	{
		System.out.println("chicken");
		owl();
	}
	public static void owl()
	{
		System.out.println("name of bird");
		hen();
	}
	public static void crow(){
		System.out.println("cawa cawa");
		owl();
	}
}