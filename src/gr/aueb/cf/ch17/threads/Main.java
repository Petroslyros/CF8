package gr.aueb.cf.ch17.threads;

public class Main {
    public static void main(String[] args) {
        WorkerThread wt = new WorkerThread();
        Thread thread = new Thread(wt);
        thread.start();  //Non blocking call, it's async

        System.out.println("Hello from Main");
    }
}
