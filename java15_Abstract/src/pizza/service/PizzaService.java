package pizza.service;

import java.util.Vector;

import pizza.parent.Pizza;

public class PizzaService {
	public void allindMakePizza(Vector<Pizza> v) {
			for(Pizza p : v) {
				p.makePizza();
				System.out.println("===============");
			}
	}
	
	
}
