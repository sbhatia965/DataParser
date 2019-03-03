public class ElectionResult {
    private double demVotes,gopVotes, totalVotes, perDem, perGOP, perPoint;
    private String diff, stateAbbr, countyName;
    private int combinedFips;

    public ElectionResult(double dem_Votes, double gop_Votes, double tot_Votes, double per_Dem, double per_GOP, String dif, double per_point, String state_Abbr, String county_Name, int combinedFips){
        demVotes = dem_Votes;
        gopVotes = gop_Votes;
        totalVotes = tot_Votes;
        perDem = per_Dem;
        perGOP = per_GOP;
        diff = dif;
        perPoint = per_point;
        stateAbbr = state_Abbr;
        countyName = county_Name;
        this.combinedFips = combinedFips;
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

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
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
}
