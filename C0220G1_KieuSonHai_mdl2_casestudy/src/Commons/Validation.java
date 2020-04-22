package Commons;

import java.util.regex.Pattern;

public class Validation {
    public Validation() {
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
        String regexp = "[3-9]+[0-9]+\\.?+[0-9]*";
        if (Pattern.matches(regexp, areaUsed)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPoolArea(String poolArea) {
        String regexp = "[3-9]+[0-9]+\\.+[0-9]+";
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

    public boolean checkDetail(String detail) {
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
        String regexp="[A-Z][a-z]* ([A-Z][a-z]*)*";
        if(Pattern.matches(regexp,freeService)) {
            return true;
        } else {
            return false;
        }
    }
}
