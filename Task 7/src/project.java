public class project {

    int project_number;
    String project_name;
    String building_type;
    String project_address;
    int ERF_number;
    int project_feeTotal;
    int project_totalPaid_amount;
    String project_deadline;



    public project (int project_number , String project_name , String building_type , String project_address , int ERF_number , int project_feeTotal
            , int project_totalPaid_amount , String project_deadline ) {

        this.project_number = project_number;
        this.project_name = project_name;
        this.building_type = building_type;
        this.project_address = project_address;
        this.ERF_number = ERF_number;
        this.project_feeTotal = project_feeTotal;
        this.project_totalPaid_amount = project_totalPaid_amount;
        this.project_deadline = project_deadline;

    }

    public int getProject_number() {
        return project_number;
    }

    public int setProject_number(int project_number) {
        this.project_number = project_number;
        return project_number;
    }

    public String getProject_name() {
        return project_name;
    }

    public String setProject_name(String project_name) {
        this.project_name = project_name;
        return project_name;
    }

    public String getBuilding_type() {
        return building_type;
    }

    public String setBuilding_type(String building_type) {
        this.building_type = building_type;
        return building_type;
    }

    public String getProject_address() {
        return project_address;
    }

    public String setProject_address(String project_address) {
        this.project_address = project_address;
        return project_address;
    }

    public int getERF_number() {
        return ERF_number;
    }

    public int setERF_number(int ERF_number) {
        this.ERF_number = ERF_number;
        return ERF_number;
    }

    public int getProject_feeTotal() {
        return project_feeTotal;
    }

    public int setProject_feeTotal(int project_feeTotal) {
        this.project_feeTotal = project_feeTotal;
        return project_feeTotal;
    }

    public int getProject_totalPaid_amount() {
        return project_totalPaid_amount;
    }

    public int setProject_totalPaid_amount(int project_totalPaid_amount) {
        this.project_totalPaid_amount = project_totalPaid_amount;
        return project_totalPaid_amount;
    }

    public String getProject_deadline() {
        return project_deadline;
    }
    public String setProject_deadline(String project_deadline) {
        this.project_deadline = project_deadline;
        return project_deadline;
    }

    public String toString() {

        String output = " ";
        output += "Project Number                  : " + project_number;
        output += "\n Project Name                 : " + project_name;
        output += "\n Building Type                : " + building_type;
        output += "\n Project Address              : " + project_address;
        output += "\n Project Fee Total            : " + project_feeTotal;
        output += "\n Project Total Paid Amount    : " + project_totalPaid_amount;
        output += "\n Project Deadline             : " + project_deadline;

        return output;
    }
}
