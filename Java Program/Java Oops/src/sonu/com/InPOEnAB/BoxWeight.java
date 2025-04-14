package sonu.com.InPOEnAB;

// inheritance box example
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;

    }

    BoxWeight(BoxWeight other ){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        // call the parent class constructor
        // used to initialise value present in parent class
        //System.out.println(super.weight);


        this.weight = weight;
    }
}
