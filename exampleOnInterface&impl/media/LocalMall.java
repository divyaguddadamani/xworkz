package com.xworkz.media;

public class LocalMall  {
	private MallRule mallRule;

	

	public void setMallRule(MallRule mallRule) {
		this.mallRule = mallRule;
	}
	
	public void bill()
	{
		System.out.println("run bill in Localmall");
		if (mallRule!=null)
		{
			System.out.println("bill is not null");
			mallRule.validId();
		}
		else
		{
			System.out.println("bill is null");
		}
	}
	

}
