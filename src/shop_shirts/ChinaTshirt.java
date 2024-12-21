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
class ChinaTshirt extends T_shirt {
     public ChinaTshirt(String name, String size) {
        super(name, size);
        this.description = "China T-Shirt";
    }
    public void formSize(){
         System.out.println("China T-Shirt, Size: " + size);
    }
}
