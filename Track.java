package lesson1;

public class Track implements Barrier{

    private int len;

    public int Can(int dist) {
        return dist;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
}
