package br.com.cod3r.builder.meal.original.builder;


import br.com.cod3r.builder.meal.original.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
  protected FastFoodMeal meal;

  public FastFoodMealBuilder() {
    meal = new FastFoodMeal();
  }

  public abstract void buildDrink();
  public abstract void buildMain();
  public abstract void buildSide();
  public abstract void buildDessert();
  public abstract void buildGift();

  public FastFoodMeal getMeal() {
    return meal;
  }
}
