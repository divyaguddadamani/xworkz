
 class ProjectorRunner{
	
	public static void main(String project[]){
		
		Projector projector=new Projector("Epson");
		projector.setProjector("grey");
		projector.weight=30;
		projector.print();
		
		Projector projector1=new Projector("Samsung");
		projector1.setProjector("black");
		projector1.weight=40;
		projector1.type="Laser";
		projector1.print();
		
		Projector projector2=new Projector("hp");
		projector2.setProjector("white");
		projector2.weight=25;
		projector2.print();
	}
	}