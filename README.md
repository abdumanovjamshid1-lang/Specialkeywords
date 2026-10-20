# Laboratory 5 — Kotlin Special Keywords (All 15 Tasks Solved)

This ready-to-open **Kotlin/JVM project** contains the complete answers for all 15 tasks in your `Laboratory 5 Special Keywords.docx` worksheet.

## Contents

- `src/main/kotlin/task01/Main.kt` through `src/main/kotlin/task15/Main.kt`: all **15 complete Kotlin console programs**, with fixes and extra exercises added.
- `LAB_ANSWERS.md`: numbered answers to **every experiment, explanation, question, and extension** in the lab.
- `build.gradle.kts` and `settings.gradle.kts`: Gradle project using **Kotlin 2.2.20**; Kotlin 2.2+ is required for Task 5.

## Run in IntelliJ IDEA

1. Extract the `.zip` archive.
2. Open **IntelliJ IDEA** → **File** → **Open** → select the extracted folder `Laboratory5_SpecialKeywords_Solved` (the folder containing `build.gradle.kts`).
3. Trust the project and wait for Gradle sync. Internet access may be required to download the requested Kotlin compiler and dependencies.
4. Open, for example, `src/main/kotlin/task01/Main.kt`.
5. Click the **green arrow next to `fun main()`** and select **Run**. Click the console and type each answer followed by Enter.
6. Run tasks **individually**; each file has its own `main()`. The same structure works in Android Studio when opened as a Kotlin/JVM Gradle project, or you may copy each file to its own `taskXX` package in a Java/Kotlin Library module.

## Alternative Gradle command

If you have Gradle installed, open a terminal in the extracted project folder:

```bash
gradle runLab -Ptask=01 --console=plain
```

Change `01` to `02`, `03`, ..., `15` to run a different task. No Gradle wrapper is bundled, so use the Gradle that is installed or the one supplied by your IDE.

## Sample inputs to try

| Task | Enter (one line at a time) | Expected main result |
|---|---|---|
| 01 | `abc`, `200`, `35` | Age 35 after 3 attempts |
| 02 | `Write report` | Saved message then reminder |
| 03 | `ali` | First match and all matching contacts |
| 04 | `4` | Settings opened |
| 05 | `10`, `abc`, `25.5`, `done` | 2 items, total 35.5 |
| 06 | `25`, `1.75`, `true`, `Samarkand`, `998901234567` | Typed values and phone |
| 07 | `true 5 false x` | Ints `[5]`; Booleans `[true, false]` |
| 08 | `100`, `the quick  brown fox`, `3` | 112.00 VAT; 4 words; 3072 bytes |
| 09 | `no` | Report is not built |
| 10 | `Ali 85`, `Dilnoza 90`, `Ali 70`, `end` | Averages and best grades |
| 11 | `a@b.uz`, `secret123`, `+998111`, `+998222`, `+1202555`, `4` | Validator, phone count, room alias demonstration |
| 12 | `Ali`, `991234567`, `Ali K`, `991234567` | Equality true; set contains duplicate |
| 13 | `ratio` | Describes Double and cast behavior |
| 14 | `-5` | Age cannot be negative |
| 15 | `student`, `add 3`, `mul 4`, `show`, `reset`, `show`, `exit` | 20% coupon; total 12 then 0 |

### Notes

- **Task 5** uses `continue` and `break` inside inline lambdas and cannot be compiled with the old Kotlin 1.9 compiler. Use Kotlin **2.2+** as required by the worksheet.
- **Task 11** intentionally passes feet into a meters-labeled function to demonstrate that `typealias` does *not* create a distinct type.
- **Task 15** exits the program with `exitProcess(0)`; its final `println` is intentionally unreachable.
- **Task 15** throws `IllegalStateException` on an unrecognized coupon by design; enter `student` or `friend` to continue to the calculator.
"# Specialkeywords" 
