package by.gsu.pms;

public enum UniformMaterial {
    STEEL("steel", 7850), COOPER("cooper", 8500);

    private String nameOfMaterial;
    private int densityOfMaterial;

    UniformMaterial() {}

    UniformMaterial(String nameOfMaterial, int densityOfMaterial) {
        this.nameOfMaterial = nameOfMaterial;
        this.densityOfMaterial = densityOfMaterial;
    }

    public String getNameOfMaterial(){
        return nameOfMaterial;
    }

    public  int getDensityOfMaterial(){
        return densityOfMaterial;
    }

    public void setNameOfMaterial( String nameOfMaterial){
        this.nameOfMaterial = nameOfMaterial;
    }

    public void setDensityOfMaterial(int densityOfMaterial) {
        this.densityOfMaterial = densityOfMaterial;
    }

    @Override
    public String toString() {
        return nameOfMaterial + "; " + densityOfMaterial;
    }
}
