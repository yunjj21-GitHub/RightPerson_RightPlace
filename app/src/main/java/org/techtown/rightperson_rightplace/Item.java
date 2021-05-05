package org.techtown.rightperson_rightplace;

public class Item {
    private String itemTitle;
    private int itemRequestedTime;
    private int itemPrice;

    public Item(String itemTitle, int itemRequestedTime, int itemPrice) {
        this.itemTitle = itemTitle;
        this.itemRequestedTime = itemRequestedTime;
        this.itemPrice = itemPrice;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public int getItemRequestedTime() {
        return itemRequestedTime;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setItemRequestedTime(int itemRequestedTime) {
        this.itemRequestedTime = itemRequestedTime;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
