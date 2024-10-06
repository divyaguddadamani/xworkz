package com.java.javcollection.dto;

import java.io.Serializable;

public class MatchBox<c,b> implements Serializable
{
	c cost;
	b brand;
	
	public MatchBox(c cost, b brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}

	public c getCost() {
		return cost;
	}

	public b getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "MatchBox [cost=" + cost + ", brand=" + brand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MatchBox))
			return false;
		MatchBox other = (MatchBox) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		return true;
	}
	
	
}

	

