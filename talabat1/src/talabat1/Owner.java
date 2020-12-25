
package talabat1;

public class Owner extends User{
     private final Restaurant restruant;
    public Owner(String name, String passward , Restaurant restruant) {
        super(name, passward);
        this.restruant=  restruant;
    }

    public Restaurant getRestruant() {
        return restruant;
    }

    
    public void Register() {
       
    }
}
