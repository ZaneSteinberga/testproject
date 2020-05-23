package lv.zane.game;

public class FireMonster extends Monster{

    public FireMonster (String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire";
    }
}
