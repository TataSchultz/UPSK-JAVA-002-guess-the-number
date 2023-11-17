# Adivinhe o Número - Guess the Number

## Índice

* [1. Considerações Gerais](#1-considerações-gerais)
* [2. Prefácio](#2-prefácio)
* [3. Resumo do Projeto](#3-resumo-do-projeto)

---

## 1. Considerações Gerais

* Este projeto foi desenvolvido de maneira **individual**.
* Foi realizado em 2 Sprints.
* As únicas dependências externas utilizadas foram
JUnit e Mockito para testes unitários.
* A lógica do jogo foi baseada em estruturas de controle,
incluindo loops, condicionais e coleções.
* Foi utilizada uma funcionalidade da biblioteca de utilitários do Java para
geração de números aleatórios.



## 2. Prefácio

Atualmente, Java é uma das linguagens de programação mais utilizadas no mundo.
Apesar da diversidade de plataformas e ferramentas disponíveis, é fundamental
ter uma base sólida nos conceitos fundamentais de Java e na programação
orientada a objetos (OOP). O objetivo deste projeto é aprender os conceitos basicos da linguagem
Java por meio de um jogo simples e divertido.


![GUESS THE NUMBER](assets/guess-the-number.png)

## 3. Resumo do Projeto

É um jogo interativo que se realiza no terminal, no qual a
jogadora e o computador se alternam para tentar adivinhar um número
aleatório entre 1 e 100. Deve-se levar em consideração a tentativa anterior, se
foi "muito alta" ou "muito baixa".

![GUESS THE NUMER DEMO](assets/guess-the-number-demo.gif)




### Diagrama de Classes

![Diagrama de Classes](https://camo.githubusercontent.com/c18b541fa2d8452bfff226b4825dc0b08a34903a7ad212685052f3bd6e4d9049/68747470733a2f2f6d65726d6169642e696e6b2f696d672f70616b6f3a654e7039556b3150777a414d5f5374573247486431772d6f706b6b4970484a436948476a484c7a57744b564e4f6a6b4a306a5332333037537246736e4453354e3432635f2d7a316e4c3749324a78474c724547744879737347475771414c6f374a4a61306669767032636f4e63594b53594f395267446c3834546375724b6d6178537571764a58413354487138556f5a4d4d67466d56423942724b537372706a4872383075434f47625864454939693062554f6f517559554a465a7176445a6371654c39417879586a68794c52775f2d63324f367958774f6764516e6e4f6958507937365a435771323942444b37665745465f5135524933326a426d5a725561384156547772333349597748796e55506b6274375a7477646e66776a46483543306863394e51586830635437303865395236352d4845466747385354774f4367432d335a6744445051466d5f6e656d675539396f554845742d4c7a53507a62364436575943556e73317053374a395452704d4b55354b77517366764e6b657455704d726e6f54587465716379455275324e424e326d364f6830347354385363326d67365f33536a626f773f747970653d706e67)

#### `GuessTheNumberGame`

**Propósito:**
Lida com a lógica principal, decide qual jogador assume o próximo turno.

**Atributos estáticos (`static`):**

* `random`: Gerador de números aleatórios.
* `targetNumber`: Número aleatório entre 1 e 100 a ser adivinhado na partida
  atual.

**Métodos estáticos (`static`):**

* `main(String[] args)`: Inicia o jogo e gera o número aleatório.
* `checkGuess(Player player)`: Executa um turno, obtém a suposição e avalia
  o novo estado da partida.

#### `Player`

**Propósito:**
Representa uma jogadora genérica. É uma classe abstrata. Define os
atributos e métodos que todas as _classes_ de jogadoras devem compartilhar:

**Atributos:**

* `name`: O nome da jogadora.
* `guesses`: O histórico de suposições da jogadora.

**Métodos:**

* `makeGuess()`: Retorna a suposição da jogadora. É um método abstrato.
* `getName()`: Retorna o nome da jogadora.
* `getGuesses()`: Retorna o histórico de suposições da jogadora.

#### `HumanPlayer` e `ComputerPlayer` (herdam de `Player`)

**Propósito:**
Representa as jogadoras _Humana_ e _Computadora_, respectivamente.

**Métodos:**

* `makeGuess()`: Método que cada classe que herda de `Player` deve implementar.

**Relações:**

* A classe `GuessTheNumberGame` interage com as classes `HumanPlayer` e
  `ComputerPlayer` para gerenciar o jogo.
* Tanto a classe `HumanPlayer` quanto `Computer Player` são subclasses de
  `Player`, o que implica que herdam todas as suas propriedades e métodos, mas
  também têm algumas características adicionais próprias.

Este design de classes permite separar as responsabilidades, facilitando
a manutenção e possíveis extensões do jogo no futuro.

Por exemplo, poderíamos adicionar diferentes jogadoras "máquina" com diferentes
estratégias para a suposição automática, um novo tipo de jogadora "remota" ou
até mesmo diferentes níveis de dificuldade.

### **Critérios de Aceitação Mínimos do Projeto**

* A jogadora e o computador deveriam se alternar em turnos para
 tentar adivinhar o número.
* Após cada tentativa, deveria ser exibido:
  - O nome do jogador (pessoa ou computador).
  - A suposição feita.
  - Uma mensagem indicando se a suposição foi muito alta, muito baixa
  ou correta.
* O jogo terminaria assim que a jogadora ou o computador adivinhasse o
número secreto. Deveria ser exibida uma mensagem de fim de jogo, bem como uma lista
de todas as tentativas feitas pela jogadora vencedora.





