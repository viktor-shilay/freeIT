package homework7.manual.task24;

public class TimePoint {
    private int hours;
    private int minutes;
    private int seconds;

    public TimePoint (int totalSeconds){
        this.seconds = totalSeconds;
    }
    public TimePoint (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int totalSeconds(){
        return hours*24*60 + minutes*60 + seconds;
    }
    public int compareTo(TimePoint obj){
        if (totalSeconds() - obj.totalSeconds()>0){
            return 1;
        }else if (totalSeconds() - obj.totalSeconds()<0){
            return -1;
        }else {
            return 0;
        }
    }
    public String printTime() {
        if (seconds>59){
            minutes = seconds/60;
            hours = minutes/60;
            seconds = seconds%60;
        }
        return"The time point is: " + hours + " hours " + minutes + " minutes " + seconds + " seconds.";
    }
}
