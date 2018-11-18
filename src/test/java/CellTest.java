import org.junit.Assert;
import org.junit.Test;


public class CellTest {
    @Test
    public void isAlive_returns_false() {
        Cell cell = new Cell(false);
        Assert.assertTrue(!cell.isAlive());

    }
}
