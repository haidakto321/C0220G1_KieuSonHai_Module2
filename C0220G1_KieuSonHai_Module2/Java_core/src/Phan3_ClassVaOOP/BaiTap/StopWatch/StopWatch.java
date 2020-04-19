package Phan3_ClassVaOOP.BaiTap.StopWatch;


public class StopWatch {
    private long startTime=System.currentTimeMillis();
    private long stopTime=System.currentTimeMillis();

    public void start() {
        this.startTime=System.currentTimeMillis();
    }
    public void stop() {
        this.stopTime=System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getStopTime() {
        return stopTime;
    }
    public long getElapsedTime() {
        return getStopTime()-getStartTime();
    }
}

