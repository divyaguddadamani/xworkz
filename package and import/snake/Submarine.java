package com.xworkz.snake;

public class Submarine {
	
	 String name;
     String type;
     double length;
     double width;
     double height;
     int gravity;
     int capacity;
     double maxDepth;
     double displacement;
     int pressure;
     String countryOfOrigin;
     boolean isNuclearPowered;
     double speed;
     String armament;
     boolean isStealthCapable;
     String sonarType;
     String communicationSystem;
     double endurance;
     String hullMaterial;
     String operatingDepth;
     String radarType;
     boolean hasTorpedoSystem;
     int numberOfMissiles;
     boolean hasMineLayingCapability;
     String electronicWarfareSystem;
     double lengthOfService;
     boolean hasRescueSystem;
     String onboardComputerSystem;
     boolean hasAntiSubmarineWarfare;
     String thermalSignature;
     boolean hasNuclearMissiles;
     String navigationSystem;
     boolean isSubmersible;
     double batteryLife;
     boolean hasPeriscope;
     String combatSystem;
     boolean isAutonomous;
     int numberOfEscapePods;
     String paintType;
     String refitSchedule;
     
     
    public Submarine(String name, String type, double length, double width, double height) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }

   
    public void Runner(int gravity,int capacity,double maxDepth,double displacement,int pressure,
    String countryOfOrigin,boolean isNuclearPowered, double speed, String armament,boolean isStealthCapable,String sonarType,
    String communicationSystem,double endurance,String hullMaterial,String operatingDepth,String radarType,boolean hasTorpedoSystem,
    int numberOfMissiles,
    boolean hasMineLayingCapability,String electronicWarfareSystem,
    double lengthOfService,
    boolean hasRescueSystem,
    String onboardComputerSystem,
    boolean hasAntiSubmarineWarfare,
    String thermalSignature,
    boolean hasNuclearMissiles,
    String navigationSystem,
    boolean isSubmersible,
    double batteryLife,
    boolean hasPeriscope,
    String combatSystem,
    boolean isAutonomous,
    int numberOfEscapePods,
    String paintType,
    String refitSchedule) 
    { 
    	this. gravity =  gravity;
    
    	this.capacity = capacity; 
   
    	this.maxDepth = maxDepth;
    
    
    	this.displacement = displacement; 
    	this.pressure = pressure; 
    
    	this.countryOfOrigin = countryOfOrigin; 
    
    	this.isNuclearPowered = isNuclearPowered; 
    
    	this.speed = speed; 
   
    	this.armament = armament;
     
    	this.isStealthCapable = isStealthCapable; 
    
    	this.sonarType = sonarType; 
    
    	this.communicationSystem = communicationSystem; 
     
    	this.endurance = endurance; 
     
    	this.hullMaterial = hullMaterial;
   
    	this.operatingDepth = operatingDepth; 
    
    	this.radarType = radarType; 
    
    	this.hasTorpedoSystem = hasTorpedoSystem; 
    
    	this.numberOfMissiles = numberOfMissiles; 
     
    	this.hasMineLayingCapability = hasMineLayingCapability; 
     
    	this.electronicWarfareSystem = electronicWarfareSystem; 
   
    	this.lengthOfService = lengthOfService;
     
    	this.hasRescueSystem = hasRescueSystem; 
    
    	this.onboardComputerSystem = onboardComputerSystem;
    
    	this.hasAntiSubmarineWarfare = hasAntiSubmarineWarfare;
    
    	this.thermalSignature = thermalSignature; 
     
    	this.hasNuclearMissiles = hasNuclearMissiles; 
     
    	this.navigationSystem = navigationSystem; 
     
    	this.isSubmersible = isSubmersible; 
     
    	this.batteryLife = batteryLife; 
    
    	this.hasPeriscope = hasPeriscope; 
    
    	this.combatSystem = combatSystem; 
     
    	this.isAutonomous = isAutonomous; 
    
    	this.numberOfEscapePods = numberOfEscapePods;
    	this.paintType = paintType;
    	this.refitSchedule = refitSchedule;
    }

   
    public void print() 
    {
        System.out.println("name " +this. name);
        System.out.println("type:"+ this.type );
        System.out.println("length:"+this.length);
        System.out.println("width:"+this.width );
        System.out.println("height:"+this.height );  
        System.out.println( "gravity:"+this.gravity);
        System.out.println("capacity:"+this.capacity );
        System.out.println( "maxDepth:"+this.maxDepth);
        System.out.println( "displacement:"+this.displacement);
        System.out.println( "pressure:"+this.pressure ); 
        System.out.println( "countryOfOrigin:"+this.countryOfOrigin);
        System.out.println("isNuclearPowered:"+this.isNuclearPowered );
        System.out.println("speed:"+this.speed );
        System.out.println( "armament:"+this.armament);
        System.out.println("isStealthCapable:"+this.isStealthCapable);
        System.out.println("sonarType:"+this.sonarType);
        System.out.println("communicationSystem:"+this.communicationSystem);
        System.out.println( "endurance:"+this.endurance);
        System.out.println("hullMaterial:"+this.hullMaterial);
        System.out.println("operatingDepth:"+this.operatingDepth);
        System.out.println(  "radarType:"+this.radarType);
        System.out.println("hasTorpedoSystem:"+this.hasTorpedoSystem );
        System.out.println("numberOfMissiles:"+this.numberOfMissiles);
        System.out.println("hasMineLayingCapability:"+this.hasMineLayingCapability);
        System.out.println( "electronicWarfareSystem:"+this.electronicWarfareSystem);
        System.out.println("lengthOfService:"+this.lengthOfService);
        System.out.println("hasRescueSystem:"+this.hasRescueSystem);
        System.out.println("onboardComputerSystem:"+this.onboardComputerSystem );
        System.out.println( "hasAntiSubmarineWarfare:"+this.hasAntiSubmarineWarfare);
        System.out.println("thermalSignature:"+this.thermalSignature);
        System.out.println( "hasNuclearMissiles:"+this.hasNuclearMissiles);
        System.out.println( "navigationSystem:"+this.navigationSystem );
        System.out.println("isSubmersible:"+this.isSubmersible);
        System.out.println("batteryLife:"+this.batteryLife);
        System.out.println("hasPeriscope:"+this.hasPeriscope );
        System.out.println("combatSystem:"+this.combatSystem);
        System.out.println("isAutonomous:"+this.isAutonomous);
        System.out.println("numberOfEscapePods:"+this.numberOfEscapePods);
        System.out.println("paintType:"+ this.paintType);
        System.out.println("refitSchedule:"+this.refitSchedule);
        
    }


}
