package com.company.lab_4_strings;

import by.gsu.pms.TextRefactorer;
import by.gsu.pms.Word;
import org.w3c.dom.Text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.print("Enter the search letter: ");
        Scanner reader = new Scanner(System.in);
        char searchedLetter = reader.next().charAt(0);

        String filename = "book.txt";
        FileReader file = null;
        try {
            file = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(file);

        StringBuilder text = new StringBuilder();
        while (scanner.hasNext()) {
            text.append(scanner.nextLine()).append(" ");
        }

        TextRefactorer.deleteSpaces(text);

        Word[] words = TextRefactorer.filterNullValues(TextRefactorer.findAllWordsWithSearchedSymbol(text, searchedLetter));

        Arrays.sort(words);

        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].getWord());
        }
    }
}
