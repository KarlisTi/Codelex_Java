package io.codelex.training.Friend;

public class Mains {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Sponebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidwork");
        Friend friend4 = new Friend("Sandy");
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();


    }
}
