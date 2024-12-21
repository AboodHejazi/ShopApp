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
class MiddleEastTshirt extends T_shirt {
   
    public MiddleEastTshirt(String name, String size) {
        super(name, size);
        this.description = "Middle East T-Shirt";
    }
    public void formSize(){
         System.out.println("Middle East T-Shirt, Size: " + size);
    }
}
