package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put your character: ");
        char character = input.next().charAt(0);
        if (character=='a'){
            System.out.println("The Word Is Vowel");
        }else if (character=='e'){
            System.out.println("The Word Is Vowel");
        }else if (character=='i'){
            System.out.println("The Word Is Vowel");
        }else if (character=='o'){
            System.out.println("The Word Is Vowel");
        }else if (character=='u'){
            System.out.println("The Word Is Vowel");
        }else if (character=='A'){
            System.out.println("The Word Is Vowel");
        }else if (character=='E'){
            System.out.println("The Word Is Vowel");
        }else if (character=='I'){
            System.out.println("The Word Is Vowel");
        }else if (character=='O'){
            System.out.println("The Word Is Vowel");
        }else if (character=='U'){
            System.out.println("The Word Is Vowel");
        }else{
            System.out.println("The Word Is Consonant");
        }
    }
}
