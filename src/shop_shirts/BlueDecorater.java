package shop_shirts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abood
 */
public class BlueDecorater extends TshirtDecorater{
    private String color;

    public BlueDecorater(T_shirt tshirt, String color) {
        super(tshirt);
        this.color = color;
    }
      public String getDescription() {
        return super.getDescription()+"color:"+this.color;
    } 
}
