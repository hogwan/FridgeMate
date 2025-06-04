package Entity;

import java.sql.Timestamp;

public class User_ingredients {
    private int id;
    private int user_id;
    private int ingredient_id;
    private int quantity;
    private String unit;
    private Timestamp expiration_date;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
    public Timestamp getExpiration_date() {
        return expiration_date;
    }
    public void setExpiration_date(Timestamp expiration_date) {
        this.expiration_date = expiration_date;
    }
    @Override
    public String toString() {
        return "User_ingredients [id=" + id + ", user_id=" + user_id + ", ingredient_id=" + ingredient_id
                + ", quantity=" + quantity + ", unit=" + unit + ", expiration_date=" + expiration_date + "]";
    }
}
