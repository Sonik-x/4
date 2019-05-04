public class Loader {
    public static void main(String[] args) {
        String text = "In the 1980s, bumper stickers and T-shirts with the phrase \"Eddie Would Go\" spread around the Hawaiian Islands and to the rest of the world. According to maritime historian Mac Simpson, \"Aikau was a legend on the North Shore, pulling people out of waves that no one else would dare to. That's where the saying came from – Eddie would go, when no one else would or could. Only Eddie dared.\" The phrase originated during the first Eddie contest. The waves were huge and the conditions were extremely dangerous. While the contest organizers were discussing whether to put it on, Mark Foo looked at the conditions and said \"Eddie would go.\" The phrase stuck and then Eddie went.";
        String[] words = text.split("\\s");

        //System.out.println(words.length); - 118 слов

        for (String str : words){
            System.out.println(str);
        }


    }
}
