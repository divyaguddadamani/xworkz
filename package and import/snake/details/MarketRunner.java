package com.xworkz.snake.details;

import com.xworkz.snake.Market;
import com.xworkz.snake.runner.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		
		MarketStore gave =new MarketStore();
		gave.print();
		
		Market market1 =new Market("chikapeteMarket", "Bangalore");
		Market market2 =new Market("kadebazar", "Belagavi");
		Market market3 =new Market("bogarwase", "Belagavi");
		Market market4 =new Market("Shivajinagar", "Bangalore");
		Market market5 =new Market("malleshwarm", "Bangalore");
		
		gave.store(market5);
		gave.store(market4);
		gave.store(market3);
		gave.store(market2);
		gave.store(market1);
		gave.print();
	}

}
