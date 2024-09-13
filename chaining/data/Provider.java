package com.xworkz.data;


public abstract class Provider {
	
	private String name;
	private String ceoName;
	
	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
		
		
	}
	public abstract void service();

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			
			if(obj instanceof Provider) {
				
				Provider provider=(Provider)obj;
				System.out.println("use instanceof to convert subclass type into parent type");
		
				if(this.name.equals(provider.name) && this.ceoName.equals(provider.ceoName))
				{
					System.out.println("check the two given ref are equal or not");
					return true;
				}
		
	}
	
}
		return super.equals(obj);
}
}
