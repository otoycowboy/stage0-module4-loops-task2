package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        int currentLetter = 0;
        while (currentLetter < length) {
            System.out.print(chars[currentLetter]);
            currentLetter++;
        }
    }
}
