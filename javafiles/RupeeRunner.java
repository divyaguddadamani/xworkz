class RupeeRunner{


public static void main(String[] args){

	System.out.println("run main method");

	
	Rupee rupee=new Rupee();
	String ref1=rupee.material;
	double ref2=rupee.costToPrepare;
	String ref3=rupee.shape;
	System.out.println("material:" +ref1);
	System.out.println("costToPrepare:" +ref2);
	System.out.println("shape:" +ref3);
	
	System.out.println("==============");
	
	Ac ac=new Ac();
	String Brand=ac.brand;
	double Price=ac.price;
	String Quality=ac.quality;
	System.out.println("material:" +Brand);
	System.out.println("costToPrepare:" +Price);
	System.out.println("shape:" +Quality);
	
	System.out.println("==============");
	
	Rikshaw rikshaw=new Rikshaw();
	String name=rikshaw.name;
	int age=rikshaw.age;
	int autoNo=rikshaw.autoNo;
	System.out.println("name:" +name);
	System.out.println("age:" +age);
	System.out.println("autoNo:" +autoNo);
	
	System.out.println("==============");
	
	Autodriver autodrive=new Autodriver();
	String atuoDriverName=autodrive.atuoDriverName;
	double charge=autodrive.charge;
	int ages=autodrive.ages;
	System.out.println("atuoDriverName:" +atuoDriverName);
	System.out.println("charge:" +charge);
	System.out.println("age:" +ages);
	
	System.out.println("==============");
	
	Rapido rapido=new Rapido();
	String driverName=rapido.driverName;
	String vehicle=rapido.vehicle;
	float charges=rapido.charges;
	System.out.println("driverName:" +driverName);
	System.out.println("vehicle:" +vehicle);
	System.out.println("charge:" +charges);

	System.out.println("==============");
	
	Cab cab=new Cab();
	int cabno=cab.cabno;
	double cabCharge=cab.cabCharge;
	String cabDriverName=cab.cabDriverName;
	System.out.println("cabno:" +cabno);
	System.out.println("cabCharge:" +cabCharge);
	System.out.println("cabDriverName:" +cabDriverName);
	
	System.out.println("==============");
	
	BMTC bmtc=new BMTC();
	int busNo=bmtc.busNo;
	int totalSeats=bmtc.totalSeats;
	String conductorName=bmtc.conductorName;
	System.out.println("busNo:" +busNo);
	System.out.println("totalSeats:" +totalSeats);
	System.out.println("conductorName:" +conductorName);
	
	System.out.println("==============");
	
	FoodDeliveryCmp food=new FoodDeliveryCmp();
	String appName=food.appName;
	int totalFoods=food.totalFoods;
	double foodPrice=food.foodPrice;
	System.out.println("appName:"+appName);
	System.out.println("totalFoods:" +totalFoods);
	System.out.println("foodPrice:" +foodPrice);
	
	System.out.println("==============");
	
	Matrimony matrimony=new Matrimony();
	int MatrimonyId=matrimony.MatrimonyId;
	String biodata=matrimony.biodata;
	String candidateName=matrimony.candidateName;
	System.out.println("MatrimonyId:"+MatrimonyId);
	System.out.println("biodata:" +biodata);
	System.out.println("candidateName:" +candidateName);
	
	System.out.println("==============");
	
	Applications applications=new Applications();
	String AppName=applications.AppName;
	int Storage=applications.Storage;
	String info=applications.info;
	System.out.println("AppName:"+AppName);
	System.out.println("Storage:" +Storage);
	System.out.println("info:" +info);
	
	System.out.println("==============");
	
	Jucies jucies=new Jucies();
	String type=jucies.type;
	int quantity=jucies.quantity;
	double juicePrice=jucies.juicePrice;
	System.out.println("type:"+type);
	System.out.println("quantity:" +quantity);
	System.out.println("juicePrice:" +juicePrice);
	
	System.out.println("==============");
	
	Alcohol alcohol=new Alcohol();
	String alcoholName=alcohol.alcoholName;
	int alcoholQuantity=alcohol.alcoholQuantity;
	double alcoholprice=alcohol.alcoholprice;
	System.out.println("alcoholName:"+alcoholName);
	System.out.println("alcoholQuantity:" +alcoholQuantity);
	System.out.println("alcoholprice:" +alcoholprice);
	
	System.out.println("==============");
	
	Candy candy=new Candy();
	String candyName=candy.candyName;
	int noOfCandy=candy.noOfCandy;
	double candyPrice=candy.candyPrice;
	System.out.println("candyName:"+candyName);
	System.out.println("noOfCandy:" +noOfCandy);
	System.out.println("candyPrice:" +candyPrice);
	
	System.out.println("==============");
	
	Fruit fruits=new Fruit();
	String fruitName=fruits.fruitName;
	float fruitprice=fruits.fruitprice;
	int quantities=fruits.quantities;
	System.out.println("fruitName:"+fruitName);
	System.out.println("fruitprice:"+fruitprice);
	System.out.println("fruitquantity:"+quantities);
	
	System.out.println("==============");
	
	Medicines medicines=new Medicines();
	String mName=medicines.mName;
	int mQuantity=medicines.mQuantity;
	double mPrice=medicines.mPrice;
	System.out.println("mName:"+mName);
	System.out.println("mQuantity:"+mQuantity);
	System.out.println("mPrice:"+mPrice);
	
	System.out.println("==============");
	
	Place places=new Place();
	String placeName=places.placeName;
	int pincode=places.pincode;
	String history=places.history;
	System.out.println("placeName:"+placeName);
	System.out.println("pincode:"+pincode);
	System.out.println("history:"+history);
	
	System.out.println("==============");
	
	Foody foody=new Foody();
	String fName=foody.fName;
	int fQuantity=foody.fQuantity;
	double Fprice=foody.Fprice;
	System.out.println("fName:"+fName);
	System.out.println("fQuantity:"+fQuantity);
	System.out.println("Fprice:"+Fprice);
	
	
}
}