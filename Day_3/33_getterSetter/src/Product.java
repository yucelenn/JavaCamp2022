public class Product {
    // attributes  |  field
    private int _id;    // private kendi claasındakiler tarafından kullanılabilir.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    private String renk;
    
    public int getId(){  // getter
        return _id;
    }
    public void setId(int id){  //setter
        _id = id; //this.id=id;
    }

    
    public String getKod() {
        return this.getName().substring(0,1) + _id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }
    
}
