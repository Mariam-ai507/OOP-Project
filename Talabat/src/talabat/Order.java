
package talabat;


public class Order {
     private Meals orderedmeal;
   private int quantity;
    private String notes;
    private final Date orderdate;

    public Order(Meals orderedmeal, int quantity, String notes, Date orderdate) {
        this.orderedmeal = orderedmeal;
        this.quantity = quantity;
        this.notes = notes;
        this.orderdate = orderdate;
    }

    public Meals getOrderedmeal() {
        return orderedmeal;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getNotes() {
        return notes;
    }

    public Date getOrderdate() {
        return orderdate;
    }
     public float getorderprice()
     {
         float totalprice=0;
         totalprice=((orderedmeal.getPrice())*quantity);
               return totalprice;
}
}
