public class architect {

        String architect_name;
        int architect_telephoneNumber;
        String architect_emailAddress;

        public architect (String architect_name , int architect_telephoneNumber , String architect_emailAddress ) {

            this.architect_name = architect_name;
            this.architect_telephoneNumber = architect_telephoneNumber;
            this.architect_emailAddress = architect_emailAddress;

        }

        public String getArchitect_name(){
            return architect_name;
        }

        public String setArchitect_name(String architect_name){
            this.architect_name = architect_name;
            return architect_name;

        }

        public int getArchitect_telephoneNumber(){
            return architect_telephoneNumber;
        }

        public int setArchitect_telephoneNumber(int architect_telephoneNumber) {

            this.architect_telephoneNumber = architect_telephoneNumber;
            return architect_telephoneNumber;
        }

        public String getArchitect_emailAddress(){
            return architect_emailAddress;
        }

        public String setArchitect_emailAddress(String architect_emailAddress){

            this.architect_emailAddress = architect_emailAddress;
            return architect_emailAddress;
        }

    public String toString() {

        String output = " ";
        output += " Architect Name:                             : " + architect_name;
        output += "\n Architect Telephone Number:               : " + architect_telephoneNumber;
        output += "\n Architect Email Address:                  : " + architect_emailAddress;

        return output;
    }
}
