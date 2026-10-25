# BASIC PROGRAMMING PRACTICUM REPORT

## SESSION – 3: Operator, Sequence, Flowchart dan Pseudocode

**Name:** Fauz Dino  
**NIM:** 264107020241  
**Study Program:** D-IV Informatics Engineering  
**Class:** 1I  
**Department:** Information Technology  
**Politeknik Negeri Malang**  
**Academic Year:** 2026/2027

---

# Experiment 1: Using IF and IF-ELSE to Print the KRS

The program uses an IF selection structure to verify the student's UKT payment status. The boolean `uktPaid` variable stores the user's input as `true` or `false`. When the input is `true`, the `if (uktPaid)` condition is satisfied and the program displays messages confirming the tuition payment and allowing the student to print the KRS.

### Figure 1. Java IF selection for KRS tuition payment verification

![Figure 1 - Java IF selection](images/media/image2.png)

### Java Code

```java
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print SIAKAD Study Plan (KRS)---");
        System.out.print("Has the tuition fee (UKT) been paid in full? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("Tuition payment verified");
            System.out.println("Please print the Study Plan (KRS) and obtain the Academic Advisor's signature");
        }

        sc.close();
    }
}
```

### Figure 2. Program execution when the input is true

![Figure 2 - Program execution](images/media/image3.png)

## Questions

### 1. What value must you enter so that both lines inside the IF block are printed?

**Answer:** The value to be entered is `true`, because the `uktlunas` variable is declared with a `boolean` data type, which accepts only `true` or `false`.

### 2. Run the program, then enter false. Which lines are printed and which lines are not?

![Figure 3 - Program execution when input is false](images/media/image4.png)

**Answer:** When the input `false` is provided, the program skips the entire code block within the `{}` braces and immediately terminates without printing anything.

### 3. Run the program, then enter TRUE and yes. What happens?

**Answer:** When `TRUE` is entered in uppercase, the program will produce an `InputMismatchException` because Java is case-sensitive and `Scanner.nextBoolean()` expects a valid Boolean value such as `true` or `false`. The input `yes` will also cause an error because it is not a valid Boolean value.

### 4. Add an ELSE structure

### Figure 4. IF-ELSE version for KRS payment validation

![Figure 4 - IF ELSE version](images/media/image5.png)

### Java Code

```java
import java.util.Scanner;

public class selection13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print SIAKAD Study Plan (KRS)---");
        System.out.print("Has the tuition fee (UKT) been paid in full? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("Tuition payment verified");
            System.out.println("Please print the Study Plan (KRS) and obtain the Academic Advisor's signature");
        } else {
            System.out.println("Registration rejected. Please pay your UKT first");
        }

        sc.close();
    }
}
```

### Figure 5. Program output for the IF-ELSE modification

![Figure 5 - IF ELSE output](images/media/image6.png)

The IF-ELSE structure provides two possible outputs. When the input is `true`, the program displays the message confirming that the UKT payment has been verified and allows the student to print the KRS. When the input is `false`, the ELSE block is executed and displays **“Registration rejected. Please pay your UKT first.”**

---

# Experiment 2: SWITCH-CASE to Print the KRS

The program uses a SWITCH-CASE selection structure to display the KRS according to the student's semester. The semester number is entered by the user and stored in the `semester` variable. The `switch` statement compares this value with each case from 1 to 8 and displays the corresponding KRS message. The `break` statement stops the execution after the matching case, while the `default` section displays `Invalid semester` when the input is outside the available semester range.

### Figure 6. Java SWITCH-CASE program for displaying KRS by semester

![Figure 6 - SWITCH CASE code](images/media/image7.png)
![Figure 6 continued - SWITCH CASE code](images/media/image8.png)

### Java Code

```java
import java.util.Scanner;

public class selection_switch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD ---");
        System.out.print("Enter current Semester: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS Semester 1 Displayed");
                break;
            case 2:
                System.out.println("KRS Semester 2 Displayed");
                break;
            case 3:
                System.out.println("KRS Semester 3 Displayed");
                break;
            case 4:
                System.out.println("KRS Semester 4 Displayed");
                break;
            case 5:
                System.out.println("KRS Semester 5 Displayed");
                break;
            case 6:
                System.out.println("KRS Semester 6 Displayed");
                break;
            case 7:
                System.out.println("KRS Semester 7 KRS Displayed");
                break;
            case 8:
                System.out.println("KRS Semester 8 KRS Displayed");
                break;
            default:
                System.out.println("Invalid semester");
        }

        sc.close();
    }
}
```

### Figure 7. Flowchart for the semester/KRS selection process

![Figure 7 - Semester flowchart](images/media/image9.png)

### Figure 8. Program execution and KRS output

![Figure 8 - SWITCH CASE output](images/media/image10.png)

## Questions

### 1. Delete the `break` statement in case 5

**Answer:** When the `break` statement in case 5 is removed and the input is `5`, the program executes case 5 and then continues to the following cases until it reaches a break. This is called **fall-through**. The `break` statement is used to stop the execution of the switch after the matching case.

### 2. Run the program with input 10 and 0

**Answer:** If you input `10` or `0`, it will display **"Invalid Semester"**. If the `default` section is removed, the program will not encounter any errors, but it will not produce any output because there is no handling instruction for those values.

### 3. Change the `semester` data type to `double`

**Answer:** The program does not compile successfully because `double` is not allowed as the expression type in a traditional `switch`. Common types that can be used include `byte`, `short`, `char`, `int`, and `String`.

### 4. Convert SWITCH-CASE to IF-ELSE IF-ELSE

### Figure 9. IF-ELSE IF-ELSE version of the KRS selection

![Figure 9 - IF ELSE IF ELSE code](images/media/image10.png)

### Java Code

