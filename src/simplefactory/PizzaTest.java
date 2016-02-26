public class PizzaTest{
	public static void main(String[] args){
		PizzaStore pizzaStore = new NewYorkPizzaStore();	
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());

		pizza = pizzaStore.orderPizza("veggie");
		System.out.println("Adam ordered a " + pizza.getName());
	}	
}
