package com.company.typecreatepattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * meal 相当于客户买的一顿饭，包括，可乐和汉堡
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public  void addItem(Item item){
        items.add(item);
    }

    /**
     * 这顿饭花了多少钱
     * */
    public float getCost(){
        float cost = 0.0f;
        for (Item item: items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item: items){
            System.out.printf("Item:" + item.name());
            System.out.printf(",Packing:" + item.packing().pack());
            System.out.println(",Price:" + item.price());
        }
    }

}
