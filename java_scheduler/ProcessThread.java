public class ProcessThread extends Thread {

    Process process;

    ProcessThread(Process process) {
        this.process = process;
    }

    public void run() {

        try {

            System.out.println(
                "Process P" + process.pid + " Started"
            );

            Thread.sleep(process.burstTime * 1000);

            System.out.println(
                "Process P" + process.pid + " Completed"
            );

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}