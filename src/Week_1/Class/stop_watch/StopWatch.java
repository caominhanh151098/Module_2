package Week_1.Class.stop_watch;

import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch() {
        this.startTime = LocalDateTime.now();
    }

    public LocalDateTime getterStartTime() {
        return this.startTime;
    }

    public LocalDateTime getterEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = LocalDateTime.now();
    }

    public void stop() {
        this.endTime = LocalDateTime.now();
    }

    public long getElapsedTime() {
        return java.time.Duration.between(this.startTime, this.endTime).toMillis();
    }
}
