public class FuelPump {
    private int fuelCounter;
    private GasTank gasTank;

    public FuelPump(GasTank gasTank){
        setGasTank(gasTank);
    }

    public void extractGas(int litres){
        fuelCounter += gasTank.subtractGas(litres);
    }

    public int getTurnover(int price){
        return getFuelCounter() * price;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    public int getFuelCounter() {
        return fuelCounter;
    }
}
