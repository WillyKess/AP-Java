import java.util.ArrayList;

public class FriendGroup {
    private ArrayList<Friend> friends = new ArrayList<Friend>();
    private final int MAX_IN_LEVEL = 2;

    public FriendGroup() {
    }

    public FriendGroup(ArrayList<Friend> friends) {
    }

    public void displayFriends() {
        String allFriends = "";
        for (Friend friend : friends) {
            allFriends += (friend.toString());
        }
        System.out.println(allFriends);
    }

    public Friend findFriend(String name) {
        for (Friend friend : friends) {
            if (friend.getName() == name) {
                return friend;
            }
        }
        return null;
    }

    private ArrayList<Friend> friendsInCat(int level) {
        ArrayList<Friend> friendsWithLevel = new ArrayList<Friend>();
        for (Friend friend : friends) {
            if (friend.getFriendshipLevel() == level) {
                friendsWithLevel.add(friend);
            }
        }
        return friendsWithLevel;

    }

    public void listFriends(int level) {
        String friends2bListed = "";
        for (Friend friend : friendsInCat(level)) {
            friends2bListed += (friend.toString());
        }
        System.out.println(friends2bListed);
    }

    public void addFriend(Friend friend) {
        if (canHoldMore(friend)) {
            friends.add(friend);
        }
    }

    public void addFriend(int index, Friend friend) {
        if (canHoldMore(friend)) {
            friends.add(index, friend);
        }
    }

    public void removeFriend(String name) {
        friends.remove(findFriend(name));
    }

    public void removeAll(int level) {
        for (Friend friend : friendsInCat(level)) {
            friends.remove(friend);
        }
    }

    private boolean canHoldMore(Friend friend) {
        return (friendsInCat(friend.getFriendshipLevel()).size() < MAX_IN_LEVEL);
    }

    public boolean improvable(String name) {
        return ((friendsInCat(findFriend(name).getFriendshipLevel() + 1).size() < MAX_IN_LEVEL)
                && findFriend(name).getFriendshipLevel() < 4);
    }

    public boolean improveFriend(String name) {
        if (improvable(name)) {
            findFriend(name).improveFS();
            return true;
        } else {
            return false;
        }
    }

}
