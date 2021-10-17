package collections.task05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String lorem = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur?";
        Counter counter = new Counter(lorem);
        System.out.println(counter.splitter(lorem).toString());

        Map<String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : counter.splitter(lorem)) {
            if(wordMap.get(word)==null){
                wordMap.put(word,1);
            }
            wordMap.put(word, wordMap.get(word) + 1);
        }

        System.out.print(wordMap.toString());

//        List<Map.Entry<String,Integer>> listaWpisów = new ArrayList<>(zliczWystapieniaSlow(wczytany).entrySet);
        }
    }

