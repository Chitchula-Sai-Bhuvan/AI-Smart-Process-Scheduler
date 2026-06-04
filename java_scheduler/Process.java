public class Process {

    int pid;
    int burstTime;
    int arrivalTime;
    int priority;

    int completionTime;
    int waitingTime;
    int turnaroundTime;

    int remainingTime;

    Process(int pid, int burstTime, int arrivalTime, int priority) {

        this.pid = pid;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;

        this.remainingTime = burstTime;
    }
}