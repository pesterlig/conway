public class GridManager {

    //isa vs hasa is more of an architectural decision
    // have class cat extends animal
    //instead of that the cat could have a private instance of an animal, has an animal,  but is not an anmimal

    private int width;
    private int height;
    private Cell[][] cells = new Cell[width][height];

    public GridManager(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = cells;

    }
}

