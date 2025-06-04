package Entity;

public class Ingredient {
    private int ingredient_id;
    private String name;
    private String category;
    
    public int getIngredient_id() {
        return ingredient_id;
    }
    public void setIngredient_id(int ingredient_id) {
        this.ingredient_id = ingredient_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Ingredient [ingredient_id=" + ingredient_id + ", name=" + name + ", category=" + category + "]";
    }
    
}
