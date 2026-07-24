/**
 * A blank (wildcard) Scrabble tile. Worth 0 points and can represent any letter.
 * Demonstrates inheritance from Tile.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class BlankTile extends Tile {
    public BlankTile() {
        super('#', 0);
    }

    @Override
    public boolean isBlank() {
        return true;
    }

    @Override
    public String toString() {
        return "#/0 (blank)";
    }
}
