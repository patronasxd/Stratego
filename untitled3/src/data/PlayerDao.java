package data;

import models.Player;
import java.util.List;

public class PlayerDao implements DAO<Player>{

    public PlayerDao() {
        load();
    }

    @Override
    public List<Player> getAll() {
        return null;
    }

    @Override
    public void addOrUpdate(Player object) {




    }

    @Override
    public void remove(Player object) {

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
