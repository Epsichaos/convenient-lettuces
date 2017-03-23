package lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Vector {

    private List<Double> vector;

    public Vector() {
        this.vector = new ArrayList<>();
    }

    public Vector(double... components) {
        this.vector = new ArrayList<>();
        Arrays.stream(components).forEach(component -> this.vector.add(component));
    }

    public void setIdentity(int dimension, double value) {
        int i = 0;
        while (i < dimension) {
            this.vector.add(i, value);
            i++;
        }
    }

    public int getDimension() {
        return vector.size();
    }

    public double getComponent(int component) {
        return this.vector.get(component);
    }

    public void setComponent(int component, double value) {
        this.vector.set(component, value);
    }

    public List<Double> getVector() {
        return this.vector;
    }

    public void print() {
        this.vector.forEach(component -> System.out.println("(" + component + ")"));
    }
}