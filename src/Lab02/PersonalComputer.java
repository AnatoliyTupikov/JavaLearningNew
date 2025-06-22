package Lab02;


public class PersonalComputer {

    private Processor cpu;
    private String gpu;
    private int fansCount;
    private String motherboard;
    private String caseColor;

    public PersonalComputer() {
    }

    public PersonalComputer(Processor cpu, String motherboard, String gpu, int fans, String color) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.gpu = gpu;
        fansCount = fans;
        caseColor = color;
    }

    public Processor getProcessor() {
        return this.cpu;
    }

    public void setProcessor(Processor value) {
        this.cpu = value;
    }

    public String getGPU() {
        return this.gpu;
    }

    public void setGPU(String value) {
        this.gpu = value;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public void setFansCount(int value) {
        this.fansCount = value;
    }

    public String getMotherboard() {
        return this.motherboard;
    }

    public void setMotherboard(String value) {
        this.motherboard = value;
    }

    public String getCaseColor() {
        return this.caseColor;
    }

    public void setCaseColor(String value) {
        this.caseColor = value;
    }

    @Override
    public String toString() {
        String str = String.format("PC:\n" + "\t Processor: %s\n" + "\t Motherboard: %s\n" + "\t Video processor: %s\n" + "\t Case color: %s\n" + "\t Fans count: %d\n",
                cpu.getDescription(),
                motherboard,
                gpu,
                caseColor,
                fansCount);
        return str;
    }


}
