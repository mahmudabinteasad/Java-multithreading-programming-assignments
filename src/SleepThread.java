class SleepThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is starting.");

            Thread.sleep(2000);
            System.out.println("Thread " + Thread.currentThread().getName() + " is resuming.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new SleepThread());
        Thread thread2 = new Thread(new SleepThread());

        thread1.start();
        thread2.start();
    }
}