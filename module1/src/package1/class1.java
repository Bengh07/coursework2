package package1;

public class class1 {
    String patientname;
    int  patientID;
    String patientadress;
    String patientgender;

    public class1(String patientname, int patientID, String patientadress, String patientgender) {
        this.patientname = patientname;
        this.patientID = patientID;
        this.patientadress = patientadress;
        this.patientgender = patientgender;
    }

    public void getpatientInfo(){
        System.out.println("the patient name is"+""+patientname);
        System.out.println("the patient ID is"+""+patientID);
        System.out.println("the patient adress is" +""+patientadress);
        System.out.println("the patient gender is"+""+patientgender);
    }
}

