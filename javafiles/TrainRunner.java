class TrainRunner{
	public static void main(String[] args){
		System.out.println("running main method in TrainRunner");

		Train.Book("Bengaluru","Gokak");
		Train.Book("Bengaluru","Gokak",2);
		Train.Book("Bengaluru","Gokak",2,750.53);
		Train.Cancle(25);
		Train.Cancle("Bengaluru","Gokak");

		}
}