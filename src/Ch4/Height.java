package Ch4;


public class Height {
    int age, height;
    double recommendedWeight;
    
    public Height(){
        age = 0;
        height = 0;
    }
    public void computeWeight(int userAge, int userHeight){
        recommendedWeight = (userHeight - 100 + userAge / 10) * 0.90;
    }
    public void setAge(int inputAge){
        age = inputAge;
    }
    public void setHeight(int inputHeight){
        height = inputHeight;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public double getWeight(){
        return recommendedWeight;
    }
}
