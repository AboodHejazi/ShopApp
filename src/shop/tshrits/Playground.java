package shop.tshrits;

import java.util.Scanner;

public class Playground {

    /**
     * Test Drive
     */
    public static void main(String[] args) {

        ShopOwnerObserver aboodVendor = new ShopOwnerObserver("AboodH");

        ShopApplication application = ShopApplication.getApplication();
        application.registerObserver(aboodVendor);

        boolean doPurchaseRequest;
        do {
            Scanner scanner = new Scanner(System.in);

            doPurchase(application);

            System.out.println("would you do another purchase request (Yes/No) ?");
            String anotherOrNotPurchase = scanner.next();

            doPurchaseRequest = anotherOrNotPurchase.equalsIgnoreCase("yes");
        } while (doPurchaseRequest);

        System.out.println("== === Here Is The Summary === ==");
        System.out.println("1. Number of small sold t-shirts is " + aboodVendor.getSmallSoldShirts());
        System.out.println("2. Number of medium sold t-shirts is " + aboodVendor.getMediumSoldShirts());
        System.out.println("3. Number of large sold t-shirts is " + aboodVendor.getLargeSoldShirts());
        System.out.println("== === Have a nice day, @AboodCoder === ==");
    }

    private static void doPurchase(ShopApplication application) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose one of [MIDDLE_EAST, CHINA, ASIA] your region:");
        String region = scanner.next();

        Region clientRegion;
        try {

            clientRegion = Region.valueOf(region);
        } catch (IllegalArgumentException exception) {

            System.out.println("invalid region sorry!");
            return;
        }

        System.out.println("would you update the t-shirt color? type No if no, either one of [RED, BLUE] values please:");
        String withOrNoColor = scanner.next();

        Color tshirtColor = null;
        try {

            if (withOrNoColor.equalsIgnoreCase("no")) {
                throw new Exception();
            }

            tshirtColor = Color.valueOf(withOrNoColor);
        } catch (IllegalArgumentException exception) {

            System.out.println("invalid color sorry!");
            return;
        } catch (Exception ignore) {}

        System.out.println("would you add a Bird logo (Yes/No) ?");
        String withOrNoLogo = scanner.next();

        boolean withLogo;
        if (withOrNoLogo.equalsIgnoreCase("yes")) {
            withLogo = true;
        } else {
            withLogo = false;
        }

        System.out.println("would you add a 'Nice Day!' text (Yes/No) ?");
        String withOrNoText = scanner.next();

        boolean withText;
        if (withOrNoText.equalsIgnoreCase("yes")) {
            withText = true;
        } else {
            withText = false;
        }

        Order order = ShopFactory.createOrder(clientRegion, tshirtColor, withText, withLogo);
        application.sell(order);
    }
}
