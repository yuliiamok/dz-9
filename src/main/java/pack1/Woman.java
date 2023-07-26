package pack1;

public class Woman extends Person {
    private Person partner;
    final private String originalLastName;
    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
        this.originalLastName = lastName;
    }
    @Override
    public boolean isRetired() {
        if (age < 60) {
            return super.isRetired();
        } else
            return true;
    }
    public void registerPartnership(Person partner) {
        this.partner = partner;
        this.partner.setPartner(this);
        this.lastName = partner.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void deregisterPartnership(boolean shouldChangeBackToOriginalLastName) {
        if (this.partner == null) {
            System.out.println("Partnership does not exist.");
            return;
        }
        if (shouldChangeBackToOriginalLastName) {
            this.lastName = this.originalLastName;
            System.out.printf("%s %s deregistered partnership and returned to the original lastName%n", this.firstName, this.lastName);
        }
        this.partner.setPartner(null);
        this.partner = null;
    }

    @Override
    public String toString() {
        return String.format("%s %s registered partnership with %s %s and took partner lastName", this.firstName, this.lastName, partner.firstName, partner.lastName);
    }
}
