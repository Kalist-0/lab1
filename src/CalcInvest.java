public class CalcInvest {
    double time;
    double percent;
    double sum;

    public CalcInvest(int time, int percent, int sum) {
        this.time = time;
        this.percent = percent;
        this.sum = sum;
    }

    double calcIncome() {
        return sum *
                (Math.pow((1 + percent / 100), time));
    }
}
