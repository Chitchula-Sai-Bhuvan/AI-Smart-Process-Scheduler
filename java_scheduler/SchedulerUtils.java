import java.util.*;

public class SchedulerUtils {

    static ArrayList<Process> copyProcesses(ArrayList<Process> original) {

        ArrayList<Process> copy = new ArrayList<>();

        for(Process p : original) {

            copy.add(
                new Process(
                    p.pid,
                    p.burstTime,
                    p.arrivalTime,
                    p.priority
                )
            );
        }

        return copy;
    }
}