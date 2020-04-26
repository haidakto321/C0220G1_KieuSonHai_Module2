package Commons;

import java.util.regex.Pattern;

public class Validation {
    public Validation() {
    }
    public boolean checkNameCustomer(String name) {
        String regexp= "[A-Z][a-z]*(\\s{1}[A-Z][a-z ]*)*";
        if(Pattern.matches(regexp,name)) {
            return true;
        } else {
            return false;
        }
    }
    public  boolean checkBirthday(String birthday) {
        String regexp="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|2[0-9])[0-9]{2})$";

        if(Pattern.matches(regexp,birthday)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkGender(String gender) {
        String regexp="(Male||Female||Unknown)";

        if(Pattern.matches(regexp,gender)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPhoneNumber(String phone) {
        String regexp="\\d{9}";

        if(Pattern.matches(regexp,phone)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCmnd(String cmnd) {
        String regexp="\\d{9}";

        if(Pattern.matches(regexp,cmnd)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkEmail(String email) {
        String regexp="^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$";

        if(Pattern.matches(regexp,email)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTypeOfCustomer(String type) {
        String regexp="[A-Z][a-z]*(\\s{1}[A-Z][a-z ]*)*";

        if(Pattern.matches(regexp,type)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkAdress(String adress) {
        String regexp="[A-Za-z0-9 ]+[A-Za-z0-9 ]*";

        return Pattern.matches(regexp, adress);
    }
    public boolean checkServiceCode(String serviceCode, String character) {
        String regexp;
        if (character == "V") {
            regexp = "^(SVVL)+-[0-9]{4}$";
            Pattern.matches(regexp, serviceCode);
        } else if (character == "H") {
            regexp = "^(SVHO)+-[0-9]{4}$";
            Pattern.matches(regexp, serviceCode);
        } else {
            regexp = "^(SVRO)+-[0-9]{4}$";
            Pattern.matches(regexp, serviceCode);
        }

        if (Pattern.matches(regexp, serviceCode)) {
            return true;
        }
        return false;
    }

    public boolean checkAreaUsed(String areaUsed) {
        String regexp = "([3-9]{1}[0-9]+||[1-9]{3,})+\\.?+[0-9]*";
        if (Pattern.matches(regexp, areaUsed)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPoolArea(String poolArea) {
        String regexp = "[3-9]+[0-9]+\\.*([0-9])*";
        if (Pattern.matches(regexp, poolArea)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCost(double cost) {
        String regexp = "[0-9]+\\.+[0-9]+";
        if (Pattern.matches(regexp, String.valueOf(cost)) && cost>0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMaxPeople(int people) {
        String regexp = "^(0?[1-9]{1} || [1-2]{1}[0-9]{1})$";
        String regexp1 = "^(0?[0-9]{1}||[12]{1}[0-9]{1}||3([0]{1}))$";
        if(Pattern.matches(regexp1,String.valueOf(people))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkRoomStandard(String detail) {
        String regexp= "[A-Z][a-z]*(\\s{1}[A-Z][a-z ]*)*";
        if(Pattern.matches(regexp,detail)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkRentType(String rentType) {
        String regexp="[A-Z]+[a-z]*";
        if(Pattern.matches(regexp,rentType)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOtherUltilities(String otherUtilities) {
        String regexp="(massage||karaoke||food||drink||car)";
        if(Pattern.matches(regexp,otherUtilities)) {
            return true;
        } else{
            return false;
        }
    }
    public boolean checkFloors(int floors) {
        String regexp="[0-9]+";
        if(Pattern.matches(regexp,String.valueOf(floors)) && (floors>0)) {
            return true;
        } return false;
    }

    public boolean checkFreeService(String freeService) {
        String regexp="[A-Z][a-z]* [A-Za-z]*";
        if(Pattern.matches(regexp,freeService)) {
            return true;
        } else {
            return false;
        }
    }
}
