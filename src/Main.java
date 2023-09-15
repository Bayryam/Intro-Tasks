// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import HangMan.HangmanGame;

import Passwords.PasswordGenerator;

import ArraySorting.ArrayQuickActions;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] ar = {3,2,54,1};
        ArrayQuickActions.quickSort(ar,0,ar.length-1);
        for (int i :ar){
            System.out.println(i);
        }

    }
}