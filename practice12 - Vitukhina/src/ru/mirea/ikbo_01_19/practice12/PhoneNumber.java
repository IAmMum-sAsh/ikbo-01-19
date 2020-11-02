package ru.mirea.ikbo_01_19.practice12;

public class PhoneNumber {
    private String startNumber;
    private String countryCode;
    private String operatorCode;
    private String three;
    private String four;
    private String reg = "^((\\+\\d{11})|(\\d{11}))$";

    public PhoneNumber(){}

    public PhoneNumber(String number){
        this.startNumber = number;
    }

    public boolean NumberTest(){
        if (this.startNumber.matches(reg)) {
            if (this.startNumber.length() == 12) {
                this.countryCode = String.valueOf(this.startNumber.charAt(1));
                this.operatorCode = this.startNumber.substring(2, 5);
                this.three = this.startNumber.substring(5, 8);
                this.four = this.startNumber.substring(8, 12);
                return true;
            }
            this.countryCode = String.valueOf((Integer.parseInt(String.valueOf(this.startNumber.charAt(0))) - 1));
            this.operatorCode = this.startNumber.substring(1, 4);
            this.three = this.startNumber.substring(4, 7);
            this.four = this.startNumber.substring(7, 11);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("+%s%s-%s-%s", this.countryCode, this.operatorCode, this.three, this.four);
    }
}
