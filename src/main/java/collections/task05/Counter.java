package collections.task05;

import java.util.*;

public class Counter {
    private String text;
    //"Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur?";

    public Counter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public List<String> splitter(String text){
        List<String> wordList = new ArrayList<>();
        String[] wordTable = new String[1000];
        text.replaceAll("\\W+"," ");
//        text.replaceAll(","," ");
//        text.replaceAll("!"," ");
//        text.replaceAll("\\?"," ");
//        text.replaceAll("!"," ");
//        text.replaceAll(","," ");
        wordTable = text.toLowerCase().split(" ");
        for (String word:wordTable) {
            wordList.add(word);
        }
        return wordList;
    }
}
