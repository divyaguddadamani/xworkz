class PaperRunner{
	
	public static void main(String[] args){
		
		Paper paper=new Paper("A2");
		paper.setPaper("good");
		paper.thickness=1;
		paper.print();
		
		Paper paper1=new Paper("A3");
		paper1.setPaper("transparent");
		paper1.thickness=2;
		paper1.color="brown";
		paper1.print();
		
		
		Paper paper2=new Paper("A4");
		paper2.setPaper("thick");
		paper2.thickness=1.5;
		paper2.color="gray";
		paper2.print();
	}
	
}