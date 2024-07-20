class Train
{
	
    public static void Book(String source,String destination){
		System.out.println("running Book method in Train");
		System.out.println("source:"+source);
		System.out.println(" destination:"+ destination);

}
		public static void Book(String source,String destination,int quantity){
			System.out.println("running Book method in Train");
			System.out.println("source:"+source);
			System.out.println(" destination:"+ destination);
			System.out.println("quantity"+quantity);
		}
		public static void Book(String source,String destination,int quantity,double price){
			System.out.println("running Book method in Train");
			System.out.println("source:"+source);
			System.out.println(" destination:"+ destination);
			System.out.println("quantity:"+quantity);
			System.out.println("price:"+price);
		
}

		public static void Cancle(int ticketNo){
		System.out.println("running Book method in Train");
		System.out.println("TicketNo:"+ticketNo);
}
		public static void Cancle(String source,String destination){
		System.out.println("running Book method in Train");
		System.out.println("source:"+source);
		System.out.println(" destination:"+ destination);
		}
}