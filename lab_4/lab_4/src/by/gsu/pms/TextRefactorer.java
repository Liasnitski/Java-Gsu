package by.gsu.pms;

public class TextRefactorer {

    public static StringBuilder deleteSpaces(StringBuilder text) {
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ' & text.charAt(i + 1) == ' ') {
                text.deleteCharAt(i);
                i--;
            }
        }

        return text;
    }

    public static Word[] findAllWordsWithSearchedSymbol(StringBuilder text, char searchedLetter) {

        StringBuilder tempWord = new StringBuilder();
        Word[] words = new Word[512];
        int j = 0;
        String[] strWords = new String[512];
        for (int i = 0; i < text.length(); i++) {
            tempWord.append(text.charAt(i));
            if (!tempWord.toString().equals(" ") & (text.charAt(i) == ' ' | text.charAt(i) == '.' | text.charAt(i) == ',' | text.charAt(i) == '?' | text.charAt(i) == '!')) {
                strWords[j] = tempWord.toString().strip().replaceAll("[.,!?]", "");
                j++;
                tempWord.setLength(0);
            }
        }
        j = 0;

        for (int i = 0; i < strWords.length; i++) {
            int numberOfCharacterRepetitions = 0;
            if (strWords[i] != null) {
                String tempStr = strWords[i];
                for (int k = 0; k < tempStr.length(); k++) {
                    if (tempStr.charAt(k) == searchedLetter) {
                        numberOfCharacterRepetitions++;
                    }
                }

                if (numberOfCharacterRepetitions > 0) {
                    words[j] = new Word(tempStr, numberOfCharacterRepetitions);
                    j++;
                }
            }
        }
        return words;
    }

    public static Word[] filterNullValues(Word[] tempWords) {

        int notNullValues = 0;
        for (int i = 0; i < tempWords.length; i++) {
            if (tempWords[i] != null ) {
                notNullValues++;
            }
        }

        int j = 0;
        Word[] filteredWords = new Word[notNullValues];
        for (int i = 0; i < tempWords.length; i++) {
            if (tempWords[i] != null ) {
                filteredWords[j] = tempWords[i];
                j++;
            }
        }

        return filteredWords;
    }
}
