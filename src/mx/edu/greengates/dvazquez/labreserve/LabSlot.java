package mx.edu.greengates.dvazquez.labreserve;

import java.util.Date;

public class LabSlot {

    private long id;
    private int dayOfWeek;
    private Date date;
    private int period;
    private boolean free;

    public LabSlot(long id, int dayOfWeek, Date date, int period) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
        this.date = date;
        this.period = period;
        this.free = true;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getPeriod() {
        return period;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "LabSlot{" +
                "id=" + id +
                ", dayOfWeek=" + dayOfWeek +
                ", date=" + date +
                ", period=" + period +
                ", free=" + free +
                '}';
    }
}
