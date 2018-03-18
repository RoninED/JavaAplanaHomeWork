public class HomeWork42Sweets {
    int index;
    String type;
    String name;
    double weight;
    double prise;

    public HomeWork42Sweets(int index, String type, String name, double weight, double prise) {
        this.index = index;
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.prise = prise;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
