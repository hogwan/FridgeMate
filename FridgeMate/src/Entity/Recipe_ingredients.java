package Entity;

public class Recipe_ingredients {
    private int id;
    private int recipe_id;
    private int ingredient_id;
    private int quantity;
    private String unit;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRecipe_id() {
        return recipe_id;
    }
    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }
    public int getIngredient_id() {
        return ingredient_id;
    }
    public void setIngredient_id(int ingredient_id) {
        this.ingredient_id = ingredient_id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    @Override
    public String toString() {
        return "Recipe_ingredients [id=" + id + ", recipe_id=" + recipe_id + ", ingredient_id=" + ingredient_id
                + ", quantity=" + quantity + ", unit=" + unit + "]";
    }
}
