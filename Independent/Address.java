package Week3.Day11.Independent;

public class Address {
    private String houseName;
    private int laneNo;
    private String area,city,state,country;

    public Address(String houseName, int laneNo, String area, String city, String state, String country) {
        this.houseName = houseName;
        this.laneNo = laneNo;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    protected void display() {
        System.out.println( "Address{" +
                "houseName='" + houseName + '\n' +
                ", laneNo=" + laneNo +
                ", area='" + area + '\n' +
                ", city='" + city + '\n' +
                ", state='" + state + '\n' +
                ", country='" + country + '\n' +
                '}');
    }
}
