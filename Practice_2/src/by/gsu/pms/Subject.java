package by.gsu.pms;

public class Subject extends UniformMaterial {

    private String nameOfSubject;
    private String nameOfMaterial;
    private double volumeOfSubject;

    public Subject() {}

    public Subject(String nameOfSubject, String nameOfMaterial, double volumeOfSubject){
        this.nameOfSubject = nameOfSubject;
        this.nameOfMaterial = nameOfMaterial;
        this.volumeOfSubject = volumeOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public double getVolumeOfSubject() {
        return volumeOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }



    public void setVolumeOfSubject(double volumeOfSubject) {
        this.volumeOfSubject = volumeOfSubject;
    }

    public double getMass(){
        return getDensityOfMaterial() * getVolumeOfSubject();
    }


    @Override
    public String toString() {
        return nameOfSubject + "; " + getNameOfMaterial() + "; " + getDensityOfMaterial() + "; " + volumeOfSubject + "; " + getMass();
    }
}
