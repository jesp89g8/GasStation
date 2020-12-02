/**
 * @author Jesper D20
 */
public class GasStation {
    public static void main(String[] args) {
        gasTankTest();
        fuelPumpTest();
    }

    private static void fuelPumpTest() {
        System.out.println("------------FUELPUMP TEST----------");

        //arrange
        GasTank gt = new GasTank(500);
        FuelPump fp = new FuelPump(gt);

        //act
        fp.extractGas(600);
        //assert
        System.out.printf(
                "extract 600 gas from a tank with 500 gas:\n" +
                "   fp.getFuelCounter() expected: 500, result: %d\n" +
                "   gt.getGas() expected: 0, result: %d\n",
                fp.getFuelCounter(),gt.getGas()
        );

        //act
        gt.addGas(700);
        fp.extractGas(300);
        //assert
        System.out.printf(
                "add 700 gas to tank and extract 300 gas:\n" +
                "   fp.getFuelCounter() expected: 800, result: %d\n" +
                "   gt.getGas() expected: 400, result: %d\n",
                fp.getFuelCounter(),gt.getGas()
        );

        //act / assert
        System.out.printf("get turnover: fp.getTurnover(7) expected: 5600, result %d\n",fp.getTurnover(7));

        //arrange
        GasTank gt2 = new GasTank(333);
        //act
        fp.setGasTank(gt2);
        fp.extractGas(332);
        //assert
        System.out.printf(
                "attach fuel pump to an other gas tank with 333 initial gas and extract 332 from the tank:\n" +
                "   gt2.getGas() expected: 1, result %d\n" +
                "   fp.getFuelCounter() expected: 1132, result %d\n",
                gt2.getGas(),fp.getFuelCounter()
        );
    }

    public static void gasTankTest(){
        System.out.println("------------GASTANK TEST----------");

        //arrange / act
        GasTank gt = new GasTank(1300);
        //assert
        System.out.printf("construct gas tank with 1300 initial value: gt.getGas() expected: 1000, result: %d\n",gt.getGas());

        //act
        gt.addGas(3000);
        //assert
        System.out.printf("add 3000 gas: gt.getGas() expected: 1000, result: %d\n",gt.getGas());

        //act
        gt.subtractGas(5555);
        //assert
        System.out.printf("subtract 5555 gas: gt.getGas() expected: 0, result: %d\n",gt.getGas());

        //act
        gt.addGas(50);
        //assert
        System.out.printf("add 50 gas: gt.getGas() expected: 50, result: %d\n",gt.getGas());

        //act
        gt.subtractGas(20);
        //assert
        System.out.printf("subtract 20 gas: gt.getGas() expected: 30, result: %d\n",gt.getGas());

        //act
        gt.setGas(3333);
        //assert
        System.out.printf("set gas to 3333: gt.getGas() expected: 1000, result: %d\n",gt.getGas());

        //act
        gt.setGas(444);
        //assert
        System.out.printf("set gas to 444: gt.getGas() expected: 444, result: %d\n",gt.getGas());
    }
}
