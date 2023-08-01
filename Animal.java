
  public  class Animal  {

    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbreed() {
        return breed;
    }

    public void setbreed(String breed) {
        this.breed = breed;
    }

    Animal()
    {
        System.out.println("Parent class constructor called");

    }
    
   public  Animal(String name,String breed)
    {
        System.out.println("Parent class constructor called");
        this.name = name;
        this.breed = breed;
    }
    

    void makeNoise()
    {
        System.out.println("Generic animal noise");
    }



    static void displayMsg()
    {
        System.out.println("Display method from Parent Class");
    }



}
