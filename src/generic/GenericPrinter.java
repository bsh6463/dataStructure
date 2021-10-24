package generic;

public class GenericPrinter<T extends Material> {

    private T material;

    public GenericPrinter() {
    }

    public GenericPrinter(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinter{" +
                "material=" + material +
                '}';
    }
}
