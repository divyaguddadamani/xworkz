class BloodRunner{
	public static void main(String[] args){
		
		System.out.println("running main method in BloodRunner");
		String bloodgroup=Blood.group();
		String nameOfPerson=Blood.name();
		System.out.println("NameOfPerson:"+nameOfPerson);
		double costPerPerson=Blood.cost();
		System.out.println("CostPerPerson:"+costPerPerson);
		boolean personIsSickOrNot=Blood.sick();
		System.out.println("PersonIsSickOrNot:"+personIsSickOrNot);
		boolean donateBloodOrNot=Blood.donate();
		System.out.println("DonateBloodOrNot:"+donateBloodOrNot);
		String hospitaltestreport=Blood.hospitalTest();
		System.out.println("Hospitaltestreport:"+hospitaltestreport);
	}
}