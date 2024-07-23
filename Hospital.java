package Medical;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    private String id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public Patient(String id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber="
                + phoneNumber + "]";
    }

}

class Doctor {
    private String id;
    private String name;
    private String specialization;
    private String phoneNumber;

    public Doctor(String id, String name, String specialization, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", phoneNumber="
                + phoneNumber + "]";
    }

}

class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private Date appointmentDate;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, Date appointmentDate) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment [appointmentId=" + appointmentId + ", patient=" + patient + ", doctor=" + doctor
                + ", appointmentDate=" + appointmentDate + "]";
    }

}

class Hospital2 {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    Hospital hospital = new Hospital();

    public Hospital2() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();

        initializeDoctors();
        initializePatients();

    }

    private void initializeDoctors() {
        doctors.add(new Doctor("D001", "Dr. Rajesh Kumar", "Cardiologist", "9876543210"));
        doctors.add(new Doctor("D002", "Dr. Priya Sharma", "Dermatologist", "9876543211"));
        doctors.add(new Doctor("D003", "Dr. Amit Patel", "Neurologist", "9876543212"));
        doctors.add(new Doctor("D004", "Dr. Anjali Mehta", "Pediatrician", "9876543213"));
        doctors.add(new Doctor("D005", "Dr. Vikram Singh", "Orthopedic", "9876543214"));
        doctors.add(new Doctor("D006", "Dr. Neha Gupta", "Gynecologist", "9876543215"));
        doctors.add(new Doctor("D007", "Dr. Rakesh Verma", "Oncologist", "9876543216"));
        doctors.add(new Doctor("D008", "Dr. Suman Rao", "Psychiatrist", "9876543217"));
        doctors.add(new Doctor("D009", "Dr. Arjun Desai", "Radiologist", "9876543218"));
        doctors.add(new Doctor("D010", "Dr. Kavita Joshi", "Endocrinologist", "9876543219"));
        doctors.add(new Doctor("D011", "Dr. Manish Kapoor", "Gastroenterologist", "9876543220"));
        doctors.add(new Doctor("D012", "Dr. Pooja Nair", "Hematologist", "9876543221"));
        doctors.add(new Doctor("D013", "Dr. Sanjay Kulkarni", "Nephrologist", "9876543222"));
        doctors.add(new Doctor("D014", "Dr. Meera Iyer", "Pulmonologist", "9876543223"));
        doctors.add(new Doctor("D015", "Dr. Anil Chatterjee", "Rheumatologist", "9876543224"));
    }

    private void initializePatients() {
        patients.add(new Patient("P001", "Amit Sharma", 45, "123 Main St, Mumbai", "9123456780"));
        patients.add(new Patient("P002", "Neha Verma", 34, "456 Park Ave, Delhi", "9123456781"));
        patients.add(new Patient("P003", "Ravi Kumar", 29, "789 Elm St, Bangalore", "9123456782"));
        patients.add(new Patient("P004", "Priya Singh", 52, "101 Maple St, Chennai", "9123456783"));
        patients.add(new Patient("P005", "Anil Mehta", 40, "202 Oak St, Kolkata", "9123456784"));
        patients.add(new Patient("P006", "Sunita Patel", 37, "303 Pine St, Pune", "9123456785"));
        patients.add(new Patient("P007", "Rajesh Gupta", 50, "404 Cedar St, Hyderabad", "9123456786"));
        patients.add(new Patient("P008", "Kavita Joshi", 28, "505 Birch St, Ahmedabad", "9123456787"));
        patients.add(new Patient("P009", "Vikram Desai", 33, "606 Walnut St, Jaipur", "9123456788"));
        patients.add(new Patient("P010", "Meera Iyer", 47, "707 Chestnut St, Lucknow", "9123456789"));
        patients.add(new Patient("P011", "Suresh Reddy", 55, "808 Spruce St, Bhopal", "9123456790"));
        patients.add(new Patient("P012", "Anjali Nair", 42, "909 Fir St, Patna", "9123456791"));
        patients.add(new Patient("P013", "Rakesh Chatterjee", 38, "1010 Ash St, Ludhiana", "9123456792"));
        patients.add(new Patient("P014", "Pooja Kapoor", 31, "1111 Willow St, Indore", "9123456793"));
        patients.add(new Patient("P015", "Sanjay Rao", 49, "1212 Poplar St, Nagpur", "9123456794"));
        patients.add(new Patient("P016", "Nisha Kulkarni", 36, "1313 Cypress St, Kanpur", "9123456795"));
        patients.add(new Patient("P017", "Amitabh Singh", 44, "1414 Redwood St, Surat", "9123456796"));
        patients.add(new Patient("P018", "Geeta Verma", 27, "1515 Palm St, Thane", "9123456797"));
        patients.add(new Patient("P019", "Rohit Sharma", 53, "1616 Cedar St, Nashik", "9123456798"));
        patients.add(new Patient("P020", "Sneha Patel", 39, "1717 Maple St, Faridabad", "9123456799"));
        patients.add(new Patient("P021", "Vikas Gupta", 32, "1818 Oak St, Rajkot", "9123456700"));
        patients.add(new Patient("P022", "Anita Joshi", 46, "1919 Pine St, Varanasi", "9123456701"));
        patients.add(new Patient("P023", "Manoj Desai", 41, "2020 Elm St, Amritsar", "9123456702"));
        patients.add(new Patient("P024", "Ritu Iyer", 35, "2121 Birch St, Jodhpur", "9123456703"));
        patients.add(new Patient("P025", "Arun Reddy", 48, "2222 Walnut St, Madurai", "9123456704"));
        patients.add(new Patient("P026", "Shweta Nair", 30, "2323 Chestnut St, Agra", "9123456705"));
        patients.add(new Patient("P027", "Naveen Chatterjee", 54, "2424 Spruce St, Meerut", "9123456706"));
        patients.add(new Patient("P028", "Divya Kapoor", 43, "2525 Fir St, Ranchi", "9123456707"));
        patients.add(new Patient("P029", "Kiran Rao", 37, "2626 Ash St, Gwalior", "9123456708"));
        patients.add(new Patient("P030", "Ramesh Kulkarni", 50, "2727 Willow St, Jabalpur", "9123456709"));
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void viewPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void viewDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void viewAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    public Patient getPatientById(String id) {
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    public Doctor getDoctorById(String id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }
}

public class Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        Hospital2 hospital1 = new Hospital2();

        while (true) {
            System.out.println("============= Welcome To Mediclaim Portal ================");
            System.out.println("= Choose Option :");
            System.out.println(" 1 : Add New Patient ");
            System.out.println(" 2 : View Existing Patients ");
            System.out.println(" 3 : View Doctors ");
            System.out.println(" 4 : Book Appointments ");
            System.out.println(" 5 : View Appointments ");
            System.out.println(" 6 : Exit ");
            System.out.print("Enter Option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Address: ");
                    String patientAddress = scanner.nextLine();
                    System.out.print("Enter Patient Phone Number: ");
                    String patientPhoneNumber = scanner.nextLine();
                    Patient newPatient = new Patient(patientId, patientName, patientAge, patientAddress,
                            patientPhoneNumber);
                    hospital1.addPatient(newPatient);
                    System.out.println("Patient added successfully!");
                    break;
                case 2:
                    System.out.println("Existing Patients:");
                    hospital1.viewPatients();
                    break;
                case 3:
                    System.out.println("Doctors:");
                    hospital1.viewDoctors();
                    break;
                case 4:
                    System.out.print("Enter Appointment ID: ");
                    String appointmentId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String apptPatientId = scanner.nextLine();
                    Patient apptPatient = hospital1.getPatientById(apptPatientId);
                    if (apptPatient == null) {
                        System.out.println("Patient not found!");
                        break;
                    }
                    System.out.print("Enter Doctor ID: ");
                    String apptDoctorId = scanner.nextLine();
                    Doctor apptDoctor = hospital1.getDoctorById(apptDoctorId);
                    if (apptDoctor == null) {
                        System.out.println("Doctor not found!");
                        break;
                    }
                    System.out.print("Enter Appointment Date and Time (dd-MM-yyyy HH:mm): ");
                    String dateTimeStr = scanner.nextLine();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                    Date appointmentDate;
                    try {
                        appointmentDate = dateFormat.parse(dateTimeStr);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format! Please try again.");
                        break;
                    }
                    Appointment newAppointment = new Appointment(appointmentId, apptPatient, apptDoctor,
                            appointmentDate);
                    hospital1.bookAppointment(newAppointment);
                    System.out.println("Appointment booked successfully!");
                    break;
                case 5:
                    System.out.println("Appointments:");
                    hospital1.viewAppointments();
                    break;
                case 6:
                    System.out.println("Exiting... | Thank you for using Mediclaim Portal");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}