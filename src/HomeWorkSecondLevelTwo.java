public class HomeWorkSecondLevelTwo {
    public static void main(String[] args) {
        //First way
        long feliksLivedSeconds = 3_011_456_567L;
        long feliksLivedYears = ((((feliksLivedSeconds/60)/60)/24)/365);
        System.out.println(feliksLivedYears);

        //Second way
        long feliksLivedSec = 3_011_456_567L;
        int minHour = 60;
        int hoursInADay = 24;
        int yearFays = 365;
        long totalYearsLivedFeliks = (feliksLivedSeconds/minHour/minHour/hoursInADay/yearFays);
        System.out.println(totalYearsLivedFeliks);
    }
}
