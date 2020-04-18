package lesson1;

public class Bot implements Something{

    public final int maxRun = 100000;
    public final int maxJump = 1;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public boolean Run(int dist) {
        if (dist <= maxRun){
            System.out.print("Робот " + name + " пробежал " + dist);
            return true;
        }else
            System.out.println("Робот " + name + " смог пробежать только " + maxRun);
        return false;
    }

    public boolean Jump(int height) {
        if (height <= maxJump){
            System.out.println(" и перепрыгнул " + height);
            return true;
        }else
            System.out.println(" и не смог перепрыгнуть " + height);
        return false;
    }

}
