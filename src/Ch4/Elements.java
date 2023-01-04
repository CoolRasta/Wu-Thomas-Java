package Ch4;

/**
 *
 * @author HP
 */
class Elements {
    private String name, symbol;
    private int number, period, group;
    double mass;
    
    public Elements(String elementName, int elementNumber, String elementSymbol, double elementMass, int elementPeriod, int elementGroup){
        name = elementName;
        number = elementNumber;
        symbol = elementSymbol;
        mass = elementMass;
        group = elementGroup;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public String getSymbol(){
        return symbol;
    }
    public double getMass(){
        return mass;
    }
    public int getPeriod(){
        return period;
    }
    public int getGroup(){
        return group;
    }
}
