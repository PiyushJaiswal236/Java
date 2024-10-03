package sept_28;

class InheritanceDemo {
    public static void main(String[] args) {
        SmartPhone samsungGalaxyS1 = new SmartPhone(30, 2, true, true, true, 10000, 4, 64, "Android");
        samsungGalaxyS1.showInfo();
        samsungGalaxyS1.generateBill();

        FeaturePhone nokia3310 = new FeaturePhone(5, 2, true, true, false, 2500, 0, 0, "N/A");
        nokia3310.showInfo();
        nokia3310.generateBill();
    }
}

class ElectronicDevice {
    int powerConsumption;
    int warrantyPeriod;
    boolean hasBattery;
    boolean canCall;
    boolean isAddictive;
    double price;

    public ElectronicDevice(int powerConsumption, int warrantyPeriod, boolean hasBattery, boolean canCall, boolean isAddictive, double price) {
        this.powerConsumption = powerConsumption;
        this.warrantyPeriod = warrantyPeriod;
        this.hasBattery = hasBattery;
        this.canCall = canCall;
        this.isAddictive = isAddictive;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Warranty Period: " + warrantyPeriod);
        System.out.println("Has Battery: " + hasBattery);
        System.out.println("Can Call: " + canCall);
        System.out.println("Is Addictive: " + isAddictive);
        System.out.println("Price: " + price);
    }
}

class Mobile extends ElectronicDevice {
    int ram;
    int storage;
    String os;

    public Mobile(int powerConsumption, int warrantyPeriod, boolean hasBattery, boolean canCall, boolean isAddictive, double price, int ram, int storage, String os) {
        super(powerConsumption, warrantyPeriod, hasBattery, canCall, isAddictive, price);
        this.ram = ram;
        this.storage = storage;
        this.os = os;
    }

    void showInfo() {
        super.showInfo();
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("OS: " + os);
    }

    void generateBill() {
        System.out.println("Bill Generated");
    }
}

class FeaturePhone extends Mobile {
    public FeaturePhone(int powerConsumption, int warrantyPeriod, boolean hasBattery, boolean canCall, boolean isAddictive, double price, int ram, int storage, String os) {
        super(powerConsumption, warrantyPeriod, hasBattery, canCall, isAddictive, price, ram, storage, os);
    }
}

class SmartPhone extends Mobile {
    public SmartPhone(int powerConsumption, int warrantyPeriod, boolean hasBattery, boolean canCall, boolean isAddictive, double price, int ram, int storage, String os) {
        super(powerConsumption, warrantyPeriod, hasBattery, canCall, isAddictive, price, ram, storage, os);
    }
}

class Telephone extends ElectronicDevice {
    int numberOfLines;

    public Telephone(int powerConsumption, int warrantyPeriod, boolean hasBattery, boolean canCall, boolean isAddictive, double price, int numberOfLines) {
        super(powerConsumption, warrantyPeriod, hasBattery, canCall, isAddictive, price);
        this.numberOfLines = numberOfLines;
    }

    void showInfo() {
        super.showInfo();
        System.out.println("Number of Lines: " + numberOfLines);
    }

    void generateBill() {
        System.out.println("Bill Generated");
    }
}
