package ships;

public class CargoShip extends Ship {
    private int capacityTonnes;

    public CargoShip(String name, String yearBuilt, int capacityTonnes) {
        super(name, yearBuilt);
        this.capacityTonnes = capacityTonnes;
    }

    public int getCapacityTonnes() {
        return capacityTonnes;
    }

    public void setCapacityTonnes(int capacityTonnes) {
        this.capacityTonnes = capacityTonnes;
    }

    @Override
    public void print() {
        System.out.printf("%s (tonnage capacity: %d)%n", name, capacityTonnes);
    }
}
