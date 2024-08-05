
class Projector{
	
	String company;
	String type="LCD";
	String color;
	double weight;
	
	public Projector(String company){
		
		this.company=company;
	}
	
	public void setProjector(String color){
		
		this.color=color;
	}
	
	public void print(){
		
		System.out.println("Projector company:"+this.company);
		System.out.println("Projector type:"+this.type);
		System.out.println("Projector color:"+this.color);
		System.out.println("Projector weight:"+this.weight);
		System.out.println("------------------------------");
	}
	
	
}