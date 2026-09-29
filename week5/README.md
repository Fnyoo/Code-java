# <img src="images/media/image1.png"
style="width:3.92708in;height:3.95278in" />SESSION – 3 : Operator, Sequence, Flowchart dan Pseudocode

| Nama  | :   | Fauz Dino                    |
|-------|-----|------------------------------|
| NIM   | :   | 264107020241                 |
| Prodi | :   | D-IV Informatics Engineering |
| Kelas | :   | 1I                           |

**DEPARTMENT OF INFORMATION TECHNOLOGY**

**POLITEKNIK NEGERI MALANG**

**2026/2027**

# Experiment 1: Using IF and IF-ELSE to Print the KRS The program uses an IF selection structure to verify the student's UKT payment status. The boolean uktlunas variable stores the user's input as true or false. When the input is true, the if (uktpaid) condition is satisfied and the program displays messages confirming the tuition payment and allowing the student to print the KRS. Based on the terminal output, the input true successfully executes both statements inside the IF block.  <img src="images/media/image2.png"
style="width:6.22609in;height:3.22639in" />

Figure 1 Java IF selection for KRS tuition payment verification

**Running the program and observing the results in the integrated
terminal**

<img src="images/media/image3.png"
style="width:5.50855in;height:0.99185in" />

Figure 2 Program execution when the input is true

## Questions!

1\. What value must you enter so that both lines inside the IF block are
printed? Explain

why only that value is accepted!

**Answer:** The value to be entered is true , because the uktlunas
variable is declared with a boolean data type, which accepts only true
or false.

2\. Run the program, then enter false. Which lines are printed and which
lines are not?

Explain the execution flow when the IF condition is false!

<img src="images/media/image4.png"
style="width:6.5in;height:0.80139in" />

Figure 3 Program execution when the input is false

**Answer:** When the input false is provided, the program skips the
entire code block within the “{}” braces and immediately terminates
without printing anything.

3\. Run the program, then enter TRUE (in capital letters) and yes. What
happens with each input? If the program stops with an error, explain the
cause!

**Answer:** When TRUE is entered in uppercase, the program will produce
an InputMismatchException because Java is case-sensitive and
Scanner.nextBoolean() expects a valid Boolean value such as true or
false. The input yes will also cause an error because it is not a valid
Boolean value.

4\. The system needs to give information when the user enters the value
false, with the output “Registration rejected. Please pay your UKT
first”. Modify the program by adding an ELSE structure, then show the
run results for the inputs true and false!

<img src="images/media/image5.png"
style="width:5.63537in;height:3.03865in" />

Figure 4 IF-ELSE version for KRS payment validation

<img src="images/media/image6.png"
style="width:5.71161in;height:1.20431in" />

Figure 5 Program output for the IF-ELSE modification

The IF-ELSE structure provides two possible outputs. When the input is
true, the program displays the message confirming that the UKT payment
has been verified and allows the student to print the KRS. When the
input is false, the ELSE block is executed and displays “Registration
rejected. Please pay your UKT first.”

# Experiment 2: SWITCH-CASE to Print the KRS  The program uses a SWITCH-CASE selection structure to display the KRS according to the student's semester. The semester number is entered by the user and stored in the semester variable. The switch statement compares this value with each case from 1 to 8 and displays the corresponding KRS message. The break statement stops the execution after the matching case, while the default section displays “Invalid semester” when the input is outside the available semester range. <img src="images/media/image7.png"
style="width:6.5in;height:3.075in" />

Figure 6 Java SWITCH-CASE program for displaying KRS by semester

<img src="images/media/image8.png"
style="width:6.5in;height:1.92986in" />

Figure 7 Flowchart for the semester/KRS selection process

**Running the program and observing the results in the integrated
terminal**

<img src="images/media/image9.png"
style="width:6.31538in;height:0.61319in" />

Figure 8 Program execution and KRS output

## Questions! 

1\. Delete the break statement in case 5, then compile and run the
program again with the input 5. Write down the output, then explain the
function of break in the SWITCH-CASE structure based on your experiment!
Put the code back to how it was when you are done.

**Answer:** When the break statement in case 5 is removed and the input
is 5, the program executes case 5 and then continues to the following
cases until it reaches a break. This is called fall-through. The break
statement is used to stop the execution of the switch after the matching
case.

2\. Run the program with the input 10, then with the input 0. What is
the output of these two runs? Based on the results, explain the role of
default and what will happen to the program if the default part is
deleted!

