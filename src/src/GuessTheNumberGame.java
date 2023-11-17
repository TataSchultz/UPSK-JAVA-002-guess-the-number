import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;

    public static void main(String[] args) {
        System.out.println("O jogo vai começar! Adivinhe o número de 0 a 100");
        targetNumber = random.nextInt(101);
        System.out.println(targetNumber);
        Player player1 = new HumanPlayer("Jogadora");
        Player player2 = new ComputerPlayer("Computador");

        Player currentPlayer = player1;
        while (true) {
            int guess = checkGuess(currentPlayer);
            if (guess == targetNumber) {
                System.out.println(currentPlayer.getName() + " adivinhou o número " + targetNumber + "! Parabéns!");
                System.out.println("Tentativas de " + currentPlayer.getName() + ": " + currentPlayer.getGuesses());
                break;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
    public static void setTargetNumber(int number) {
        targetNumber = number;
    }

    public static int checkGuess(Player player) {
        int guess = player.makeGuess();
        String result;
        if (guess < targetNumber) {
            result = "Tente um número maior";
        } else if (guess > targetNumber) {
            result = "Tente um número menor";
        } else {
            result = "Número correto!";
        }
        System.out.println(player.getName() + " supôs " + guess + ". Resultado: " + result);
        player.addGuess(guess);
        return guess;
    }
}




