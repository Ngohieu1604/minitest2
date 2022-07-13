public class staffFulltime extends Staff{
    private double reward;
    private double fineAmount;
    private double hardSalary;

    public staffFulltime() {}

    public staffFulltime(int staffCode, String name, int age, String phoneNumber, String email, double reward, double fineAmount, double hardSalary) {
        super(staffCode, name, age, phoneNumber, email);
        this.reward = reward;
        this.fineAmount = fineAmount;
        this.hardSalary = hardSalary;

}
    public String toString(){
        return super.toString()+" "+reward+" "+ fineAmount+" "+ hardSalary;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }
    public double getNetSalary(){
        return hardSalary + (reward- fineAmount);
    }
}
