package lesson1;

public class Wall implements Barrier{

    private int height;

    public int Can(int dist) {
        return dist;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
