package com.mycompany.library.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Member {

    private String id, name;
    private ArrayList<Item> borrowedItems = new ArrayList<>();
    private Map<Item, Date> borrowDates = new HashMap<>();
    private Map<Item, Date> returnDates = new HashMap<>();

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean borrowItem(Item item) {//                                                      eyas
        if (borrowedItems.size() >= 3) {
            System.out.println("Sorry you can't borrow new item !! \nPlease return the items you borrowed");
            return false;
        }
        if (!borrowedItems.contains(item)) {
            borrowedItems.add(item);
            borrowDates.put(item, new Date());
            returnDates.remove(item);
        }
        return true;
    }

    public boolean returnItem(Item item) {//                                                      samer
        if (borrowedItems.remove(item)) {
            returnDates.put(item, new Date());
            return true;
        }
        return false;
    }

    public void displayBorrowed() {//                                                             shahd
        System.out.println("\nMember: " + name);
        for (Item item : borrowedItems) {
            item.displayInfo();
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public Map<Item, Date> getBorrowDates() {
        return borrowDates;
    }

    public Map<Item, Date> getReturnDates() {
        return returnDates;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", borrowedItems=" + borrowedItems + ", borrowDates=" + borrowDates + ", returnDates=" + returnDates + '}';
    }

}
//shahd/eyas/samer