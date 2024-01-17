package src.oops_13jan.Encapsulation;

public class lab148 {
    public static void main(String[] args) {
        vwoLoginFixed  vwoLogin = new vwoLoginFixed("admin","admin");
        String u = vwoLogin.getUsername();
        //vwologin.Password= ?
  // get password also not allowed

        boolean check =  vwoLogin.isLoggedin("admin","admin");
        System.out.println(check);
    }


}


class vwoLoginFixed{

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    private String Username;
    private String Password;


    vwoLoginFixed(String u, String p){
        this.Username = u;
        this.Password = p;
    }


    boolean isLoggedin(String username, String Password) {
        if (this.Username.toLowerCase().equals(username) && this.Password.toLowerCase().equals(Password)) {
            System.out.println("Loggedin");
            return true;

        } else {
            System.out.println("false");
            return false;
        }
    }


}