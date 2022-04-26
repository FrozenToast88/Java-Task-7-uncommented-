public class client {

    String client_name;
    int client_telephoneNumber;
    String client_emailAddress;

    public client(String client_name, int client_telephoneNumber, String client_emailAddress) {

        this.client_name = client_name;
        this.client_telephoneNumber = client_telephoneNumber;
        this.client_emailAddress = client_emailAddress;
    }

    public String getClient_name() {
        return client_name;
    }

    public String setClient_name(String client_name) {
        this.client_name = client_name;
        return client_name;
    }

    public int getClient_telephoneNumber() {
        return client_telephoneNumber;
    }

    public int setClient_telephoneNumber(int client_telephoneNumber) {
        this.client_telephoneNumber = client_telephoneNumber;
        return client_telephoneNumber;
    }


    public String getClient_emailAddress() {
        return client_emailAddress;
    }

    public String setClient_emailAddress(String client_emailAddress) {
        this.client_emailAddress = client_emailAddress;
        return client_emailAddress;
    }

    public String toString() {

        String output = " ";
        output += "This is the name of the student                      : " + client_name;
        output += "\n This is the age                                   : " + client_telephoneNumber;
        output += "\n This is their race                                : " + client_emailAddress;

        return output;
    }
}

