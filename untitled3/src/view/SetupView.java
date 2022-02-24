package view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SetupView extends View {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button buttonTileOne;
    private Button buttonTileTwo;
    private Button buttonTileThree;
    private Button buttonTileFour;
    private Button buttonTileFive;
    private Button buttonTileSix;
    private Button buttonTileSeven;
    private Button buttonTileEight;
    private Button buttonTileNine;
    private Button buttonTileTen;
    private Button buttonTileEleven;
    private Button buttonTileTwelve;
    private Button buttonTileThirtheen;
    private Button buttonTileFourteen;
    private Button buttonTileFitheen;
    private Button buttonTileSixteen;
    private Button buttonTileSeventeen;
    private Button buttonTileEightheen;
    private Button buttonTileNineteen;
    private Button buttonTileTwenty;






    private Parent root;

    public SetupView() {
        initialiseNodes();
        layoutNodes();
    }
    private void initialiseNodes() {

        Image imgBomb = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Bomb.png");
        Image imgCaptain = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Captain.png");
        Image imgColonel = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Colonel.png");
        Image imgGeneral = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\General.png");
        Image imgLieutenant = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Lieutenant.png");
        Image imgMajor = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Major.png");
        Image imgMarshal = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Marshal.png");
        Image imgMiner = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Miner.png");
        Image imgSergeant = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Sergeant.png");
        Image imgSpy = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Spy.png");
        Image imgScout = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Scout.png");
        Image imgflag = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\Flag.png");


        ImageView view = new ImageView(imgBomb);
        view.setFitHeight(80);
        view.setPreserveRatio(true);
        button = new Button();
        button.setPrefSize(80, 80);
        button.setGraphic(view);

        ImageView view2 = new ImageView(imgCaptain);
        view2.setFitHeight(80);
        view2.setPreserveRatio(true);
        button2 = new Button();
        button2.setPrefSize(80, 80);
        button2.setGraphic(view2);

        ImageView view3 = new ImageView(imgColonel);
        view3.setFitHeight(80);
        view3.setPreserveRatio(true);
        button3 = new Button();
        button3.setPrefSize(80, 80);
        button3.setGraphic(view3);

        ImageView view4 = new ImageView(imgGeneral);
        view4.setFitHeight(80);
        view4.setPreserveRatio(true);
        button4 = new Button();
        button4.setPrefSize(80, 80);
        button4.setGraphic(view4);

        ImageView view5 = new ImageView(imgLieutenant);
        view5.setFitHeight(80);
        view5.setPreserveRatio(true);
        button5 = new Button();
        button5.setPrefSize(80, 80);
        button5.setGraphic(view5);

        ImageView view6 = new ImageView(imgMajor);
        view6.setFitHeight(80);
        view6.setPreserveRatio(true);
        button6 = new Button();
        button6.setPrefSize(80, 80);
        button6.setGraphic(view6);

        ImageView view7 = new ImageView(imgMarshal);
        view7.setFitHeight(80);
        view7.setPreserveRatio(true);
        button7 = new Button();
        button7.setPrefSize(80, 80);
        button7.setGraphic(view7);

        ImageView view8 = new ImageView(imgMiner);
        view8.setFitHeight(80);
        view8.setPreserveRatio(true);
        button8 = new Button();
        button8.setPrefSize(80, 80);
        button8.setGraphic(view8);

        ImageView view9 = new ImageView(imgScout);
        view9.setFitHeight(80);
        view9.setPreserveRatio(true);
        button9 = new Button();
        button9.setPrefSize(80, 80);
        button9.setGraphic(view9);

        ImageView view10 = new ImageView(imgSergeant);
        view10.setFitHeight(80);
        view10.setPreserveRatio(true);
        button10 = new Button();
        button10.setPrefSize(80, 80);
        button10.setGraphic(view10);

        ImageView view11 = new ImageView(imgSpy);
        view11.setFitHeight(80);
        view11.setPreserveRatio(true);
        button11 = new Button("spy");
        button11.setPrefSize(80, 80);
        button11.setGraphic(view11);

        ImageView view12 = new ImageView(imgflag);
        view12.setFitHeight(80);
        view12.setPreserveRatio(true);
        button12 = new Button("flag");
        button12.setPrefSize(80, 80);
        button12.setGraphic(view12);

        buttonTileOne = new Button("1");
        buttonTileOne.setMaxWidth(200);
        buttonTileOne.setMaxHeight(200);
        buttonTileOne.setMinHeight(200);
        buttonTileOne.setMinWidth(200);

        buttonTileOne = new Button("1");
        buttonTileTwo = new Button("2");
        buttonTileThree = new Button("3");
        buttonTileFour = new Button("4");
        buttonTileFive = new Button("5");
        buttonTileSix = new Button("6");
        buttonTileSeven = new Button("7");
        buttonTileEight = new Button("8");
        buttonTileNine = new Button("9");
        buttonTileTen = new Button("10");
        buttonTileEleven = new Button("11");
        buttonTileTwelve = new Button("12");
        buttonTileThirtheen = new Button("13");
        buttonTileFourteen = new Button("14");
        buttonTileFitheen = new Button("15");
        buttonTileSixteen= new Button("16");
        buttonTileSeventeen = new Button("17");
        buttonTileEightheen= new Button("18");
        buttonTileNineteen = new Button("19");
        buttonTileTwenty = new Button("20");




    }

    private void layoutNodes() {
        VBox vBox = new VBox();
        VBox vBox1 = new VBox();
        HBox FirstRow = new HBox();
        HBox SecondRow = new HBox();
        HBox hBox = new HBox();
        VBox vBox5 = new VBox();

        FirstRow.setMinHeight(150);
        FirstRow.setMinWidth(150);

        buttonTileOne.setMinHeight(FirstRow.getMinHeight());
        buttonTileOne.setMinWidth(FirstRow.getMinWidth());
        buttonTileTwo.setMinHeight(FirstRow.getMinHeight());
        buttonTileTwo.setMinWidth(FirstRow.getMinWidth());
        buttonTileThree.setMinHeight(FirstRow.getMinHeight());
        buttonTileThree.setMinWidth(FirstRow.getMinWidth());
        buttonTileFour.setMinHeight(FirstRow.getMinHeight());
        buttonTileFour.setMinWidth(FirstRow.getMinWidth());
        buttonTileFive.setMinHeight(FirstRow.getMinHeight());
        buttonTileFive.setMinWidth(FirstRow.getMinWidth());
        buttonTileSix.setMinHeight(FirstRow.getMinHeight());
        buttonTileSeven.setMinWidth(FirstRow.getMinWidth());
        buttonTileEight.setMinHeight(FirstRow.getMinHeight());
        buttonTileNine.setMinWidth(FirstRow.getMinWidth());
        buttonTileTen.setMinHeight(FirstRow.getMinHeight());
        buttonTileEleven.setMinWidth(FirstRow.getMinWidth());
        buttonTileTwelve.setMinHeight(FirstRow.getMinHeight());
        buttonTileThirtheen.setMinWidth(FirstRow.getMinWidth());
        buttonTileFourteen.setMinHeight(FirstRow.getMinHeight());
        buttonTileFitheen.setMinWidth(FirstRow.getMinWidth());
        buttonTileSixteen.setMinHeight(FirstRow.getMinHeight());
        buttonTileSeventeen.setMinHeight(FirstRow.getMinHeight());
        buttonTileEightheen.setMinHeight(FirstRow.getMinHeight());
        buttonTileNineteen.setMinHeight(FirstRow.getMinHeight());
        buttonTileTwenty.setMinHeight(FirstRow.getMinHeight());
        buttonTileSix.setMinWidth(FirstRow.getMinWidth());
        buttonTileSeven.setMinHeight(FirstRow.getMinHeight());
        buttonTileEight.setMinWidth(FirstRow.getMinWidth());
        buttonTileNine.setMinHeight(FirstRow.getMinHeight());
        buttonTileTen.setMinWidth(FirstRow.getMinWidth());
        buttonTileEleven.setMinHeight(FirstRow.getMinHeight());
        buttonTileTwelve.setMinWidth(FirstRow.getMinWidth());
        buttonTileThirtheen.setMinHeight(FirstRow.getMinHeight());
        buttonTileFourteen.setMinWidth(FirstRow.getMinWidth());
        buttonTileFitheen.setMinHeight(FirstRow.getMinHeight());
        buttonTileSixteen.setMinWidth(FirstRow.getMinWidth());
        buttonTileSeventeen.setMinWidth(FirstRow.getMinWidth());
        buttonTileEightheen.setMinWidth(FirstRow.getMinWidth());
        buttonTileNineteen.setMinWidth(FirstRow.getMinWidth());
        buttonTileTwenty.setMinWidth(FirstRow.getMinWidth());


        FirstRow.getChildren().addAll(buttonTileOne,buttonTileTwo,buttonTileThree,buttonTileFour,buttonTileFive,buttonTileSix
        ,buttonTileSeven,buttonTileEight,buttonTileNine,buttonTileTen);
        SecondRow.getChildren().addAll(buttonTileEleven,buttonTileTwelve,buttonTileThirtheen,buttonTileFourteen,buttonTileFitheen,
                buttonTileSixteen,buttonTileSeventeen,buttonTileEightheen,buttonTileNineteen,buttonTileTwenty);

        vBox5.getChildren().addAll(FirstRow,SecondRow);
        vBox5.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(button,button2,button3,button4,button5,button12);
        vBox1.getChildren().addAll(button6,button7,button8,button9,button10,button11);
        vBox.setAlignment(Pos.CENTER);
        vBox1.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(vBox,vBox1,vBox5);

        root = hBox;
    }


    @Override
    public Parent getRoot() {
        return root;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setRoot(Parent root) {
        this.root = root;
    }


    public Button getButton2() {
        return button2;
    }

    public Button getButton3() {
        return button3;
    }

    public Button getButton4() {
        return button4;
    }

    public Button getButton5() {
        return button5;
    }

    public Button getButton6() {
        return button6;
    }

    public Button getButton7() {
        return button7;
    }

    public Button getButton8() {
        return button8;
    }

    public Button getButton9() {
        return button9;
    }

    public Button getButton10() {
        return button10;
    }

    public Button getButton11() {
        return button11;
    }

    public Button getButtonTileOne() {
        return buttonTileOne;
    }

    public void setButtonTileOne(Button buttonTileOne) {
        this.buttonTileOne = buttonTileOne;
    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public void setButton3(Button button3) {
        this.button3 = button3;
    }

    public void setButton4(Button button4) {
        this.button4 = button4;
    }

    public void setButton5(Button button5) {
        this.button5 = button5;
    }

    public void setButton6(Button button6) {
        this.button6 = button6;
    }

    public void setButton7(Button button7) {
        this.button7 = button7;
    }

    public void setButton8(Button button8) {
        this.button8 = button8;
    }

    public void setButton9(Button button9) {
        this.button9 = button9;
    }

    public void setButton10(Button button10) {
        this.button10 = button10;
    }

    public Button getButton12() {
        return button12;
    }

    public void setButton12(Button button12) {
        this.button12 = button12;
    }

    public void setButton11(Button button11) {
        this.button11 = button11;
    }

    public Button getButtonTileTwo() {
        return buttonTileTwo;
    }

    public void setButtonTileTwo(Button buttonTileTwo) {
        this.buttonTileTwo = buttonTileTwo;
    }

    public Button getButtonTileThree() {
        return buttonTileThree;
    }

    public void setButtonTileThree(Button buttonTileThree) {
        this.buttonTileThree = buttonTileThree;
    }

    public Button getButtonTileFour() {
        return buttonTileFour;
    }

    public void setButtonTileFour(Button buttonTileFour) {
        this.buttonTileFour = buttonTileFour;
    }

    public Button getButtonTileFive() {
        return buttonTileFive;
    }

    public void setButtonTileFive(Button buttonTileFive) {
        this.buttonTileFive = buttonTileFive;
    }

    public Button getButtonTileSix() {
        return buttonTileSix;
    }

    public void setButtonTileSix(Button buttonTileSix) {
        this.buttonTileSix = buttonTileSix;
    }

    public Button getButtonTileSeven() {
        return buttonTileSeven;
    }

    public void setButtonTileSeven(Button buttonTileSeven) {
        this.buttonTileSeven = buttonTileSeven;
    }

    public Button getButtonTileEight() {
        return buttonTileEight;
    }

    public void setButtonTileEight(Button buttonTileEight) {
        this.buttonTileEight = buttonTileEight;
    }

    public Button getButtonTileNine() {
        return buttonTileNine;
    }

    public void setButtonTileNine(Button buttonTileNine) {
        this.buttonTileNine = buttonTileNine;
    }

    public Button getButtonTileTen() {
        return buttonTileTen;
    }

    public void setButtonTileTen(Button buttonTileTen) {
        this.buttonTileTen = buttonTileTen;
    }

    public Button getButtonTileEleven() {
        return buttonTileEleven;
    }

    public void setButtonTileEleven(Button buttonTileEleven) {
        this.buttonTileEleven = buttonTileEleven;
    }

    public Button getButtonTileTwelve() {
        return buttonTileTwelve;
    }

    public void setButtonTileTwelve(Button buttonTileTwelve) {
        this.buttonTileTwelve = buttonTileTwelve;
    }

    public Button getButtonTileThirtheen() {
        return buttonTileThirtheen;
    }

    public void setButtonTileThirtheen(Button buttonTileThirtheen) {
        this.buttonTileThirtheen = buttonTileThirtheen;
    }

    public Button getButtonTileFourteen() {
        return buttonTileFourteen;
    }

    public void setButtonTileFourteen(Button buttonTileFourteen) {
        this.buttonTileFourteen = buttonTileFourteen;
    }

    public Button getButtonTileFitheen() {
        return buttonTileFitheen;
    }

    public void setButtonTileFitheen(Button buttonTileFitheen) {
        this.buttonTileFitheen = buttonTileFitheen;
    }

    public Button getButtonTileSixteen() {
        return buttonTileSixteen;
    }

    public void setButtonTileSixteen(Button buttonTileSixteen) {
        this.buttonTileSixteen = buttonTileSixteen;
    }

    public Button getButtonTileSeventeen() {
        return buttonTileSeventeen;
    }

    public void setButtonTileSeventeen(Button buttonTileSeventeen) {
        this.buttonTileSeventeen = buttonTileSeventeen;
    }

    public Button getButtonTileEightheen() {
        return buttonTileEightheen;
    }

    public void setButtonTileEightheen(Button buttonTileEightheen) {
        this.buttonTileEightheen = buttonTileEightheen;
    }

    public Button getButtonTileNineteen() {
        return buttonTileNineteen;
    }

    public void setButtonTileNineteen(Button buttonTileNineteen) {
        this.buttonTileNineteen = buttonTileNineteen;
    }

    public Button getButtonTileTwenty() {
        return buttonTileTwenty;
    }

    public void setButtonTileTwenty(Button buttonTileTwenty) {
        this.buttonTileTwenty = buttonTileTwenty;
    }



}
