package HangMan;

import Passwords.PasswordGenerator;


import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private final static int MAX_WORD_LENGTH = 20;
    private final static char HIDING_SYMBOL = '*';
    private int lives = 8;
    private  StringBuilder wordPresentation;
    private final String wordToBeGuessed;


    public HangmanGame() {
        Random rand = new Random();
        //digits as well, so we can reuse the generatePassword method
        //we can transform it if needed
        wordToBeGuessed = PasswordGenerator.generatePassword(rand.nextInt(MAX_WORD_LENGTH));
        wordPresentation = new StringBuilder(wordToBeGuessed.length());
        fillWordPresentation();

    }

    public void run() {

        try (Scanner scanner = new Scanner(System.in)) {

            startTurn();
            String input = scanner.nextLine();

            while (lives > 0) {

                if (input.length() == 1) {

                    if (wordToBeGuessed.contains(input))
                        replaceGuessedSymbolInPresentation(input.charAt(0));
                    else
                        lives--;

                    if (wordPresentation.indexOf(String.valueOf(HIDING_SYMBOL)) < 0) {
                        System.out.println("Congratulations you guessed the word!");
                        return;
                    }
                }
                else
                {
                    if (wordToBeGuessed.compareTo(input) == 0) {
                        System.out.println("Congratulations you guessed the word!");
                        return;
                    } else {
                        lives--;
                    }
                }

                startTurn();
                input = scanner.nextLine();

            }

            System.out.println("Unluckily you lost the game!");
        } catch
        (Exception exception) {
            //deal with exception

        }
    }


    private void fillWordPresentation() {
        wordPresentation.append(String.valueOf(HIDING_SYMBOL).repeat(wordPresentation.capacity()));
    }

    private void replaceGuessedSymbolInPresentation(char symbol) {
        for (int i = 0; i < wordPresentation.length(); i++) {
            if (wordToBeGuessed.charAt(i) == symbol) {
                wordPresentation.replace(i, i + 1, String.valueOf(symbol));
            }
        }
    }

    private void startTurn(){
        System.out.println(wordPresentation);
        System.out.print("Enter the word or a letter: ");

    }
}
