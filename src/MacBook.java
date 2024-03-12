class MacBook {
    private final String model;
    private final String processor;
    private final int memory;
    private final int storage;
    private final String color;
    private final int year;
    private final double displaySize;

    public MacBook(String model, String processor, int memory, int storage, String color, int year, double displaySize) {
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.color = color;
        this.year = year;
        this.displaySize = displaySize;
    }

    // Геттеры и сеттеры

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public String toString() {
        return "Model: " + model + ", Processor: " + processor + ", Memory: " + memory + " GB, Storage: " +
                storage + " GB, Color: " + color + ", Year: " + year + ", Display Size: " + displaySize + " inch";
    }
}
