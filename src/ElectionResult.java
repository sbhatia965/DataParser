import java.util.*;

public class ElectionResult {
    private double demVotes,gopVotes, totalVotes, perDem, perGOP, diff, perPoint;
    private String stateAbbr, countyName;
    private int combinedFips;

    public ElectionResult(String line){
        String[] initial = line.split(", ");
        //ArrayList<String> vals = removeExtraPunctuation(initial);
        //skipping first value
        demVotes = Double.parseDouble(vals.get(1));
        gopVotes = Double.parseDouble(vals.get(2));
        totalVotes = Double.parseDouble(vals.get(3));
        perDem = Double.parseDouble(vals.get(4));
        perGOP = Double.parseDouble(vals.get(5));
        diff = Double.parseDouble(vals.get(6));
        perPoint = Double.parseDouble(vals.get(7)) / 100; //changing into decimal
        stateAbbr = vals.get(8);
        countyName = vals.get(9);
        combinedFips = Integer.parseInt(vals.get(10));
    }

    private String[] formatCorrectly(String singleLine) {
        int indexOfComma = singleLine.indexOf("\"");
        if (indexOfComma != -1) {
            int nextIndex = singleLine.indexOf("\"", indexOfComma + 1);
            singleLine = singleLine.substring(0, singleLine.indexOf("\"")) + singleLine.substring(indexOfComma, nextIndex).replace(",", "") + singleLine.substring(nextIndex);
        }
        return singleLine.replace("\"", "").split(",");
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
        return demVotes + ", " + gopVotes + ", " + totalVotes + ", " + perDem + ", " + perGOP + ", " + diff + ", " + perPoint + ", " + stateAbbr + ", " + countyName + ", " + combinedFips;
    }
}
