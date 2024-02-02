public class Vektor {
    private Double x, y, z;

    public Vektor(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }
    @Override
    public boolean equals(Object v){
        if(!(v instanceof Vektor)) return false;
        Vektor a = (Vektor) v;
        if(a.getX().equals(this.x) && a.getY().equals(this.y) && a.getZ().equals(this.z))return true;
        return false;
    }

    @Override
    public String toString() {
        return "("+this.x + ", " + this.y + ", " + this.z + ")";
    }
}
