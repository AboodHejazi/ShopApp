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
public class logoDecorater extends TshirtDecorater{
   public logoDecorater(T_shirt logo){
   super(logo);
   }
   public String getDescription() {
        return super.getDescription()+"Bird Logo";
    }
 
   
}
