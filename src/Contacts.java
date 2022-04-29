class Contacts {

    private String firstName, lastName, address, city, state, zipCode, contactNo, email;
    public Contacts(String fName, String lName,
                    String addr, String cityName, String stateName,
                    String zipCodeNo, String contact, String emailAddr){
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.city = cityName;
        this.state = stateName;
        this.zipCode = zipCodeNo;
        this.contactNo = contact;
        this.email = emailAddr;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getContactNo(){
        return contactNo;
    }
    public String getZipCode(){
        return zipCode;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = firstName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
}
