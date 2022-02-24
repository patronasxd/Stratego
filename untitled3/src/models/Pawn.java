package models;

public class Pawn {

    private String type;
    private String color;
    private int id;


    public Pawn(String type, String color, int id) {
        this.type = type;
        this.color = color;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
