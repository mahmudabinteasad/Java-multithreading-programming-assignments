class BasicThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
    public static void main(String[] args) {

        Runnable runnable = new BasicThread();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}