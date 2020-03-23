package by.gsu.pms;

public class Subject {

    private String nameOfSubject;
    private UniformMaterial uniformMaterial;
    private double volumeOfSubject;

    public Subject() {}

    public Subject(String nameOfSubject, String nameOfMaterial, double volumeOfSubject){
        this.nameOfSubject = nameOfSubject;
        this.uniformMaterial = uniformMaterial;
        this.volumeOfSubject = volumeOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public double getVolumeOfSubject() {
        return volumeOfSubject;
    }

    public UniformMaterial getUniformMaterial() { return uniformMaterial;}

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public void setVolumeOfSubject(double volumeOfSubject) {
        this.volumeOfSubject = volumeOfSubject;
    }

    public void setUniformMaterial(UniformMaterial uniformMaterial) { this.uniformMaterial = uniformMaterial;}

    public double getMass(){
        return uniformMaterial.getDensityOfMaterial() * getVolumeOfSubject();
    }


    @Override
    public String toString() {
        return nameOfSubject + "; " + uniformMaterial.getNameOfMaterial() + "; " + uniformMaterial.getDensityOfMaterial() + "; " + volumeOfSubject + "; " + getMass();
    }
}
