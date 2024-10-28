class NamedThread implements Runnable {
    @Override
    public void run() {

        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        Thread thread1 = new Thread(new NamedThread(), "Thread-One");
        Thread thread2 = new Thread(new NamedThread(), "Thread-Two");

        thread1.start();
        thread2.start();
    }
}
