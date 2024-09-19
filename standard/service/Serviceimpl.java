package com.xworkz.standard.service;

import com.xworkz.standard.repository.Repository;

public class Serviceimpl implements Service{
	
	private Repository repository;
	

	public void setRepository(Repository repository) {
		this.repository = repository;
	}



	@Override
	public String push() {
		System.out.println("run push in Serviceimpl");
		if(repository!=null)
		{
			System.out.println("repo is not null");
			boolean store=repository.save();
			
			
			if(store)
			{
				System.out.println("store in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return "issue";
	}

}
