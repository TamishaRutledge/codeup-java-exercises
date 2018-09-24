import java.util.Random;
public class ServerNameGenerator {

    String[] adjectives = {
            "slow", "tenacious", "big", "crazy", "skinny", "untoward", "perplexed", "tired", "energetic", "scared"
    };
    String[] nouns = {
            "rodeo", "dog", "computer", "lion", "football", "tiger", "bear", "zebra", "baseball", "tv"
    };

    String randomWordPick(String[] words){
        Random randy = new Random();
        int i = randy.nextInt(words.length);
        System.out.println(i);
        return words[i];
    }


    public static void main(String[] args){
        ServerNameGenerator sng = new ServerNameGenerator();
        String word1 = sng.randomWordPick(sng.adjectives);
        String word2 = sng.randomWordPick(sng.nouns);
        System.out.println("Here is your server name:");
        System.out.println(word1 + "-" + word2);
    }
}
