/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berly
 */
public class Milk extends Condiment {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return beverage.getCost() + 12;
    }

    public String getDescription() {
        return beverage.getDescription() + " - milk";
    }

}
