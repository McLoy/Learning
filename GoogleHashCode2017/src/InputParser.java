import entity.Video;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputParser {

    static int videosCount;

    public static void main(String[] args) {
        InputParser obj = new InputParser();
        obj.getFile("me_at_the_zoo.in");
    }

    private void getFile(String fileName) {

        StringBuilder result = new StringBuilder("");
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        List<Video> allVideos = new ArrayList<>();



        try (Scanner scanner = new Scanner(file)) {

            //while (scanner.hasNext()) {
//                strings.add(scanner.nextLine());
//                String line = scanner.nextLine();



                int videosCount = scanner.nextInt();
                int endPointsCount = scanner.nextInt();
                int requestDescriptionsCount = scanner.nextInt();
                int cachesCount = scanner.nextInt();
                int cacheSize = scanner.nextInt();

                for (int i = 0; i < videosCount; i++) {
                    allVideos.add(new Video(i, scanner.nextInt())); //Sizes of each video
                }





//
//                result.append(line).append("\n");
            //}

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        return strings;

    }

}