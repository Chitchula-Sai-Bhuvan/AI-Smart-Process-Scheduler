import java.util.*;

public class PriorityScheduling {

    void execute(ArrayList<Process> processes) {

        processes.sort(
            Comparator.comparingInt(p -> p.priority)
        );

        int currentTime = 0;

        for(Process p : processes) {

            currentTime += p.burstTime;

            p.completionTime = currentTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            System.out.println(
                "P" + p.pid +
                " Priority=" + p.priority +
                " WT=" + p.waitingTime +
                " TAT=" + p.turnaroundTime
            );
        }

        Metrics.calculate(processes);
    }
}