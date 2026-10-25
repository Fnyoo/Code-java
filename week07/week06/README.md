# Basic Programming Practicum Report
## Session 6: Selection Statements

**Department of Information Technology — Politeknik Negeri Malang — 2026/2027**

| | |
|---|---|
| **Name** | Fauz Dino |
| **NIM** | 264107020241 |
| **Study Program** | D-IV Informatics Engineering |
| **Class** | 1I |

---

## Objectives
1. Solve case studies using basic and nested selection structures.
2. Save and submit work using Git and GitHub through Visual Studio Code.
3. Collaborate with classmates using GitHub.

## Directory Structure

```text
week06/
├── code/
│   ├── studycase1_13.java
│   ├── studycase2_13.java
│   ├── NestedThesisExamAttendance13.java
│   ├── LogicalOperatorWifiAttendance13.java
│   ├── NestedLabAccessAttendance13.java
│   ├── BookAssignment13.java
│   └── Task2AssistantSelectionAttendance13.java
├── images/
│   ├── image1.png
│   ├── image2.png
│   ├── image3.png
│   └── image4.png
└── README.md
```

## Experiment 1: Case Study 1 — Basic Selection

Kedai Kopi Senja sells palm sugar milk coffee for Rp18,000 per cup. A 10% discount is given when the total purchase is at least Rp100,000. The program calculates the total price, discount, amount to pay, and change or shortfall.

**Source code:** `code/studycase1_13.java`

### Logic
1. Read the number of cups and payment amount.
2. Calculate the total price using `numberOfCups * pricePerCup`.
3. Apply a 10% discount when the total price is at least Rp100,000.
4. Calculate the amount to pay after discount.
5. If the payment is enough, display the change; otherwise, display the shortfall.

## Experiment 2: Case Study 2 — Nested Selection

The program checks whether a student qualifies for award funding based on activity type, competition rank or PKM funding approval, and document completeness.

**Source code:** `code/studycase2_13.java`

### Rules implemented
- **BELMAWA, BAKORMA, or Mandiri:** award funding requires a 1st, 2nd, or 3rd place and all four documents.
- **PKM:** funding must be approved and all four documents must be uploaded.
- **Others:** award funding is not granted.
- If fewer than four documents are uploaded, the program displays the number of missing documents.

## Additional Selection Practice

The folder also retains the additional selection exercises:
- `NestedThesisExamAttendance13.java` — thesis exam eligibility using nested IF.
- `LogicalOperatorWifiAttendance13.java` — campus WiFi access using logical operators.
- `NestedLabAccessAttendance13.java` — laboratory access requirements.
- `BookAssignment13.java` — bookstore discount percentage.
- `Task2AssistantSelectionAttendance13.java` — lab assistant selection.

## Compile and Run

Run commands from the `week06` directory. Compile and run each program using its class name:

```bash
javac code/studycase1_13.java
java -cp code studycase1_13
```

```bash
javac code/studycase2_13.java
java -cp code studycase2_13
```

For the other exercises, replace the filename and class name with the relevant program.

## Images

The `images/` folder retains the four image files available in the existing package. Their exact association with screenshots or flowcharts should be checked and updated as needed.

---

**Fauz Dino** · D-IV Informatics Engineering · Politeknik Negeri Malang
