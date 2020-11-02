package mx.edu.greengates.dvazquez.labreserve;

import java.util.ArrayList;
import java.util.Date;

public class LabCalendar {

    private int[] NUM_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int month;
    private int year;
    private ArrayList<Date> dates;
    private ArrayList<LabSlot> slots;

    private final int P1 = 1;
    private final int P2 = 2;
    private final int P3 = 3;
    private final int P4 = 4;
    private final int P5 = 5;
    private final int P6 = 6;
    private final int P7 = 7;


    LabCalendar(int month, int year){

        this.dates = new ArrayList<Date>();
        this.slots = new ArrayList<LabSlot>();
        for(int numDay = 1; numDay <= NUM_DAYS[month]; numDay++){
            switch (CalUtils.getDayOfWeek(numDay,month,year)){
                case CalUtils.MONDAY:
                case CalUtils.TUESDAY:
                case CalUtils.WEDNESDAY:
                case CalUtils.THURSDAY:
                case CalUtils.FRIDAY:
                    dates.add(CalUtils.getDate(numDay,month,year));
            }
        }

        for (int i = 0; i < dates.size(); i++){
            System.out.println(CalUtils.stringDate(dates.get(i)));
            Date theDate = dates.get(i);
            for (int period = 1; period <=7; period ++){
                slots.add(new LabSlot(theDate.getTime()+period, CalUtils.getDayOfWeek(theDate), theDate,period));
            }

        }
    }

    public ArrayList<Date> getDates() {
        return dates;
    }
    public ArrayList<LabSlot> getSlots() {
        return slots;
    }

}
