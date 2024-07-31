public class opps13 {

  public static void main(String args[]) {
    Queen q = new Queen();
    q.moves();
  }
}

interface chessplayer {
  void moves();
}

class Queen implements chessplayer {

  public void moves() {
    System.out.println("up,down,left,right,diagonal");
  }
}

class Rook implements chessplayer {

  public void moves() {
    System.out.println("up,down,left,right");
  }
}

class king implements chessplayer {

  public void moves() {
    System.out.println("up,down,left,right,diagonal by 1 stepps");
  }
}
