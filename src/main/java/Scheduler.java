import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    Appointment appointment;
    ArrayList<Appointment> appointments = new ArrayList<>();

    public Scheduler(Appointment appointment) {
        appointments.add(appointment);
    }


    public boolean isPresent(Appointment doctor_appointment) {
        if(appointments.contains(doctor_appointment)) {
            return true;
        }
        return false;
    }
}
