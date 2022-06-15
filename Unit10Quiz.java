public class Unit10Quiz {
    public static void main(String[] args) {
        int[] indexes = { 2, 1, 1 };
        System.out.println(recScramble("epic", indexes, 0));
    }

    public static String recScramble(String str, int[] positions, int k) {
        if (str == null || str.length() == 0)
            return "";

        if (str.length() == 1)
            return str;
        int pos = positions[k];
        String nStr = str.substring(pos, pos + 1);
        str = str.substring(0, pos) + str.substring(pos + 1);
        return nStr + recScramble(str, positions, k + 1);
    }

}


