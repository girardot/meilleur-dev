package trending.topics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int hashTagNumber = Integer.parseInt(sc.nextLine());

        int i = 0;
        List<String> hashtags = new ArrayList<>(hashTagNumber);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            hashtags.add(line.split("#")[1]);
        }

        String trendingTopic = null;

        for (int p = 0; p < (hashTagNumber - 1 - 60); p++) {
            HashMap<String, Integer> countHashTags = new HashMap<>();
            for (int j = 0; j < 60; j++) {
                String hashtag = hashtags.get(j + p);

                if (countHashTags.get(hashtag) == null) {
                    countHashTags.put(hashtag, 1);
                } else if (countHashTags.get(hashtag) < 39) {
                    countHashTags.put(hashtag, countHashTags.get(hashtag) + 1);
                } else {
                    trendingTopic = hashtag;
                    break;
                }
            }
            if (trendingTopic != null) {
                break;
            }
        }

        if (trendingTopic == null) {
            System.out.println("#" + "Pas de trending topic");
        } else {
            System.out.println("#" + trendingTopic);
        }
    }
}