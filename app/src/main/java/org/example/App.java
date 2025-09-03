package org.example;

public class App {
    public static void main(String[] args) {
      Hofstadter hofstadter = new Hofstadter();
        System.out.println(hofstadter.gSequence(0));
        System.out.println(hofstadter.gSequence(1));
        System.out.println(hofstadter.gSequence(2));
        System.out.println(hofstadter.gSequence(3));
        System.out.println(hofstadter.gSequence(4));
        System.out.println(hofstadter.gSequence(5));
        System.out.println(hofstadter.gSequence(6));
        System.out.println(hofstadter.gSequence(220));


        System.out.println(hofstadter.gSequenceMem(0));
        System.out.println(hofstadter.gSequenceMem(1));
        System.out.println(hofstadter.gSequenceMem(2));
        System.out.println(hofstadter.gSequenceMem(3));
        System.out.println(hofstadter.gSequenceMem(4));
        System.out.println(hofstadter.gSequenceMem(5));
        System.out.println(hofstadter.gSequenceMem(6));

    }
}
