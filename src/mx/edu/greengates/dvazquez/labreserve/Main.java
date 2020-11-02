package mx.edu.greengates.dvazquez.labreserve;

import java.util.Date;
import java.util.List;

public class Main {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Laboratory computerLab1 = new Laboratory(1,"Computer Lab 1","computers");
        computerLab1.setCalendar(10,2020);

        List<LabSlot> slots = computerLab1.getCalendars().get(0).getSlots();

        for (int i = 0; i < slots.size(); i++){
            System.out.println(slots.get(i).toString());
        }

    }
}
