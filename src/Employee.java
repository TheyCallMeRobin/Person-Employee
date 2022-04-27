class Employee extends Person {
    //Attributes
    private double salary;
    private int year;
    private String socialSecurityNumber;

    //Constructors

    Employee(String name, double salary, int year, String socialSecurityNumber) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Accessors and Mutators
    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }

    //Methods
    @Override
    public boolean equals(Object otherPerson){
        Employee e = (Employee) otherPerson;

        if(!e.socialSecurityNumber.equals(this.socialSecurityNumber)){
            return false;
        }
        return true;
    }
}