public class batsman extends player {
    private int runs;
    private int century;
    private int half_century;

    public batsman() {
    }

    public batsman(int runs, int century, int half_century) {
        this.runs = runs;
        this.century = century;
        this.half_century = half_century;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getCentury() {
        return century;
    }

    public void setCentury(int century) {
        this.century = century;
    }

    public int getHalf_century() {
        return half_century;
    }

    public void setHalf_century(int half_century) {
        this.half_century = half_century;
    }

    @Override
    public String toString() {
        return "batsman{" +
                "runs=" + runs +
                ", century=" + century +
                ", half_century=" + half_century +
                '}';
    }
}

