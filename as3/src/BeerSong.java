// Name: Dishant Bhandula

public class BeerSong {
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        beerSong(3);  
    }

    public static void beerSong(int n) {
        if (n < 0) return;
        if (n == 0) {
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya can't take one down, ya can't pass it around, 'cause there are no more bottles of beer on the wall!");
            return;
        }

        System.out.print(bottlesString(n) + " of beer on the wall, " + bottlesString(n).toLowerCase() + " of beer,");
        System.out.print(" " + bottlesString(n-1).toLowerCase() + " of beer on the wall.");
        System.out.println();

        beerSong(n-1);
    }

    public static String bottlesString(int n) {
        if (n == 0) return "No bottles";
        if (n == 1) return "1 bottle";
        return n + " bottles";
    }
}

/*
Output for problem 5:

-----------------------------
3 bottles of beer on the wall, 3 bottles of beer, 2 bottles of beer on the wall.
2 bottles of beer on the wall, 2 bottles of beer, 1 bottle of beer on the wall.
1 bottle of beer on the wall, 1 bottle of beer, no bottles of beer on the wall.
No bottles of beer on the wall, no bottles of beer, ya can't take one down, ya can't pass it around, 'cause there are no more bottles of beer on the wall!
-----------------------------
*/
