import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug
{
    private int sideLength;
    private int steps;
    private int stage;
    private boolean finished;

    public ZBug(int length)
    {
        sideLength = length;
        steps = 0;
        stage = 0;
        finished = false;
        setDirection(Location.EAST);
    }

    public void act()
    {
        if (finished)
        {
            return;
        }

        if (stage == 0)
        {
            if (steps < sideLength)
            {
                if (canMove())
                {
                    move();
                    steps++;
                }
                else
                {
                    return;
                }
            }

            if (steps == sideLength)
            {
                stage = 1;
                steps = 0;
                setDirection(Location.SOUTHWEST);
            }

            return;
        }

        if (stage == 1)
        {
            int diagonalLength = sideLength;
            if (diagonalLength == 0)
            {
                stage = 2;
                steps = 0;
                setDirection(Location.EAST);
                return;
            }

            if (steps < diagonalLength)
            {
                if (canMove())
                {
                    move();
                    steps++;
                }
                else
                {
                    return;
                }
            }

            if (steps == diagonalLength)
            {
                stage = 2;
                steps = 0;
                setDirection(Location.EAST);
            }

            return;
        }

        if (stage == 2)
        {
            if (steps < sideLength + 1)
            {
                if (canMove())
                {
                    move();
                    steps++;
                }
                else
                {
                    return;
                }
            }

            if (steps == sideLength + 1)
            {
                finished = true;
            }
        }
    }
}
