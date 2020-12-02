public class GasTank {
    private final int GAS_MAX = 1000;
    private final int GAS_MIN = 0;
    private int gas;

    /**
     * Constructs a gas tank with a specified liter amount
     * @param gas the amount to assign to the gas tank
     */
    public GasTank(int gas){
        setGas(gas);
    }

    /**
     * Adds gas to the tank, also checks if amount exceeds limit
     * @param litres the amount to add to tank
     * @return the amount put into the tank
     */
    public int addGas(int litres) {
        if((gas + litres) > GAS_MAX){
            litres = GAS_MAX - getGas();
        }
        this.gas += litres;

        return litres;
    }

    /**
     * Extracts gas from the tank and checks for exceeding minimum limit
     * @param litres the amount to extract
     * @return the amount extracted
     */
    public int subtractGas(int litres){
        if((gas - litres) < GAS_MIN){
            litres = GAS_MAX - (GAS_MAX - getGas());
        }
        this.gas -= litres;

        return litres;
    }

    /**
     * Fills the tank to contain a specified amount of gas, checks if amount
     * is between 0 and 1000
     * @param gas the amount of gas the tank shall contain
     */
    public void setGas(int gas){
        if(gas < GAS_MIN){
            this.gas = GAS_MIN;
        }
        else if(gas > GAS_MAX){
            this.gas = GAS_MAX;
        }
        else{
            this.gas = gas;
        }
    }

    /**
     * Gets the amount of gas that currently is inside the tank
     * @return the amount of gas in tank
     */
    public int getGas() {
        return gas;
    }
}
