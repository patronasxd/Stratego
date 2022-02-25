package controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import models.Board;
import models.Pawn;
import models.Player;
import models.Space;
import view.SetupView;
import view.View;

import java.util.Arrays;

public class SetupController extends Controller{

    private SetupView view;
    private Pawn currentSelectedPawn;
    private String current2SelectedPawn;
    private String teamColor = "Red";
    private int id = 0;
    private String playerName = "gilles";
    private Player player;
    private Board board;

    public SetupController() {
        this.view = new SetupView();

        player = new Player(playerName);
        board = new Board();



        view.getButton().setOnAction(actionEvent -> buttonBomb());
        view.getButton2().setOnAction(actionEvent -> buttonCaptain());
        view.getButton3().setOnAction(actionEvent -> buttonColonel());
        view.getButton4().setOnAction(actionEvent -> buttonGeneral());
        view.getButton5().setOnAction(actionEvent -> buttonLieutenant());
        view.getButton6().setOnAction(actionEvent -> buttonMajor());
        view.getButton7().setOnAction(actionEvent -> buttonMarshal());
        view.getButton8().setOnAction(actionEvent -> buttonMiner());
        view.getButton9().setOnAction(actionEvent -> buttonScout());
        view.getButton10().setOnAction(actionEvent -> buttonSergeant());
        view.getButton11().setOnAction(actionEvent -> buttonSpy());
        view.getButton12().setOnAction(actionEvent -> buttonFlag());

        view.getButtonTileOne().setOnAction(actionEvent -> setTile( view.getButtonTileOne()));
        view.getButtonTileTwo().setOnAction(actionEvent -> setTile( view.getButtonTileTwo()));
        view.getButtonTileThree().setOnAction(actionEvent -> setTile( view.getButtonTileThree()));
        view.getButtonTileFour().setOnAction(actionEvent -> setTile( view.getButtonTileFour()));
        view.getButtonTileFive().setOnAction(actionEvent -> setTile( view.getButtonTileFive()));
        view.getButtonTileSix().setOnAction(actionEvent -> setTile( view.getButtonTileSix()));
        view.getButtonTileSeven().setOnAction(actionEvent -> setTile( view.getButtonTileSeven()));
        view.getButtonTileEight().setOnAction(actionEvent -> setTile( view.getButtonTileEight()));
        view.getButtonTileNine().setOnAction(actionEvent -> setTile( view.getButtonTileNine()));
        view.getButtonTileTen().setOnAction(actionEvent -> setTile( view.getButtonTileTen()));
        view.getButtonTileEleven().setOnAction(actionEvent -> setTile( view.getButtonTileEleven()));
        view.getButtonTileTwelve().setOnAction(actionEvent -> setTile( view.getButtonTileTwelve()));
        view.getButtonTileThirtheen().setOnAction(actionEvent -> setTile( view.getButtonTileThirtheen()));
        view.getButtonTileFourteen().setOnAction(actionEvent -> setTile( view.getButtonTileFourteen()));
        view.getButtonTileFitheen().setOnAction(actionEvent -> setTile( view.getButtonTileFitheen()));
        view.getButtonTileSixteen().setOnAction(actionEvent -> setTile( view.getButtonTileSixteen()));
        view.getButtonTileSeventeen().setOnAction(actionEvent -> setTile( view.getButtonTileSeventeen()));
        view.getButtonTileEightheen().setOnAction(actionEvent -> setTile( view.getButtonTileEightheen()));
        view.getButtonTileNineteen().setOnAction(actionEvent -> setTile( view.getButtonTileNineteen()));
        view.getButtonTileTwenty().setOnAction(actionEvent -> setTile( view.getButtonTileTwenty()));



    }

    private void tileFive() {
        player.setPawn(currentSelectedPawn,id);

        id++;
    }

    private void tileFour() {
        player.setPawn(currentSelectedPawn,id);

        id++;
    }

    private void buttonFlag() {
        current2SelectedPawn = "Flag";
    }

    private void buttonSpy() {
        current2SelectedPawn = "Spy";
    }

    private void buttonSergeant() {
        current2SelectedPawn = "Sergeant";
    }

    private void buttonScout() {
        current2SelectedPawn = "Scout";
    }

    private void buttonMiner() {
        current2SelectedPawn = "Miner";
    }

    private void buttonMarshal() {
        current2SelectedPawn = "Marshal";
    }

    private void buttonMajor() {
        current2SelectedPawn = "Major";
    }

