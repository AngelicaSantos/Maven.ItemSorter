package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    // good practice to set instance variables to private
    private Long id;
    private String name;
    private Double price;

    //where you set default values
    public Item() {
        this(0L,"", 0.01);


    }
    //standard constructor. setting all values.
    public Item(Long id, String name, Double price) {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public Double getPrice() {

        return this.price;
    }

    public void setPrice(Double price) {
        this.price=price;
    }
}
