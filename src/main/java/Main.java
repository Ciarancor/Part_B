/**
 *
 * @author Ciaran Corcoran - 17371636
 */

import java.util.*;
import org.joda.time.DateTime;

public class Main {
     public static void main(String[] args) {
         // creates course
         Course ECE = new Course("ECE", new DateTime("2020-09-01"), new DateTime("2020-05-30"));
         // creates Modules
         Modules comps = new Modules("Comps", 387964);
         Modules elec = new Modules("elec", 182787);
         // Creates students
         Student student1 = new Student("Mary", "Jo", "12/08/1997", 23, 1234);
         Student student2 = new Student("Bren", "Dan", "17/04/1998", 22, 1234);
         Student student3 = new Student("Barry", "Legnelle", "21/12/1996", 24, 1234);
         // adds modules to ECE course
         ECE.addModule(comps);
         ECE.addModule(elec);
         // adds students to ECE Course
         ECE.addStudent(student1);
         ECE.addStudent(student2);
         ECE.addStudent(student3);
         
         // Prints out results
         System.out.println(ECE);
         System.out.println(comps);
         System.out.println(elec);
         System.out.println(student1);
         System.out.println(student2);
         System.out.println(student3);
     }
}
