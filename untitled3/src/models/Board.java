package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    private Space[] spaces;
    private final int tempspace = 20;
    int id =0;

    public Board() {
        spaces = new Space[tempspace];
        buildBoard();
    }


    public void buildBoard(){


        for (int i = 0; i < tempspace; i++) {
            spaces[i] = new Space(i);

        }


    }


    public Space[] getSpaces() {
        return spaces;
    }

    public void setSpaces(Space spaces) {
        this.spaces[id] = spaces;
        id++;



    }

    public boolean isEmpty(int spaceId){

        if (spaces[spaceId].getPawn() == null){
            return true;
        }

        if (spaces[spaceId].getPawn().equals(null)){
            return true;
        }
        else return false;
    }

    public void replacePawn(int spaceId, Space spaces){
        this.spaces[0]= spaces;

//
//        for (int i = 0; i < id; i++) {
//            System.out.println(spacesList.get(i).get);
//        }
//        id++;
    }

    public void getPawnById(int spaceId){


    }

//    public List<Space> getSpacesList() {
//        return spacesList;
//    }
//';

}
