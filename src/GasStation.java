public class GasStation {
    public static void main(String[] args) {
        //arrange
        GasTank gt = new GasTank(500);
        FuelPump fp = new FuelPump(gt);

        //act
        fp.extractGas(300);

        //assert
        System.out.println("expected gas in tank: 200, function returned: " + gt.getGas());

    }
}
