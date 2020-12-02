public class GasTank {
    private final int GAS_MAX = 1000;
    private final int GAS_MIN = 0;
    private int gas;

    /**
     * constructs a gas tank with a specified liter amount
     * @param gas the amount to assign to the gas tank
     */
    public GasTank(int gas){
        setGas(gas);
    }

    /**
     * 
     * @param litres
     * @return
     */
    public int addGas(int litres) {
        if((gas + litres) > GAS_MAX){
            litres = GAS_MAX - getGas();
        }
        this.gas += litres;

        return litres;
    }

    public int subtractGas(int litres){
        if((gas - litres) < GAS_MIN){
            litres = GAS_MAX - (GAS_MAX - getGas());
        }
        this.gas -= litres;

        return litres;
    }

    public void setGas(int gas){
        if(gas < GAS_MIN){
            this.gas = 0;
        }
        else if(gas > GAS_MAX){
            this.gas = 1000;
        }
        else{
            this.gas = gas;
        }
    }

    public int getGas() {
        return gas;
    }
}
