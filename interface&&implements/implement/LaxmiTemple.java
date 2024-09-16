package com.xworkz.implement;

import java.time.LocalTime;

import com.xworkz.media.TempleRule;

public class LaxmiTemple implements TempleRule {

	@Override
	public String TempleName() {
		System.out.println("run TempleName");
		return null;
	}

	@Override
	public boolean RemoveFootwear() {
		System.out.println("run RemoveFootwear");
		return false;
	}

	@Override
	public LocalTime OpeningTime() {
		System.out.println("run OpeningTime");
		return null;
	}

	@Override
	public LocalTime ClosingTime() {
		System.out.println("run ClosingTime");
		return null;
	}

	@Override
	public int visitor() {
		System.out.println("run visitor");
		return 0;
	}

	@Override
	public boolean Photography() {
		System.out.println("run Photography");
		return false;
	}

	@Override
	public double donationamount() {
		System.out.println("run donationamount");
		return 0;
	}

	@Override
	public LocalTime PoojaTimings() {
		System.out.println("run PoojaTimings");
		return null;
	}

	@Override
	public boolean Silence() {
		System.out.println("run Silence");
		return false;
	}

	@Override
	public boolean QueueforDarshan() {
		System.out.println("run QueueforDarshan");
		return false;
	}

}
