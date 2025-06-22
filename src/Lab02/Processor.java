package Lab02;

public enum Processor {
    AMD("AMD"), INTEL("Intel"), ELBRUS("Эльбрус");

    private final String description;

    Processor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
