package by.gsu.pms;

public class Word implements Comparable<Word> {

    private String word;
    private int numberOfSearchedLetters;
    private int wordLength;

    public Word() { }

    public Word(String word, int numberOfSearchedLetters) {
        this.word = word;
        this.numberOfSearchedLetters = numberOfSearchedLetters;
        this.wordLength = word.length();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumberOfSearchedLetters() {
        return numberOfSearchedLetters;
    }

    public void setNumberOfSearchedLetters(int numberOfSearchedLetters) {
        this.numberOfSearchedLetters = numberOfSearchedLetters;
    }

    public int getWordLength() {
        return wordLength;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    @Override
    public String toString() {
        return word + " : " + numberOfSearchedLetters;
    }

    @Override
    public int compareTo(Word w) {
        if (numberOfSearchedLetters < w.getNumberOfSearchedLetters()) {
            return 1;
        } else if (numberOfSearchedLetters > w.getNumberOfSearchedLetters()) {
            return -1;
        } else {
            return word.compareTo(w.getWord());
        }
    }
}
