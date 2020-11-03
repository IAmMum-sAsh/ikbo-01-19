//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    private Address EMPTY_ADDRESS;

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return "<html>" +
                "Город: " + cityName +
                "<br>Индекс: " + zipCode +
                "<br>Улица: " + streetName +
                "<br>Номер дома: " + buildingNumber +
                "<br>Буква дома: " + buildingLetter +
                "<br>Квартира: " + apartmentNumber +
                "</html>";
    }
}
