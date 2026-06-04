import java.util.*;

public class Metrics {

    static void calculate(ArrayList<Process> processes) {

        double totalWT = 0;
        double totalTAT = 0;

        for(Process p : processes) {

            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        System.out.println(
            "Average WT = " +
            totalWT / processes.size()
        );

        System.out.println(
            "Average TAT = " +
            totalTAT / processes.size()
        );

        System.out.println();
    }
}