    private void buttonLieutenant() {
        current2SelectedPawn = "Lieutenant";
    }

    private void buttonGeneral() {
        current2SelectedPawn = "General";
    }

    private void buttonColonel() {
        current2SelectedPawn = "Colonel";
    }



    private void buttonCaptain() {
        current2SelectedPawn = "Captain";
    }


    private void setTile(Button buttonTileOne) {

        try {


            int space = Integer.parseInt(buttonTileOne.getText());
            //gets the value of the tile


            System.out.println(board.isEmpty(space));
            if (!board.isEmpty(space)){

                System.out.println("it should change now");
                board.replacePawn(space,new Space(player.getPawn()[space],space));

            }
            //checks if the spot was already taken replace the old one with new one in the array



            player.setPawn(new Pawn(current2SelectedPawn, teamColor, id), id);
            //adds the pawn to the player in a array

            board.getSpaces()[id].setPawn(player.getPawn()[id]);

            board.setSpaces(new Space(player.getPawn()[id],space));
            //adds the pawn to the board on a tile

          //  board.getSpaces()[0].setPawn(player.getPawn()[id]);



            view.getButton().getText();
            updateTiles(buttonTileOne);
            id++;
            updateCount(buttonTileOne);
            current2SelectedPawn = "";


        } catch (NumberFormatException e) {

        }

    }

    private void updateCount(Button buttonTileOne) {



        int countFlag = 0;
        int countBomb = 0;
        int countColonel = 0;
        int countLieutenant = 0;
        int countMarshal = 0;
        int countMiner = 0;
        int countScout = 0;
        int countSpy = 0;
        int countMajor = 0;
        int countGeneral = 0;
        int countCaptain =0;
        int countSergeant = 0;



        view.getButton12().setVisible(true);


        for (int i = 0; i < id; i++) {

            String word = player.getPawn()[i].getType();


            switch (word) {
                case "Flag":
                    countFlag++;
                    break;

                case "Captain":
                    countCaptain++;
                    break;

                case "Colonel":
                    countColonel++;
                    break;

                case "Bomb":
                    countBomb++;
                    break;

                case "General":
                    countGeneral++;
                    break;

                case "Lieutenant    ":
                    countLieutenant++;
                    break;

                case "Major":
                    countMajor++;
                    break;

                case "Miner":
                    countMiner++;
                    break;

                case "Scout":
                    countScout++;
                    break;

                case "Sergeant":
                    countSergeant++;
                    break;

                case "Spy":
                    countSpy++;
                    break;

                case "Marshal":
                    countMarshal++;
                    break;




            }

            if (countFlag == 1){
                view.getButton12().setVisible(false);
            }

            if (countSpy == 2){
                view.getButton11().setVisible(false);
            }
            if (countGeneral == 2){
                view.getButton4().setVisible(false);
            }
            if (countLieutenant == 2){
                view.getButton5().setVisible(false);
            }
            if (countMajor == 2){
                view.getButton6().setVisible(false);
            }
            if (countCaptain == 2){
                view.getButton2().setVisible(false);
            }
            if (countBomb == 2){
                view.getButton().setVisible(false);
            }
            if (countMiner == 2){
                view.getButton8().setVisible(false);
            }
            if (countScout == 2){
                view.getButton9().setVisible(false);
            }
            if (countMarshal == 2){
                view.getButton7().setVisible(false);
            }
            if (countSergeant == 2){
                view.getButton10().setVisible(false);
            }
            if (countColonel == 2){
                view.getButton3().setVisible(false);
            }


           // System.out.println(Arrays.toString(board.getSpacesList().toString() ) );

              System.out.println(board.getSpaces()[i].getPawn().getType() + " " + board.getSpaces()[i].getPawn().getId());




        }





    }

    private void updateTiles(Button buttonTileOne) {

        try {
            Image imgMajor = new Image("C:\\Users\\Gilles\\Downloads\\untitled3\\src\\images\\"+current2SelectedPawn+".png");
            ImageView view11 = new ImageView(imgMajor);
            view11.setFitHeight(80);
            view11.setPreserveRatio(true);
            buttonTileOne.setPrefSize(80, 80);
            buttonTileOne.setGraphic(view11);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Select a Pawn first");
            alert.show();

        }


    }

    private void buttonBomb() {
        current2SelectedPawn = "Bomb";
    }

    @Override
    public View getView() {
        return view;
    }




}
