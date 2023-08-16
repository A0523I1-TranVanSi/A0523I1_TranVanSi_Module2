package Exercise;

import java.util.Scanner;

public class StopWatch {
    private long startTime ;
    private long endTime ;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch(){

    }

    public long start(){
        return this.startTime = System.currentTimeMillis() ;
    }

    public  long stop(){
        return this.endTime = System.currentTimeMillis() ;
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch() ;
        System.out.print("Enter 1 . Start : ");
        int start = sc.nextInt();
        long begin = watch.start();
        System.out.print("Enter 2 . End : ");
        int stop = sc.nextInt();
        long end = watch.stop();
        long total = watch.getElapsedTime();
        System.out.println("Thoi gian thuc thi cua thuat toan la " + total);
    }
}
