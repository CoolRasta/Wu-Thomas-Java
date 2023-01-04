package Ch4;

class BicycleRegistration {
    public static void main(String[] args){
    Bicycle bike1, bike2, bike;
    Student owner, owner1, owner2;
    
    
    bike = new Bicycle();
    owner = new Student();
    bike.setTagNo("2004-134R");
    bike.setOwner(owner);
    owner.setName("Frankline Mwenda");
    
    bike1 = new Bicycle();
    owner1 = new Student();
    bike1.setOwner(owner1);
    bike1.setTagNo("2005-786H");
    owner1.setName("Adam Smith");
    
    bike2 = new Bicycle();
    owner2 = new Student();
    bike2.setOwner(owner2);
    bike2.setTagNo("1000-768U");
    owner2.setName("Ben Jones");   
    
    
        System.out.println(bike1.getOwnerName() + " owns a bicycle.");
        System.out.println(bike2.getOwnerName() + " also owns a bicycle");
        System.out.println(bike.getOwnerName() + "'s bicycle tag is " + bike.getTagNo());
    }
}
