import java.util.Scanner;


class ShipCost
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalCosts = 0;
        double shippingCosts = 0;
        final double SHIP_COST_LIMIT = 100;
        final double SHIP_TAX = 0.02;
        String trash = "";

        IO.println("Enter the item price: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the new line from the buffer

            if(itemPrice >= SHIP_COST_LIMIT)
            {
                shippingCosts = 0;
                totalCosts = itemPrice;

            }

            else // itemprice < SHIP limit
            {
                shippingCosts = itemPrice * SHIP_TAX;
                totalCosts = itemPrice + shippingCosts;

            }

            IO.println("The shipping cost is " + shippingCosts);
            IO.println("The total cost is " + totalCosts);

        }

        else // got some trash
        {
            trash = in.nextLine();
            IO.println("This is an invalid value " + trash);
            IO.println("Run the program again with the correct input!");
            System.exit(0);
        }
    }
}
