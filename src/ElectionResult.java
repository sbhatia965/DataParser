public class ElectionResult {
    private double demVotes,gopVotes, totalVotes, perDem, perGOP, diff, perPoint;
    private String stateAbbr, countyName;
    private int combinedFips;

    public ElectionResult(String line){
        String[] vals = line.split(", ");
        //skipping first value
        demVotes = Double.parseDouble(vals[1]);
        gopVotes = Double.parseDouble(vals[2]);
        totalVotes = Double.parseDouble(vals[3]);
        perDem = Double.parseDouble(vals[4]);
        perGOP = Double.parseDouble(vals[5]);
        diff = Double.parseDouble(vals[6].substring(1, vals[6].length() - 1)); //removing the quotes
        perPoint = Double.parseDouble(vals[7].substring(0, vals[7].length() - 1)) / 100; //changing into decimal
        stateAbbr = vals[8];
        countyName = vals[9];
        combinedFips = Integer.parseInt(vals[10]);
    }

    public double getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    public double getPerDem() {
        return perDem;
    }

    public void setPerDem(double perDem) {
        this.perDem = perDem;
    }

    public double getPerGOP() {
        return perGOP;
    }

    public void setPerGOP(double perGOP) {
        this.perGOP = perGOP;
    }

    public double getPerPoint() {
        return perPoint;
    }

    public void setPerPoint(double perPoint) {
        this.perPoint = perPoint;
    }

    public double getDiff() {
        return diff;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCombinedFips() {
        return combinedFips;
    }

    public void setCombinedFips(int combinedFips) {
        this.combinedFips = combinedFips;
    }

    public String toString() {
        return demVotes + ", " + gopVotes + ", " + totalVotes + ", " + perDem + ", " + perGOP + ", "
                + diff + ", " + perPoint + ", " + stateAbbr + ", " + countyName + ", " + combinedFips;
    }
}
