package io.codelex.classesandobjects.practice.videostore;


import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
        VideoStore newStore = new VideoStore();

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to see store's inventory");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard, newStore);
                    break;
                case 2:
                    rentVideo(keyboard, newStore);
                    break;
                case 3:
                    returnVideo(keyboard, newStore);
                    break;
                case 4:
                    showInentory(newStore);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore newStore) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            int enterRating = scanner.nextInt();
            Video movieOne = new Video(movieName, false, enterRating);
            newStore.addVideo(movieOne);
        }
    }

    private static void rentVideo(Scanner scanner, VideoStore newStore) {
        System.out.println("Enter name of movie that you want to rent");
        String rentMovie = scanner.next();
        newStore.checkout(rentMovie);

    }

    private static void returnVideo(Scanner scanner, VideoStore newStore) {
        System.out.println("Enter name of movie that you want to return");
        String returnMovie = scanner.next();
        Video movieReturn = new Video(returnMovie, true);
        newStore.returnVideo(movieReturn);
    }

    private static void showInentory(VideoStore newStore) {
        newStore.printOutInventory();
    }
}
