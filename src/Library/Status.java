package Library;

public class Status {
    static String status(boolean isLecturer){
        if (isLecturer){

            return ("Lecturer");
        }
        else {
            return ("Student");
        }
    }
}
