
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] piecesOfInput = input.split(" ");
            for(String pieceOfInput: piecesOfInput){
                if(pieceOfInput.contains("av")){
                    System.out.println(pieceOfInput);
                }
            }
        }
    }
}