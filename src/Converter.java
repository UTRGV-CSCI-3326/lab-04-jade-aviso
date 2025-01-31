public class Converter{
    public static void main(String [] args){
    // Convert the string strFloat into a float.
    //WORK ON THIS
    String strFloat = "374.25";
    float from_strFloat = Float.parseFloat(strFloat);

    // Convert the string strInt into an integer.
    //WORK ON THIS
    String strInt = "1250";
    int from_strInt = Integer.parseInt(strInt);

    // Convert the float floatNum into an integer.
    //WORK ON THIS
    float floatNum = 56.715f;
    int from_floatNum = (int) floatNum;


    // Convert the integer intNum into a float.
    //DONE
    int intNum = 1500;
    float from_intNum = (float) intNum;

    // Convert the double doubleNum into a string.
    //DONE
    double doubleNum = 3.14159265;
    String from_doubleNum = String.valueOf(doubleNum);

    }

}
