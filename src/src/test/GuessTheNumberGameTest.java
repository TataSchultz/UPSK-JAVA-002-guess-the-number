import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class GuessTheNumberGameTest {

    @Test
    @DisplayName("Deve retornar 'Tente um número menor' porque o palpite é muito alto")
    public void shouldReturnTenteUmNumeroMenor() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);

        game.setTargetNumber(85);
        when(mockPlayer.makeGuess()).thenReturn(50);
        when(mockPlayer.getName()).thenReturn("Jogadora");
        int guess = game.checkGuess(mockPlayer);


        assertEquals(50, guess);
    }

    @Test
    @DisplayName("Deve retornar 'Tente um número maior' porque o palpite é muito baixo")
    public void shouldReturnTenteUmNumeroMaior() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);

        when(mockPlayer.makeGuess()).thenReturn(50);
        when(mockPlayer.getName()).thenReturn("Jogadora");
        game.setTargetNumber(33);
        int guess = game.checkGuess(mockPlayer);

        assertEquals(50, guess);
    }

    @Test
    @DisplayName("Deve retornar 'Número correto!' porque o palpite é igual ao número alvo")
    public void shouldReturnNumeroCorreto() {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player mockPlayer = mock(Player.class);

        when(mockPlayer.makeGuess()).thenReturn(50);
        when(mockPlayer.getName()).thenReturn("Jogadora");
        game.setTargetNumber(50); 
        int guess = game.checkGuess(mockPlayer);

        assertEquals(50, guess);
    }
}


