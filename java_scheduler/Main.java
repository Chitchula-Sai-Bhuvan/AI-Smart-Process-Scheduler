import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Process> processes = new ArrayList<>();

        processes.add(new Process(1, 5, 0, 2));
        processes.add(new Process(2, 3, 1, 1));
        processes.add(new Process(3, 8, 2, 3));
        processes.add(new Process(4, 6, 3, 2));

        System.out.println("================ FCFS ================");

        FCFS fcfs = new FCFS();
        fcfs.execute(SchedulerUtils.copyProcesses(processes));

        System.out.println("================ SJF ================");

        SJF sjf = new SJF();
        sjf.execute(SchedulerUtils.copyProcesses(processes));

        System.out.println("================ ROUND ROBIN ================");

        RoundRobin rr = new RoundRobin();
        rr.execute(SchedulerUtils.copyProcesses(processes), 2);

        System.out.println("================ PRIORITY ================");

        PriorityScheduling ps = new PriorityScheduling();
        ps.execute(SchedulerUtils.copyProcesses(processes));

        System.out.println("================ THREAD EXECUTION ================");

        for(Process p : processes) {
            ProcessThread t = new ProcessThread(p);
            t.start();
        }
    }
}