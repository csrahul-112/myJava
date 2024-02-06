public class FriendsPairingProblem {
    public static int friendsPairingProblem(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //single friend 
        int SingleFriend = friendsPairingProblem(n-1);

        //Pair in Friends
        int pairFriends = friendsPairingProblem(n-2);
        //ways of pairing
        int pairingWays = (n-1) * pairFriends;

        //returning total ways
        return SingleFriend + pairingWays;
    }
    public static void main(String args[]){
        int n = 3;
        System.out.println(friendsPairingProblem(n));
    }
}
