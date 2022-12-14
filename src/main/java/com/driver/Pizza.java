package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill;
    private boolean takeaway;
    private boolean extraCheese;
    private boolean extraTopping;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        takeaway = false;
        extraCheese = false;
        extraTopping = false;
        isBillGenerated = false;
        if(isVeg){
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        }else{
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheese){
            extraCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings() {
        if (!extraTopping){
            extraTopping = true;
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
        }
    }

    public void addTakeaway(){
        if(!takeaway) {
            takeaway = true;
            this.price += 20;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            isBillGenerated = true;

            if (extraCheese) {
                this.bill = bill + "Extra Cheese Added: 80\n";
            }
            if (extraTopping) {
                if (isVeg) {
                    this.bill = this.bill + "Extra Toppings Added: 70\n";
                } else {
                    this.bill = this.bill + "Extra Toppings Added: 120\n";
                }
            }
            if (takeaway) {
                this.bill = this.bill + "Paperbag Added: 20\n";
            }
            this.bill = this.bill + "Total Price: " + getPrice()+"\n";
        }
        return this.bill;
    }
}
