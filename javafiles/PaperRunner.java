class PaperRunner{
	
	public static void main(String[] args){
		
		Paper paper=new Paper(3);
		paper.setPaper("good");
		paper.size="A2";
		paper.print();
		
		Paper paper1=new Paper(2);
		paper1.setPaper("transparent");
		paper1.size="A3";
		paper1.color="brown";
		paper1.print();
		
		
		Paper paper2=new Paper(3);
		paper2.setPaper("thick");
		paper2.size="A4";
		paper2.color="gray";
		paper2.print();
	}
	
}