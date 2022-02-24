//package models;
//
//import javafx.css.CssParser;
//import javafx.scene.paint.Color;
//
//import java.util.Random;
//
//import static javafx.scene.paint.Color.rgb;
//
//public class StrategoModel {
//    // private attributes
//
//    private String backgroundColor;
//    private String text;
//    private final int MAX_COLOR=256;
//    Random random = new Random(33);
//
//
//    public StrategoModel(){
//
//    }
//    public StrategoModel(String string) {
//
//        backgroundColor = "cornsilk";
//        text = string;
//        reverse();
//
//
//        // Constructor
//    }
//    // methods with business logic
//    // necessary getters and setters
//
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getBackgroundColor() {
//        return backgroundColor;
//    }
//
//
//    public void setRandomColor(){
//       backgroundColor = "Blue";
//
//
//    }
//
//    public void reverse(){
//        System.out.println(text);
//        StringBuilder stringBuilder = new StringBuilder(text);
//        text = stringBuilder.reverse().toString();
//        System.out.println(text);
//    }
//}
