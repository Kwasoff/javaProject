package objects;

public class WaterTracker {

    int totalWaterIntake = 0;

    int dailyWaterGoal = 3700;
    public void addWater(int amount) {
        if (amount >= 0) {
            totalWaterIntake += amount;
        }
        else
            System.out.println("ERROR: amount is positive number only!");
    }

    public int getWaterIntake(){
        return totalWaterIntake;

    }

    public String getStatus(){
        if (totalWaterIntake >= 2000){
            return "You are hydrated!";
        }
        return "You need to drink more water.";
    }

    public String setDailyWaterGoal(){
        if (totalWaterIntake >= dailyWaterGoal){
            return "Daily water goal is succeed";
        }
        else
            return  (dailyWaterGoal - totalWaterIntake) + " is to the goal! Keep drinking";
    }

    public void resetTotalWaterIntake(){
        totalWaterIntake = 0;
        System.out.println("Total water intake was reset. Start with 0 again");
    }


    public static void main(String[] args) {
        WaterTracker waterTracker1 = new WaterTracker();

        waterTracker1.addWater(3000);
        System.out.println(waterTracker1.getWaterIntake());

        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getWaterIntake());

        System.out.println(waterTracker1.getStatus());

        System.out.println(waterTracker1.setDailyWaterGoal());

        waterTracker1.resetTotalWaterIntake();

        System.out.println(waterTracker1.totalWaterIntake);







    }

}
