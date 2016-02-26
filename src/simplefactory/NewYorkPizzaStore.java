public class NewYorkPizzaStore extends PizzaStore{
	public Pizza createPizza(String type){
			if(type.equals("cheese")){
				return new NewYorkStyleCheesePizza();	
			}else if(type.equals("veggie")){
				return new NewYorkStyleVeggiePizza();	
			}
			return null;
	}	
}
