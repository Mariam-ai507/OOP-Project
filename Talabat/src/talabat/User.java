
package talabat;

public abstract class User {
     protected String name;
    protected String passward;

    public User(String name, String passward) {
        this.name = name;
        this.passward = passward;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
    
     public  void login()
     {
     }
}
