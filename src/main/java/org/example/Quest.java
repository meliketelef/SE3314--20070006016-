package org.example;



/**
 * Embodies a quest in Middle-earth that is accomplishable upon meeting specific conditions.
 */
public class Quest {

    /**
     * Determines whether a quest can be completed based on the provided points and ring bearer status.
     * @param points       the points scored for the quest
     * @param isRingBearer whether the character is the ring bearer
     * @return {@code true} if the quest is considered completed, {@code false} otherwise
     */
    public boolean completeQuest(int points, boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        boolean result;

        if(points > 100 && points == 100){
            result= true;
        }else{
            result =  false;
        }

        return result;
    }
}
