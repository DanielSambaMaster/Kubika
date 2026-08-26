package oku.Kubika.SecurityUsers.Model.Set;

public enum Role {

    MASTER(1),
    SALER(2),
    CUSTOMER(3);

    private int role;

     Role (int role){
         this.role =role;
     }

     public int getRole(){
         return role;
     }
}
