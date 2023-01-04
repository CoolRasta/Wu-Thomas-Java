
package Ch4;

public class Bicycle {
  
    private String  tagNo, bikeType, bikeColour;
    private Student owner;
    public Bicycle(){
        owner = null;
        tagNo = "";
        bikeType = "";
        bikeColour = "";
    }
    
    public String getBikeType(){
        return bikeType;
    }
    
  public void setBikeType(String type){
            bikeType = type;
  }
  public String getColour(){
      return bikeColour;
  }
  public void setColour(String colour){
      bikeColour = colour;
  }

    public String getOwnerName(){
        return owner.getName();
    }
    
    public void setOwner(Student student){
        owner = student;
    }
    public void setTagNo(String no){
        tagNo = no;
    }
    
    public String getTagNo(){
        return tagNo;
    }
}
