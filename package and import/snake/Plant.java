package com.xworkz.snake;

public class Plant {
	
	String name;
	int height;
	int width;
	String leafShape;
	String color;
	String roottype;
	double StemThickness;
	int lifespan;
	String seedSize;
	String fruiteColor;

	
	 public Plant(String name,int height,int width,String leafShape,String color) {
		 
		 System.out.println("created constructor with parameter");
		 this.name=name;
		 this.height=height;
		 this.width=width;
		 this.leafShape=leafShape;
		 this.color=color;
		 
	 }
	 public  void Plants(String roottype,double StemThickness,int lifespan,String seedSize,String fruiteColor)
	 {
		 this.roottype=roottype;
		 this.StemThickness=StemThickness;
		 this.lifespan=lifespan;
		 this.seedSize=seedSize;
		 this.fruiteColor=fruiteColor;

	 }
	 
	 public void print()
	 {
		 System.out.println("Name:"+this.name);
		 System.out.println("height:"+this.height);
		 System.out.println("width:"+this.width);
		 System.out.println("leafShape:"+this.leafShape);
		 System.out.println("color:"+this.color);
		 System.out.println("roottype:"+this.roottype);
		 System.out.println("StemThickness"+this.StemThickness);
		 System.out.println("lifespan:"+this.lifespan);
		 System.out.println("seedSize:"+this.seedSize);
		 System.out.println("fruiteColor:"+this.fruiteColor);
	 }
	 

}
