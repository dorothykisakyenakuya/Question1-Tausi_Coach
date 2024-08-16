public class TrainJourney {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance from Kampala to Kabale in Km
        int speedKmPerHour = 250; // Speed of the train in Km/hr
        int stopDistancePassenger = 150; // Distance before stopping to load/offload passengers in Km
        int stopDistanceRefuel = 200; // Distance before stopping to refuel in Km
        int stopTimeMinutes = 5; // Time taken for each stop in minutes

        // Part (i): Compute the number of stops from Kampala to Jinja
        int passengerStops = totalDistance / stopDistancePassenger;
        int refuelStops = totalDistance / stopDistanceRefuel;
        int totalStopsKampalaToJinja = passengerStops + refuelStops;
        System.out.println("Number of stops from Kampala to Jinja: " + totalStopsKampalaToJinja);

        // Part (ii): Compute the total travel time from Kampala to Kabale, considering all stops
        double travelTimeKampalaToKabale = (double) totalDistance / speedKmPerHour;
        double totalTimeKampalaToKabale = travelTimeKampalaToKabale + (totalStopsKampalaToJinja * stopTimeMinutes / 60.0);
        System.out.printf("Total travel time from Kampala to Kabale: %.2f hours%n", totalTimeKampalaToKabale);

        // Part (iii): Compute the total travel time from Kabale to Kampala with only refueling stops
        int totalStopsKabaleToKampala = totalDistance / stopDistanceRefuel;
        double travelTimeKabaleToKampala = (double) totalDistance / speedKmPerHour;
        double totalTimeKabaleToKampala = travelTimeKabaleToKampala + (totalStopsKabaleToKampala * stopTimeMinutes / 60.0);
        System.out.printf("Total travel time from Kabale to Kampala: %.2f hours%n", totalTimeKabaleToKampala);

        // Part (iv): Compute the arrival time for the second coach traveling at 225.5 m/s
        double speedMetersPerSecond = 225.5;
        double speedKmPerHourCoach2 = speedMetersPerSecond * 3.6; // Convert speed to Km/hr
        int startHourCoach2 = 9; // Start time in hours (09:00 hrs)
        double travelTimeCoach2 = totalDistance / speedKmPerHourCoach2;
        double arrivalTimeCoach2 = startHourCoach2 + travelTimeCoach2;
        System.out.printf("Approximate arrival time for the second coach: %.2f hours%n", arrivalTimeCoach2);
    }
}
