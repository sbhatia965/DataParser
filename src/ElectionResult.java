import java.util.*;

public class ElectionResult {
    private double demVotes,gopVotes, totalVotes, perDem, perGOP, diff, perPoint;
    private String stateAbbr, countyName;
    private int combinedFips;

    public ElectionResult(String line){
        String[] individualVals = formatCorrectly(line);
        //skipping first value
        demVotes = Double.parseDouble(individualVals[1]);
        gopVotes = Double.parseDouble(individualVals[2]);
        totalVotes = Double.parseDouble(individualVals[3]);
        perDem = Double.parseDouble(individualVals[4]);
        perGOP = Double.parseDouble(individualVals[5]);
        diff = Double.parseDouble(individualVals[6]);
        perPoint = Double.parseDouble(individualVals[7].substring(0, individualVals[7].length() - 1)) / 100; //changing into decimal
        stateAbbr = individualVals[8];
        countyName = individualVals[9];
        combinedFips = Integer.parseInt(individualVals[10]);
    }

    private String[] formatCorrectly(String singleLine) {
        int indexOfComma = singleLine.indexOf("\"");
        if (indexOfComma != -1) {
            int nextIndex = singleLine.indexOf("\"", indexOfComma + 1);
            singleLine = singleLine.substring(0, singleLine.indexOf("\"")) + singleLine.substring(indexOfComma, nextIndex).replace(",", "") + singleLine.substring(nextIndex);
        }
        return singleLine.replace("\"", "").trim().split(",");
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
