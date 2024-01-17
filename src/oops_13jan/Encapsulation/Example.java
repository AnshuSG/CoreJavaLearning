package src.oops_13jan.Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class Example {


    public static void main(String[] args) {



        vwologin vwologin = new vwologin("admin","admin");
        boolean check = vwologin.isLoggedin("admin","password");
        //vwologin.Password = "password";
        vwologin.setUsername("admin");

        boolean check2 = vwologin.isLoggedin("admin","password");
        System.out.println(check2);
    }



}
    class vwologin{
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;

        public String getPassword() {
            return Password;
        }

        private String Password;

        public vwologin(String username, String password) {
            this.username = username;
            Password = password;
        }

        boolean isLoggedin(String username, String Password) {
            if (this.username.toLowerCase().equals(username) && this.Password.toLowerCase().equals(Password)) {
                System.out.println("Loggedin");
                return true;

            } else {
                System.out.println("false");
                return false;
            }
        }


    }




