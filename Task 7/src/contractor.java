public class contractor {

    String contractor_name;
    int contractor_telephoneNumber;
    String contractor_emailAddress;

    public contractor(String contract_name, int contract_telephoneNumber, String contractor_emailAddress) {

        this.contractor_name = contract_name;
        this.contractor_telephoneNumber = contract_telephoneNumber;
        this.contractor_emailAddress = contractor_emailAddress;
    }

    public String getContractor_name() {
        return contractor_name;
    }

    public String setContractor_name(String contractor_name) {
        this.contractor_name = contractor_name;
        return contractor_name;
    }

    public int getContractor_telephoneNumber() {
        return contractor_telephoneNumber;
    }

    public int setContractor_telephoneNumber(int contractor_telephoneNumber) {
        this.contractor_telephoneNumber = contractor_telephoneNumber;
        return contractor_telephoneNumber;
    }

    public String getContractor_emailAddress() {
        return contractor_emailAddress;
    }

    public String setContractor_emailAddress(String contractor_emailAddress) {
        this.contractor_emailAddress = contractor_emailAddress;
        return contractor_emailAddress;
    }

    public String toString() {

        String output = " ";
        output += "Contractor Name                          : " + contractor_name;
        output += "\n Contractor Telephone Number           : " + contractor_telephoneNumber;
        output += "\n Contractor Email Address              :  " +  contractor_emailAddress;

        return output;
    }
}




