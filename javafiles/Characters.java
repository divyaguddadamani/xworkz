class Characters{
	public static void main(String[] args){
		char vowel='a';
		char character1='b';
		char character2='e';
		char character3='g';
		char character4='k';
		char character5='l';
		char character6='t';
		char upperLetter='Z';
		char upperLetter1='I';
	    char lowerletter='w';
		char lowerletter1='m';
		char bloodGroup1='O';
		char bloodGroup2='B';
		char bloodGroup3='A';
		char gender='F';
		char gender2='M';
		char letter1='c';
		char consonant='d';
		char alphabet='h';
		char letter2='p';
		 
		 char character[]={vowel,character1,letter1,consonant,character2,letter2,character3,alphabet,upperLetter1,gender,gender2,character4,lowerletter1,bloodGroup1
		 ,character5,upperLetter,bloodGroup2,character6,lowerletter,bloodGroup3};
		 
		 int no=character.length;
		 System.out.println("total no of character is:"+no);
		 for(int i=0;i<character.length;i++)
		{
			System.out.println(character[i]);
		}
	}
	}