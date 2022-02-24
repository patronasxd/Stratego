package controllers;

import models.Pawn;
import view.BoardView;
import view.View;

public class Board extends Controller{

    private BoardView view;


    public Board(){

      view = new BoardView();




    }







    @Override
    public View getView() {
        return null;
    }
}
