public class County {
    private String name;
    private int fips;
    private Election2016 election2016;
    private Education2016 education2016;
    private Employment2016 employ2016;

    public County(String name, int fips) {
        this.name = name;
        this.fips = fips;
        election2016 = new Election2016(-1, -1, -1);
        education2016 = new Education2016(-1, -1, -1, -1);
        employ2016 = new Employment2016(-1, -1, -1, -1);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public Election2016 getVote2016() {
        return election2016;
    }

    public void setElection2016(Election2016 elec2016) {
        this.election2016 = elec2016;
    }

    public Education2016 getEducation2016() {
        return education2016;
    }

    public void setEducation2016(Education2016 education2016) {
        this.education2016 = education2016;
    }

    public Employment2016 getEmploy2016() {
        return employ2016;
    }

    public void setEmploy2016(Employment2016 empl2016) {
        this.employ2016 = empl2016;
    }

    public String toString(){
        return fips + "," + name + "," + election2016.toString() + "," + education2016.toString() + "," + employ2016.toString();
    }
}