import java.util.*;

public class RoundRobin {

    void execute(ArrayList<Process> processes, int quantum) {

        Queue<Process> queue =
            new LinkedList<>(processes);

        int currentTime = 0;

        while(!queue.isEmpty()) {

            Process p = queue.poll();

            if(p.remainingTime > quantum) {

                System.out.println(
                    "P" + p.pid +
                    " executes for " + quantum
                );

                currentTime += quantum;

                p.remainingTime -= quantum;

                queue.add(p);
            }
            else {

                currentTime += p.remainingTime;

                p.completionTime = currentTime;

                p.turnaroundTime =
                    p.completionTime - p.arrivalTime;

                p.waitingTime =
                    p.turnaroundTime - p.burstTime;

                System.out.println(
                    "P" + p.pid +
                    " Completed WT=" +
                    p.waitingTime
                );
            }
        }

        Metrics.calculate(processes);
    }
}