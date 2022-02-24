package models;

public class Player {

    private String name;
    private Pawn[] pawn;


    public Player(String name) {
        this.name = name;
        pawn = new Pawn[20];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pawn[] getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn,int id) {
        this.pawn[id] = pawn;
    }


}

