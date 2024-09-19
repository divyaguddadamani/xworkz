package com.xworkz.standard.repository;

public class RepositoryImpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("run save in repositoryimpl");
		return true;
	}

}
