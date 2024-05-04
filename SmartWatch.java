package cl.praxis.miprimerjava.desafio5;

import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> filteredSteps = clearSteps(args);
        double averageSteps = calculateAverage(filteredSteps);
        System.out.printf("El promedio de pasos es: %.0f\n", averageSteps);
    }
    public static ArrayList<Integer> clearSteps(String[] steps) {
    ArrayList<Integer> filteredSteps = new ArrayList<>();
    for (String step : steps) {
        try {
            int stepCount = Integer.parseInt(step);
            if (stepCount >= 200 && stepCount <= 100000) {
                filteredSteps.add(stepCount);
            }
        } catch (NumberFormatException e) {
            // Ignorar valores que no son enteros
        }
    }
    return filteredSteps;
}

    public static double calculateAverage(ArrayList<Integer> steps) {
        if (steps.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int step : steps) {
            sum += step;
        }
        return (double) sum / steps.size();
    }


}
