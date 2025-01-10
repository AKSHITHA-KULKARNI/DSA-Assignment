package Algorithm_Programs;

public class MessageCustomization {
    public static void main(String[] args) {
        String template = "Hello <<name>>, We have your full name as <<full name>> in our system. "
                + "Your contact number is 91-xxxxxxxxxx. Please let us know in case of any clarification. "
                + "Thank you BridgeLabz 01/01/2016.";

        String name = "Akshitha";
        String fullName = "Akshitha Kulkarni";
        String phoneNumber = "91-9000000001";
        String date = "10/01/2025";

        template = template.replace("<<name>>", name)
                .replace("<<full name>>", fullName)
                .replace("91-xxxxxxxxxx", phoneNumber)
                .replace("01/01/2016", date);

        System.out.println(template);
    }
}