import java.util.Arrays;
import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    } // constructor()

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    } // getLastWeek()

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    } // getToday()

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    } // incrementTodaysCount()

    public boolean hasDayWithoutBirds() {
        return IntStream.of(birdsPerDay).anyMatch(n -> n == 0);      
    } // hasDaysWithoutBirds(

    public int getCountForFirstDays(int numberOfDays) {

        int count = 0;

        if (numberOfDays >= birdsPerDay.length ) {
            return Arrays.stream(birdsPerDay).sum();
        }
        
        for (int i = 0; i <= numberOfDays-1; i++){
            count += birdsPerDay[i];
        }

        return count;
        
    } // getCountForFirstDays()

    public int getBusyDays() {

        return (int) Arrays.stream(birdsPerDay).filter(n-> n >= 5).count();
    
    } // getBusyDays()
}
