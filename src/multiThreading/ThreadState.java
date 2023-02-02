package multiThreading;

    public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    public static void main(String[] args) {
        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("The state of thread t1 after spawing it - " +
                t1.getState());

        t1.start();

        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
    }

    public void run() {
        WhatNot myObj = new WhatNot();
        Thread t2 = new Thread(myObj);

// thread t2 is created and is currently in the NEW state.
        System.out.println("The state of thread t2 after spawning it - "+ t2.getState());
        t2.start();

// thread t2 is moved to the runnable state
        System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

// try-catch block for the smooth flow of the  program
        try
        {
// moving the thread t1 to the state timed waiting
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );
    }
    }