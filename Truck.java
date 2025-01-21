public class Truck extends Vehicle1{
    @Override
    public void fuelEfficiency() {
        System.out.println("Truck has 45M/Ltr");
    }
    @Override
    public void distanceTraverse() {
        System.out.println("Truck passed 550km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Truck has max of 55K/hrs");
    }
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.distanceTraverse();
        truck.fuelEfficiency();
        truck.maxSpeed();
    }
}
