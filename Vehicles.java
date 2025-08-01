class Vehicles {
    private String vehicleType;
    private String vehicleModel;
    private int vehicleYear;

    public Vehicles(String vehicleType, String vehicleModel, int vehicleYear) {
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }
    public void displayVehicleInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Vehicle Year: " + vehicleYear);
    }   
    public static void main(String[] args) {
        Vehicles car = new Vehicles("Jeep", "Jeep", 2025);
        car.displayVehicleInfo();
    }
}
