class Person {
    //Attributes
    private String name;

    //Constructors
    public Person(){
        this.name = "";
    }

    public Person(String name){
        this.name = name;
    }

    //Accessors and Mutators
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Methods
    @Override
    public String toString(){
      return name;
    }

    public boolean equals(Object otherPerson){
        Person p = (Person) otherPerson;
        if (!p.getName().equals(this.name)){
            return false;
        } else {
            return true;
        }
    }
}

