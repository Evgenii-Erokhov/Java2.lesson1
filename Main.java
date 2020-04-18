package lesson1;

public class Main {
    public static void main(String[] args) {

        Man man = new Man();
        Cat cat = new Cat();
        Bot bot = new Bot();

        man.setName("Сеня");
        cat.setName("Барсик");
        bot.setName("Железяка");


        Something[] participants = new Something[3];
        participants[0] = man;
        participants[1] = cat;
        participants[2] = bot;

        Wall wall = new Wall();
        Track track = new Track();

        wall.setHeight(1);
        track.setLen(5000);

        Barrier[] barriers = new Barrier[2];
        barriers[0] = wall;
        barriers[1] = track;

        for (Something participant: participants) {
            for (Barrier barrier: barriers) {
                 if (participant.Run(barrier.Can(track.getLen()))) {
                     participant.Jump(barrier.Can(wall.getHeight()));
                 }
                break;
            }
        }
    }
}
