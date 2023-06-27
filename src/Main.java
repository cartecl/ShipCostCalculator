import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;                                                                                                           //num itemPrice
        double shippingPrice;                                                                                                       //num shippingPrice
        double totalCost;

        System.out.print("What is the price of the item?");                                                                         //output "What is the price of the item?"
        in.hasNextDouble();                                                                                                         //input itemPrice

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100) {                                                                                                 //if itemPrice >= 100 then
                shippingPrice = 0;                                                                                                  //shippingPrice = 0
                totalCost = shippingPrice+itemPrice;                                                                                //calculate total cost
                System.out.println("Your cost of shipping is: " +shippingPrice + " " + "Your total cost is: " +totalCost);          //output "Your cost of shipping is:" +shippingPrice + " " + "Your total cost is: " +totalCost

            }
                else {                                                                                                              //else
                shippingPrice = 0.02 * itemPrice;                                                                                   //shippingPrice = 0.02*itemPrice
                totalCost = shippingPrice + itemPrice;                                                                              //calculate total cost
                System.out.println("Your cost of shipping is: " + shippingPrice + " " + "Your total cost is: " +totalCost);         //output "Your cost of shipping is:" +shippingPrice                                                                           //end else
            }                                                                                                                       //end else
        }                                                                                                                           //end if
    }                                                                                                                               //end main
}                                                                                                                                   //end class