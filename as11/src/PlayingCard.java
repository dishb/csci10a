
/**
 * Write a description of class PlayingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingCard
{
    // 1) define instance variables here, make them private
    private char suit;
    private int rank;

    
    // 2) define the no-arg constructor here
    public PlayingCard()
    {
        suit = 'C';
        rank = 1;
    }
    
    
    // 3) define the explicit (parameter) constructor here
    public PlayingCard(char suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    
    // 4) define the get and set methods here 
    //     (getSuit, getRank, setSuit, setRank)
    public char getSuit()
    {
        return suit;
    }

    public int getRank()
    {
        return rank;
    }

    public void setSuit(char suit)
    {
        this.suit = suit;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }
    
    
    // 5) define the print method here
    public void print()
    {
        String rankName;
        if (rank == 1)
        {
            rankName = "Ace";
        }
        else if (rank == 11)
        {
            rankName = "Jack";
        }
        else if (rank == 12)
        {
            rankName = "Queen";
        }
        else if (rank == 13)
        {
            rankName = "King";
        }
        else
        {
            rankName = Integer.toString(rank);
        }

        String suitName;
        if (suit == 'C')
        {
            suitName = "Clubs";
        }
        else if (suit == 'D')
        {
            suitName = "Diamonds";
        }
        else if (suit == 'H')
        {
            suitName = "Hearts";
        }
        else
        {
            suitName = "Spades";
        }

        System.out.println(rankName + " of " + suitName);
    }
    
}
