package com.xworkz.media;

import java.time.LocalTime;

public interface TempleRule {
	String TempleName();

	boolean RemoveFootwear();

	LocalTime OpeningTime();

	LocalTime ClosingTime();

	int visitor();

	boolean Photography();

	double donationamount();

	LocalTime PoojaTimings();

	boolean Silence();

	boolean QueueforDarshan();

}
