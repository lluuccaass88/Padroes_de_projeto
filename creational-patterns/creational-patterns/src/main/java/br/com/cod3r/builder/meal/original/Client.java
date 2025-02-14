package br.com.cod3r.builder.meal.original;

import br.com.cod3r.builder.meal.original.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.original.builder.FatMealBuilder;
import br.com.cod3r.builder.meal.original.builder.JustFriesBuilder;
import br.com.cod3r.builder.meal.original.builder.Menu1Builder;
import br.com.cod3r.builder.meal.original.director.MealDirector;

public class Client {

  public static void order(String name, FastFoodMealBuilder builder) {
    System.out.println("Ordering a " + name);
    MealDirector director = new MealDirector(builder);
    director.constructCombo();
    System.out.println(director.getCombo());

    System.out.println("------------------");
  }

	public static void main(String[] args) {
    order("Burguer", new Menu1Builder());
    order("Just Fries", new JustFriesBuilder());
    order("Heart Atack", new FatMealBuilder());
	}
}