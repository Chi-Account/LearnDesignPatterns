package chi.learndesignpatterns.templatemethodpattern.sort;

public class Duck implements Comparable<Duck> {

    private String name;

    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Duck duck) {
        int otherDuckWeight = duck.getWeight();
        return Integer.compare(this.weight, otherDuckWeight);
    }
}
