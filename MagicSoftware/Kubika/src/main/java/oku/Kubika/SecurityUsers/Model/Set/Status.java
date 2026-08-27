package oku.Kubika.SecurityUsers.Model.Set;

public enum Status {

    OFFILINE(1),
    ONLINE(2),
    RENTING(3),
    LOOKING_FOR(4);

    private int status;

    Status(int status){
        this.status = status;

    }


    public int getStatus(){
        return status;
    }
}
