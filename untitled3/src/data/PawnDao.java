package data;

import models.Pawn;
import models.Player;

import java.util.ArrayList;
import java.util.List;

public class PawnDao implements DAO<Pawn> {

    protected List<Pawn> pawns;

    public PawnDao() {
       pawns = new ArrayList<>();
        load();
    }

    public List<Pawn> getAllFor(Player object) {

        List<Pawn> forList;
        forList = new ArrayList<>();

        for (Pawn pawn: pawns) {



        }

        return forList;


    }



    @Override
    public List<Pawn> getAll() {
        return null;
    }

    @Override
    public void addOrUpdate(Pawn object) {

    }

    @Override
    public void remove(Pawn object) {

    }

    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean load() {
        return false;
    }
}
