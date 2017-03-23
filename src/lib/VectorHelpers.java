package lib;

public class VectorHelpers {

    public double scalarProduct(Vector v1, Vector v2) throws Exception {
        if(v1.getDimension() != v2.getDimension()) {
            throw new Exception("Vectors does not have same dimension");
        }
        int i = 0;
        int result = 0;
        while(i < v1.getDimension()) {
            result += v1.getComponent(i)*v2.getComponent(i);
            i++;
        }
        return result;
    }

    public double vectNorm(Vector v1) throws Exception {
        return Math.sqrt(scalarProduct(v1, v1));
    }
}
