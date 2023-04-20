package bt.demo;

public class Main {
    public static void main(String[] args) {
        HeavyTank hTank = new HeavyTank("Type 71", "Japan", 32,17, 63);
        MediumTank mTank = new MediumTank("Type 74", "Japan", 38,35, 42);
        LightTank lTank = new LightTank("L-100", "U.S.S.R", 45,35, 34);
        TankDestroyer tDestroy = new TankDestroyer("T110E3", "U.S.A", 29, 53);

        System.out.println(hTank);
        System.out.println(mTank);
        System.out.println(lTank);
        System.out.println(tDestroy);
    }
}
