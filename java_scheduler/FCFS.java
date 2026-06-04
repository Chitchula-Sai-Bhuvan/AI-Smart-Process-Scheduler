import java.util.*;

public class FCFS {

    void execute(ArrayList<Process> processes) {

        int currentTime = 0;

        for(Process p : processes) {

            currentTime += p.burstTime;

            p.completionTime = currentTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            System.out.println(
                "P" + p.pid +
                " WT=" + p.waitingTime +
                " TAT=" + p.turnaroundTime
            );
        }

        Metrics.calculate(processes);
    }
}