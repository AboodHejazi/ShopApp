package shop_shirts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author abood
 */
public class Account {
    protected String user;
    protected String password;
    protected double money1 = 200;
    protected double money;

    public Account() {
    }

    public Account(String user, String password, double money) {
        this.user = user;
        this.password = password;
        this.money = money;
        setMoney(money);
    }

    public void setString(String user) {
        if (user.length() <= 3)
            System.out.println("The user name so short,pleaze try again(Should be more then 4 char)");

    }

    public String getString(String user) {
        return user;
    }

    public void setPassword(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < 48 && password.charAt(i) > 59)
                count++;

        }
        if (count > 0)
            System.out.println("The paassword must contain numbers");
    }

    public String getPassword(String password) {
        return password;
    }

    public void setMoney(double money) {
        System.out.println(" you have 200 $  ");
        money1 -= money;
        if (money > money1)
            System.out.println("Sorry!you don't have enough amount,you just have now" + money1);

    }

    public double getPassword(double money) {
        return money;
    }


}
