package facade;

public class Computer {
    private final CPU cpu;
    private final RAM ram;
    private final HDD hdd;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        hdd = new HDD();
    }

    public void start() {
        cpu.run();
        ram.load();
        hdd.read();
        System.out.println("Computer is started");
    }

    public void shutdown() {
        System.out.println("Computer is shutting down");
    }
}





