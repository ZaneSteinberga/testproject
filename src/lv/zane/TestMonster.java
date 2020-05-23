package lv.zane;

import lv.zane.game.FireMonster;
import lv.zane.game.Monster;
import lv.zane.game.StoneMonster;
import lv.zane.game.WaterMonster;

public class TestMonster {

    public static void main(String[] args) {
        Monster fireMonster = new FireMonster("Fire Monster");
        Monster waterMonster = new WaterMonster("Water Monster");
        Monster stoneMonster = new StoneMonster("Stone Monster");
        Monster noName = new Monster("Monster");

        System.out.println(fireMonster.attack());
        System.out.println(waterMonster.attack());
        System.out.println(stoneMonster.attack());
        System.out.println(noName.attack());
    }
}
