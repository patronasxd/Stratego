package models;

public class Space {

    private int spaceId;
    private Pawn pawn;






    public Space(int spaceId) {
        this.spaceId = spaceId;
    }

    public Space(Pawn pawn, int spaceId) {
        this.pawn = pawn;
        this.spaceId = spaceId;
    }


    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }

    public void removePawn(){
        this.pawn = null;
    }





}
