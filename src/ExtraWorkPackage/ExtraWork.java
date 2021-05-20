package ExtraWorkPackage;

public abstract class  ExtraWork {

    private int WorkID;
    private String WorkType;
    private String NeededHours;
    private int NeededPersons;

    public int getWorkID() {
        return WorkID;
    }

    public void setWorkID(int workID) {
        WorkID = workID;
    }

    public String getWorkType() {
        return WorkType;
    }

    public void setWorkType(String workType) {
        WorkType = workType;
    }

    public String getNeededHours() {
        return NeededHours;
    }

    public void setNeededHours(String neededHours) {
        NeededHours = neededHours;
    }

    public int getNeededPersons() {
        return NeededPersons;
    }

    public void setNeededPersons(int neededPersons) {
        NeededPersons = neededPersons;
    }

    public ExtraWork(int workID, String workType, String neededHours, int neededPersons) {
        WorkID = workID;
        WorkType = workType;
        NeededHours = neededHours;
        NeededPersons = neededPersons;
    }

}