```java
import java.util.Scanner;

public class Selection_ifelse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD ---");
        System.out.print("Enter current Semester: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 Displayed");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 Displayed");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 Displayed");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 Displayed");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 Displayed");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 Displayed");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 KRS Displayed");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 KRS Displayed");
        } else {
            System.out.println("Invalid semester");
        }

        sc.close();
    }
}
```

**Answer:** The switch-case structure is easier to use, more readable, and tidier than if-else, because it avoids repeating variable names.

---

# Assignment

## 1. Ternary Operator

The IF-ELSE selection structure is changed into a ternary operator. The decision result is stored in a `String` variable named `message`, then printed using one `System.out.println()` statement.

### Figure 10. Ternary operator implementation for attendance selection

![Figure 10 - Ternary operator](images/media/image11.png)

### Java Code

```java
import java.util.Scanner;

public class Assignment1SelectionAttendance13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has the tuition fee been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String message = uktLunas
                ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "Pembayaran UKT belum lunas\nSilakan lunasi UKT terlebih dahulu";

        System.out.println(message);
    }
}
```

**Answer:** Use the ternary operator when the code is simple and requires only one of two values, specifically when the condition is short and easy to understand. Use if-else when the logic is complex, involves multiple options, and each condition requires multiple statements.

In short, the ternary operator is best for simple binary choices, whereas if-else is better suited for complex or multiple conditions.

---

## 2. Maximum SKS Validation

A KRS system validates the number of credits (SKS) taken by a student.

### Figure 11. Flowchart for maximum SKS validation

![Figure 11 - Maximum SKS flowchart](images/media/image12.png)

### Figure 12. Java implementation of the maximum SKS validation

![Figure 12 - Maximum SKS Java code](images/media/image13.png)

### Java Code

> **Note:** This code is transcribed from the screenshot. The screenshot uses `numberOfCredits > 24` for the condition and shows `25` producing `KRS is valid`. The Markdown preserves that logic exactly as shown in the source document.

```java
import java.util.Scanner;

public class selectionif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCredits;

        System.out.print("Enter the number of credits: ");
        numberOfCredits = sc.nextInt();

        if (numberOfCredits > 24) {
            System.out.println("KRS is valid");
        } else {
            System.out.println("KRS is not valid");
        }

        sc.close();
    }
}
```

---

## 3a. Problem 1 — Parking System

A mall in Malang implements a paid parking system for two-wheeled vehicles. The fee is calculated based on the duration of parking in hours:

- The first 2 hours incur a base fee of Rp 2,000.
- For durations exceeding 2 hours, the cost is the base fee plus Rp 1,000 for each additional hour.

### Figure 13. Parking System pseudocode and flowchart

![Figure 13 - Parking pseudocode](images/media/image14.png)

### Figure 14. Parking System flowchart

![Figure 14 - Parking flowchart](images/media/image15.png)

### Java Code

```java
import java.util.Scanner;

public class park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int parkingDuration;
        int totalCost = 0;

        System.out.print("Enter parking duration: ");
        parkingDuration = sc.nextInt();

        if (parkingDuration <= 2) {
            totalCost = 2000;
        } else {
            totalCost = 2000 + (parkingDuration - 2) * 1000;
        }

        System.out.println("The total parking cost for " + parkingDuration
                + " hours is: Rp " + totalCost);

        sc.close();
    }
}
```

### Program Output

![Parking program output](images/media/image16.png)

---

## 3b. Problem 2 — Academic Queue Machine

The campus academic office provides a digital queueing kiosk. Students can enter a service code, and the machine displays the service type and corresponding counter.

### Figure 15. Academic Queue Machine service-code table

![Figure 15 - Academic queue table](images/media/image17.png)

| Code | Service | Counter |
|---:|---|---|
| 1 | Legalisir Ijazah | Loket A |
| 2 | Surat Keterangan Aktif Kuliah | Loket B |
| 3 | Pembayaran UKT | Loket C |
| 4 | Pengajuan Cuti Akademik | Loket D |

### Figure 16. Academic Queue Machine pseudocode and flowchart

![Figure 16 - Academic queue pseudocode](images/media/image18.png)
![Figure 16 continued - Academic queue flowchart](images/media/image19.png)

### Figure 17. Java SWITCH-CASE implementation of the Academic Queue Machine

![Figure 17 - Academic queue Java code](images/media/image20.png)

### Java Code

```java
import java.util.Scanner;

public class Assignmentloket13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int serviceCode;

        System.out.println("--- Academic Queue Machine ---");
        System.out.print("Enter service code: ");
        serviceCode = sc.nextInt();

        switch (serviceCode) {
            case 1:
                System.out.println("Service: Degree Legalization");
                System.out.println("Counter: Counter A");
                break;

            case 2:
                System.out.println("Service: Active Student Certificate");
                System.out.println("Counter: Counter B");
                break;

            case 3:
                System.out.println("Service: Tuition Fee Payment");
                System.out.println("Counter: Counter C");
                break;

            case 4:
                System.out.println("Service: Academic Leave Application");
                System.out.println("Counter: Counter D");
                break;

            default:
                System.out.println("Service code is not available");
        }

        sc.close();
    }
}
```

### Figure 18. Academic Queue Machine program execution

![Figure 18 - Academic queue output](images/media/image21.png)

---

# GitHub Repository

The repository listed in the original report is:

[https://github.com/Fnyoo/Code-java/tree/main/week5](https://github.com/Fnyoo/Code-java/tree/main/week5)

---

## Notes for GitHub

All Java programs above are placed inside fenced Markdown code blocks using `java` syntax highlighting. On GitHub, these blocks can be copied directly using the **Copy** button.

The original screenshots are also retained in `images/media/` so the report still contains the evidence from the practicum document.
