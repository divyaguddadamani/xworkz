package com.xworkz.standard.service;

import com.xworkz.standard.repository.AddressRepo;

public class AddressServiceimpl implements AddressService {

	private AddressRepo addressRepo;

	public void setAddressRepo(AddressRepo addressRepo) {
		this.addressRepo = addressRepo;
	}

	@Override
	public String push() {
		System.out.println("run push in impl");
		if (addressRepo != null) {
			System.out.println("repo is not null");
			int store = addressRepo.update();

			if (store<10) {
				System.out.println("save in repo");
				return "success";
			} else {
				System.out.println("not save in repo");
				return "failure";
			}
		}

		return "issue";
	}

	@Override
	public String refresh() {
		System.out.println("run refresh in impl");
			if(addressRepo!=null)
			{
				System.out.println("repo is not null");
				boolean store=addressRepo.save();
				
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
		

	@Override
	public String remove() {
		System.out.println("run remove in impl");
		if(addressRepo!=null)
		{
			System.out.println("repo is not null");
			addressRepo.delete();
			
		}
		else {
			System.out.println("repo is  null");
			
		}
		return null;
		
	}

	@Override
	public String load() {
		System.out.println("run load in impl");
		if(addressRepo!=null)
		{
			System.out.println("repo is not null");
			String store=addressRepo.read();
			
			if(store != null)
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
		
		return null;
	}

}
