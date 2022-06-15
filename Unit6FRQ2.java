public class Unit6FRQ2 {
    public static void main(String[] args) {
        System.out.println(getChargingCost(0, 2));
        System.out.println(alexIsACunt(7));
        // System.out.println(getChargeStartTime(7));
    }

    private static int[] rateTable = { 50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200,
            200,
            180, 180, 140, 100, 80, 60 };

    private static int getChargingCost(int startHour, int chargeTime) {
        int total = 0;
        int tempi = 0;
        for (int i = startHour; i < chargeTime + startHour; i++) {
            // System.out.println(tempi);
            tempi = (i > 23) ? (i - 24) : (i);
            total += rateTable[tempi];
        }
        return total;
    }

    public static int getChargeStartTime(int chargeTime) {
        int minTime = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < 24; i++) {
            if (getChargingCost(i, chargeTime) < minTime) {
                minTime = getChargingCost(i, chargeTime);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int alexIsACunt(int chargeTime) {
        int chad = 0;
        int england = 760;
        int dart = 0;
        for (int i = 0; i < rateTable.length; i++) {
            chad = getChargingCost(i, chargeTime);
            if (chad <= england) {
                england = chad;
                dart = england;
            } else {
                england = chad;
            }
        }
        return dart;
    }
}