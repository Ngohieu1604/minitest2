public class staffParttime extends Staff {
    private double worikingHours;

    public staffParttime() {
    }

    public staffParttime(int staffCode, String name, int age, String phoneNumber, String email, double worikingHours) {
        super(staffCode, name, age, phoneNumber, email);
        this.worikingHours = worikingHours;
    }

    public double getWorikingHours() {
        return worikingHours;
    }

    public void setWorikingHours(double worikingHours) {
        this.worikingHours = worikingHours;
    }

    public double getNetSalary(double rates) {
        return worikingHours * rates;
    }
}
