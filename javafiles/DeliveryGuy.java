class DeliveryGuy{
	public static void deliver(String item)
	{
		System.out.println("running deliver in DliveryGuy");
		DeliveryVehicle.deliver(item,"gokak");
	}
}