package interfaces;

interface Game {    boolean move(); }
interface GameFactory{  Game getGame(); }

class Checker implements Game {
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move(){
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory =
            new GameFactory() {
                public Game getGame() {
                    return new Checker();
                }
            };
}
//class CheckerFactory implements GameFactory{
//    public Game getGame(){  return new Checker();   }
//}
class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move(){
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory =
            new GameFactory() {
                public Game getGame() {
                    return new Chess();
                }
            };
}
//class ChessFactory implements GameFactory{
//    public Game getGame(){  return new Chess(); }
//}
public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move())
            ;
    }
    public static void main(String[] args){
        // playGame(new CheckerFactory());
        playGame(Checker.factory);
        // playGame(new ChessFactory());
        playGame(Chess.factory);
    }
}
