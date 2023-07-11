package org.ocp.studies.chapter03;

// One facet of break, continue, and return that you should be aware of is that any code placed immediately
// after them in the same block is considered unreachable and will not compile.
// For example, the following code snippet does not compile:

public class Test21_Unreachable_Code_Example {
    public static void main(String[] args) {
        int checkDate = 0; while(checkDate<10) {
            checkDate++; if(checkDate>100) {
                break;
                // checkDate++; // DOES NOT COMPILE
                }
            }

        int minute = 1;
        WATCH: while(minute>2) {
            if(minute++>2) {
                continue WATCH;
                // System.out.print(minute); // DOES NOT COMPILE
            }
        }

        int hour = 2; switch(hour) {
            // case 1: return; hour++; // DOES NOT COMPILE
            case 2:
        }
    }
}
