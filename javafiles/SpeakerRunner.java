class SpeakerRunner{

public static void main(String[] args)
{
	
	
Speaker speaker=new Speaker(12);
speaker.output=15;
speaker.setbrand("samsung");
speaker .display();

Speaker speaker1=new Speaker(3);
speaker1.color="white";
speaker1.output=16;
speaker1.setbrand("hp");
speaker1.display();

Speaker speaker2=new Speaker(14);
speaker2.color="blue";
speaker2.output=17;
speaker2.setbrand("lenovo");
speaker2.display();




}
}