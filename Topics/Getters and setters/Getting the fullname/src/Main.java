class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {

        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "Unknown";
        }

        String name = this.firstName;

        if (this.lastName != null) {
            name += " " + this.lastName;
        }

        return name.trim();
    }
}