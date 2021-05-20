package MachinePackage;

public class Machine {

    private int ID;
    private int NeededProductionPersons;
    private int NeededTechnicalPersons;
    private int NeededOfficePersons;
    private double ProductionPerHour;
    private long CIPHours;
    private int SharedPeople;


    public int getNeededProductionPersons() {
        return NeededProductionPersons;
    }

    public void setNeededProductionPersons(int neededProductionPersons) {
        NeededProductionPersons = neededProductionPersons;
    }

    public int getNeededTechnicalPersons() {
        return NeededTechnicalPersons;
    }

    public void setNeededTechnicalPersons(int neededTechnicalPersons) {
        NeededTechnicalPersons = neededTechnicalPersons;
    }

    public int getNeededOfficePersons() {
        return NeededOfficePersons;
    }

    public void setNeededOfficePersons(int neededOfficePersons) {
        NeededOfficePersons = neededOfficePersons;
    }

    public double getProductionPerHour() {
        return ProductionPerHour;
    }

    public void setProductionPerHour(double productionPerHour) {
       this.ProductionPerHour = productionPerHour;
    }

    public long getCIPHours() {
        return CIPHours;
    }

    public void setCIPHours(long CIPHours) {
        this.CIPHours = CIPHours;
    }

    public int getSharedPeople() {
        return SharedPeople;
    }

    public void setSharedPeople(int sharedPeople) {
        SharedPeople = sharedPeople;
    }

    public Machine(int iD, int neededProductionPersons, int neededTechnicalPersons, int neededOfficePersons,
                   double productionPerHour, long CIPHours, int sharedPeople) {
        ID=iD;
        NeededProductionPersons = neededProductionPersons;
        NeededTechnicalPersons = neededTechnicalPersons;
        NeededOfficePersons = neededOfficePersons;
        ProductionPerHour = productionPerHour;
        this.CIPHours = CIPHours;
        SharedPeople = sharedPeople;
    }
}