**Answer:** If you input 10 or 0, it will display "Invalid Semester"; if
the \`default\` section is removed, the program will not encounter any
errors, but it will not produce any output because there is no handling
instruction for those values.

3\. Change the data type of the semester variable to double, then
compile the program. Does the program compile successfully? Write down
the error message and explain its cause. List the data types that can be
used as the expression in a switch!

**Answer:** It didn't work; there was an error stating that the double
data type is not allowed within the switch parentheses due to type
restrictions. Common types that can be used include byte, short, char,
int and string.

4\. Create a new file named SelectionIfElseAttendanceNo.java. Convert
the KRS printing program that uses SWITCH-CASE into an IF - ELSE IF -
ELSE form. The program output must be exactly the same as the
SWITCH-CASE version, including for invalid input. In your opinion, which
one is easier to read for this case, and why?

<img src="images/media/image10.png"
style="width:6.226in;height:3.66309in" />

Figure 9 IF-ELSE IF-ELSE version of the KRS selection

**Answer:** The switch-case structure is easier to use, more readable,
and tidier than if-else, because it avoids repeating variable names.

# Assignment

1\. Open the file SelectionIfAttendanceNo.java again. Change the
**IF-ELSE** selection

structure in the program into a **Ternary Operator**, with the following
rules:

a\. The decision result is first stored in a String variable named
message, then printed

using a single System.out.println() statement

b\. The program output must be exactly the same as the original program

c\. Save it with the file name **Assignment1SelectionAttendanceNo.java**

<img src="images/media/image11.png"
style="width:5.71262in;height:3.68879in" />

Figure 10 Ternary operator implementation for attendance selection

In your opinion, when is the Ternary Operator better to use than
IF-ELSE, and when

should it not be used?

**Answer:**

Use the ternary operator when the code is simple and requires only one
of two values specifically when the condition is short and easy to
understand. Use if-else when the logic is complex, involves multiple
options, and each condition requires multiple statements.

In short, the ternary operator is best for simple binary choices,
whereas if-else is better suited for complex or multiple conditions.

2\. Look at the following flowchart:

<img src="images/media/image12.png"
style="width:3.71329in;height:2.7745in" />

Figure 11

A KRS system validates the number of credits (SKS) taken by a student,
where the maximum number allowed is 24 credits. Implement the flowchart
above as a Java program using an IF-ELSE selection structure, then save
it with the file name Assignment2SelectionAttendanceNo.java!

<img src="images/media/image13.png"
style="width:6.5in;height:4.24236in" />

Figure 12 Java implementation of the maximum SKS validation

3\. In the Basic Programming class, you made flowcharts and pseudocode
for two cases on the Exercise slides (page 33). Now implement both of
them in Java, with the following rules.

a\. For Problem 1 — Parking System, use an IF-ELSE selection structure
and name the file AssignmentParkingAttendanceNo.java

A mall in Malang implements a paid parking system for two-wheeled
vehicles. The fee is calculated based on the duration of parking (in
hours) according to the following rules:

• The first 2 hours incur a base fee of Rp 2,000.

• For durations exceeding 2 hours, the cost is the base fee plus Rp
1,000 for each additional hour.

Create a flowchart and the corresponding pseudocode.

<img src="images/media/image14.png"
style="width:2.65833in;height:3.13889in" /><img src="images/media/image15.png"
style="width:2.31683in;height:4.23686in" />

Figure 13 Parking System pseudocode and flowchart

<img src="images/media/image16.png"
style="width:5in;height:3.21528in" />

Figure 14 Parking System flowchart

b\. For Problem 2 — Academic Queue Machine, use a SWITCH-CASE selection
structure and name the file: AssignmentQueueAttendanceNo.java. In
addition, the program must include a default part to handle codes
outside 1–4 with the message "Service code is not available"

- The campus academic office provides a digital queueing kiosk. Students
  can enter a service code, and the machine will display the service
  type and the corresponding service counter, as follows:

<img src="images/media/image17.png"
style="width:3.84764in;height:1.29103in" />

Figure 15 Academic Queue Machine service-code table

- Create a flowchart and the corresponding pseudocode.

> <img src="images/media/image18.png"
> style="width:2.46806in;height:2.91389in" /><img src="images/media/image19.png"
> style="width:3.29861in;height:3.63587in" />

Figure 16 Academic Queue Machine pseudocode and flowchart

> <img src="images/media/image20.png"
> style="width:5.5975in;height:3.68681in" />

Figure 17 Java SWITCH-CASE implementation of the Academic Queue Machine

> <img src="images/media/image21.png"
> style="width:5.61101in;height:1.26787in" />

Figure 18 Academic Queue Machine program execution

My Github Repository for this assigment:

https://github.com/Fnyoo/Code-java/tree/main/week5
