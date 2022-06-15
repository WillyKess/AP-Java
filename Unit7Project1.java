public class Unit7Project1 {
    public static void main(String[] args) {
        FriendGroup homies = new FriendGroup();
        homies.addFriend(new Friend("Tim", 4));
        homies.addFriend(new Friend("Mary", 4));
        homies.addFriend(new Friend("Tom", 3));
        homies.addFriend(new Friend("Tam", 2));
        homies.displayFriends();// should list all friends
        homies.addFriend(3, new Friend("Terry", 3));
        homies.addFriend(new Friend("Carrie", 1));
        homies.displayFriends();// should list all friends
        homies.listFriends(2);// should list Tam
        System.out.println(homies.improveFriend("Terry")); // false
        homies.displayFriends();// Should not promote Terry
        System.out.println(homies.improveFriend("Carrie"));// true
        homies.listFriends(2);// should list Tam and Carrie
        homies.removeFriend("Mary");
        homies.listFriends(4);
        System.out.println(homies.improveFriend("Terry"));// true
        homies.removeAll(3);
        homies.displayFriends();
        System.out.println(homies.findFriend("Tam"));
    }
}
