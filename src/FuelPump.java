public class FuelPump {
    private int fuelCounter;
    private GasTank gasTank;

    /**
     * Constructs a fuel pump which is attached to a gas tank
     * @param gasTank the gas tank the fuel pump should attach to
     */
    public FuelPump(GasTank gasTank){
        setGasTank(gasTank);
    }

    /**
     * Extract a specified amount of gas from the gas tank using the
     * fuel pump. The amount extracted will be added to this fuel counter
     * @param litres the amount to extract
     */
    public void extractGas(int litres){
        fuelCounter += gasTank.subtractGas(litres);
    }

    /**
     * Gets the current turnover for the pump
     * @param price the price of 1 liter of gas
     * @return the current turnover
     */
    public int getTurnover(int price){
        return getFuelCounter() * price;
    }

    /**
     * Attached the fuel pump to a specified gas tank
     * @param gasTank a GasTank object
     */
    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    /**
     * Gets the amount of gas extracted from this fuel pump
     * @return the amount of gas extracted
     */
    public int getFuelCounter() {
        return fuelCounter;
    }
}
