class TotalDistTravelled {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int fuelUsed = 0;
        while(mainTank > 0) {
            fuelUsed++;
            mainTank--;
            if(fuelUsed != 0 && fuelUsed%5 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        return fuelUsed*10;
    }
}
