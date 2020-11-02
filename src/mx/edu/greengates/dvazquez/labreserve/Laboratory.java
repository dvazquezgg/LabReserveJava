package mx.edu.greengates.dvazquez.labreserve;

import java.util.ArrayList;

public class Laboratory {

    private long id;
    private String name;
    private String type;

    private ArrayList<LabCalendar> calendars;

    Laboratory(long id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
        this.calendars = new ArrayList<LabCalendar>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setCalendar(int month, int year){
        LabCalendar calendar = new LabCalendar(month,year);
        calendars.add(calendar);
    }

    public ArrayList<LabCalendar> getCalendars(){
        return this.calendars;
    }

}
