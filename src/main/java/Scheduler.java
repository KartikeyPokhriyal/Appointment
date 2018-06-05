import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Scheduler {
    Appointment appointment;
    ArrayList<Appointment> appointments = new ArrayList<>();

    public Scheduler(Appointment appointment) {
        this.appointment = appointment;
    }

    public void addAppointment() {
        appointments.add(appointment);
    }


    public boolean isPresent(Appointment doctor_appointment) {
        if(appointments.contains(doctor_appointment)) {
            return true;
        }
        return false;
    }

    public String notifyMe() {

        for (Appointment appointment : appointments) {

            if (new Date().compareTo(appointment.date) == 0) {
                return "You have an appointment today";
            } else if (new Date().compareTo(appointment.date) > 0) {
                return "The appointment date is not here yet";
            }

            if (new Date().compareTo(appointment.date) < 0) {
                return "You missed the appointment";
            }
        }
        return "There is no appointment";
    }
}
