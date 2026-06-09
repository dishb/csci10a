public class Shipping {
  //  add your shippingCost method here
  public static void shippingCost(int weight, int size) {
    double cost = 5.5;
    if (weight >= 32) {
      cost = weight / 2.0;
    } else if (weight >= 16) {
      cost = 12.0;
    } else if (weight >= 8) {
      cost = 8.5;
    }

    if (size >= 24) {
      cost += Math.pow(size, 1.0 / 3.0);
    } else if (size > 12) {
      cost += 2.0;
    }

    System.out.printf("weight = %d, size = %d, cost = $%1.2f\n", weight, size, cost);
  }

  public static void main(String[] args) {
        shippingCost(8, 20);
        shippingCost(4, 27);
        shippingCost(20, 6); 
        shippingCost(34, 30); 
  }
}

/*
Output for problem 4:

------------------------------
weight = 8, size = 20, cost = $10.50
weight = 4, size = 27, cost = $8.50
weight = 20, size = 6, cost = $12.00
weight = 34, size = 30, cost = $20.11
------------------------------
*/
