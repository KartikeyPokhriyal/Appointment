import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AppointmentTest {

    @Test
    public void shouldAddMyAppointment() {
        Appointment doctor_appointment = new Appointment("Katy", new Date(2018, 5, 12, 12,45));
        Scheduler patrick = new Scheduler(doctor_appointment);

        assertTrue(patrick.isPresent(doctor_appointment));
    }

}
