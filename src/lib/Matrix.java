package lib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Matrix {

    private List<Vector> vectors;
    private int rowsDimensions;
    private int colsDimensions;

    public Matrix() {
        this.vectors = Collections.emptyList();
        this.rowsDimensions = 0;
        this.colsDimensions = 0;
    }

    public Matrix(Vector... vectors) throws Exception {
        Optional<Vector> vectorWithAnotherDimension = Arrays.stream(vectors)
                .filter(vector -> vector.getDimension() != this.vectors.get(0).getDimension())
                .findAny();
        if(!vectorWithAnotherDimension.isPresent()) {
            throw new Exception("Vectors does not have the same dimension");
        }
        this.vectors = Arrays.stream(vectors).collect(Collectors.toList());
        this.colsDimensions = this.vectors.size();
        this.rowsDimensions = this.vectors.get(0).getDimension();
    }

    public List<Vector> getVectors() {
        return vectors;
    }

    public int getRowsDimensions() {
        return rowsDimensions;
    }

    public int getColsDimensions() {
        return colsDimensions;
    }
}
