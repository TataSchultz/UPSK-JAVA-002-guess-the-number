import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

public class GuessTheNumberGameTest {
    @Mock
    Random targetNumber;

    Random computerGuess;
    @Test
    @DisplayName("Deve retornar Tente um número menor porque o palpite é muito alto")
    public void testCheckGuess() {

        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);


        when(mockPlayer.makeGuess()).thenReturn(50);

        // Execução do método que deve ser testado
        int guess = game.checkGuess(mockPlayer);

        assertEquals(50, guess);


    }
}

