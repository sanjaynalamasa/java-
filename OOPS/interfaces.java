public class interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
        
    }
    
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer{
   public void moves() {  //if Dont write the public keyword its take the Default
        System.out.println("UP, DOWN, LEFT, RIGHT, DIAGONAL (4 Diections)");
    }
}
class Rook implements ChessPlayer{
    public void moves() {  //if Dont write the public keyword its take the Default
         System.out.println("UP, DOWN, LEFT, RIGHT");
     }
 }
 class King implements ChessPlayer{
    public void moves() {  //if Dont write the public keyword its take the Default
         System.out.println("UP, DOWN, LEFT, RIGHT,DIAGONAl by 1 Step (Only One Step)");
     }
 }
