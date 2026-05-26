# Introduction to Java Programming and Data Structures 12th edition

This repository contains practical exercises to practice Java 11.
This section is for theoretical programs.

---

To compile inside the source program or source code folder:
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src\Chapter1\Section7_Java_program\Ex_1_7_5_Expression_output> javac Ex_1_7_5_Expression_output.java
```
To compile inside the main folder:
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src> javac Chapter1/Section7_Java_program/Ex_1_7_5_Expression_output/Ex_1_7_5_Expression_output.java
```

To run the compiled class (run the bytecode or object code) from the source program folder:
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src\Chapter1\Section7_Java_program\Ex_1_7_5_Expression_output> java -classpath ../../.. Chapter1.Section7_Java_program.Ex_1_7_5_Expression_output.Ex_1_7_5_Expression_output
```
or use the abbreviation `-cp`
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src\Chapter1\Section7_Java_program\Ex_1_7_5_Expression_output> java -cp ../../.. Chapter1.Section7_Java_program.Ex_1_7_5_Expression_output.Ex_1_7_5_Expression_output
```

To run the compiled class from the main folder:
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src> java Chapter1.Section7_Java_program.Ex_1_7_5_Expression_output.Ex_1_7_5_Expression_output
```

To enable assertions:
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src> java -enableassertions Chapter1.Section7_Java_program.Ex_1_7_5_Expression_output.Ex_1_7_5_Expression_output
```
or use the abbreviation `-ea`
```bash
PS D:\Java\JavaDSA\JavaProgrammingDSA\src> java -ea Chapter1.Section7_Java_program.Ex_1_7_5_Expression_output.Ex_1_7_5_Expression_output
```
---

##### Chapter 1 – Introduction to Computers, Programs and Java

###### Section 2 – Computer
1. [Hardware software](src/Chapter1/Section2_Computer/Ex_1_2_1_Hardware_software/Ex_1.2.1_Hardware_software.md) — Explain terms
2. [Components](src/Chapter1/Section2_Computer/Ex_1_2_2_Components/Ex_1.2.2_Components.md) — Hardware components
3. [CPU speed](src/Chapter1/Section2_Computer/Ex_1_2_3_CPU_speed/Ex_1.2.3_CPUS_speed.md) — Measurement of CPU speed
4. [Bit byte](src/Chapter1/Section2_Computer/Ex_1_2_4_Bit_byte/Ex_1.2.4_Bit_byte.md) — Bits and bytes
5. [Memory](src/Chapter1/Section2_Computer/Ex_1_2_5_Memory/Ex_1.2.5_Memory.md) — Primary memory capabilities
6. [Memory size](src/Chapter1/Section2_Computer/Ex_1_2_6_Memory_size/Ex_1.2.6_Memory_size.md) — Memory size units
7. [Memory Disk](src/Chapter1/Section2_Computer/Ex_1_2_7_Memory_Disk/Ex_1.2.7_Memory_disk.md) — Memory vs Disk storage

###### Section 3 – Programming languages
1. [CPU language](src/Chapter1/Section3_Programming_languages/Ex_1_3_1_CPU_language/Ex_1.3.1_CPU_language.md) — CPU machine language
2. [Assembly](src/Chapter1/Section3_Programming_languages/Ex_1_3_2_Assembly/Ex_1.3.2_Assembly.md) — Assembly language basics
3. [High level language](src/Chapter1/Section3_Programming_languages/Ex_1_3_3_High_level_language/Ex_1.3.3_High_level_language.md) — High-level programming overview
4. [Compiler interpreter](src/Chapter1/Section3_Programming_languages/Ex_1_3_4_Compiler_interpreter/Ex_1.3.4_Compiler_interpreter.md) — Compilers vs Interpreters
5. [Compiled interpreted language](src/Chapter1/Section3_Programming_languages/Ex_1_3_5_Compiled_interpreted_language/Ex_1.3.5_Compiled_interpreted_language.md) — Language compilation types

###### Section 4 – OS
1. [OS operations](src/Chapter1/Section4_OS/Ex_1_4_1_OS_operations/Ex_1.4.1_OS_operations.md) — Introduction to Operating Systems
2. [OS Responsibilities](src/Chapter1/Section4_OS/Ex_1_4_2_OS_Responsibilities/Ex_1.4.2_OS_Responsibilities.md) — Key OS responsibilities
3. [Multiprogramming multithreading multiprocessing](src/Chapter1/Section4_OS/Ex_1_4_3_Multiprogramming_multithreading_multiprocessing/Ex_1_4_3_Multiprogramming_multithreading_multiprocessing.md) — Concurrency and processing

###### Section 5 – Java, World Wide Web, and Beyond
1. [Java owner](src/Chapter1/Section5_Java_world_wide_web/Ex_1_5_1_Java_owner/Ex_1.5.1_Java_owner.md) — Origins and ownership of Java
2. [Java applets](src/Chapter1/Section5_Java_world_wide_web/Ex_1_5_2_Java_applets/Ex_1.5.2_Java_applets.md) — Concept of Applets
3. [Android](src/Chapter1/Section5_Java_world_wide_web/Ex_1_5_3_Android/Ex_1.5.3_Android.md) — Java in mobile development

###### Section 6 – The Java Language Specification, API, JDK, JRE, and IDE
1. [Java language Spec](src/Chapter1/Section6_Java_language_spec/Ex_1_6_1_Java_language_Spec/Ex_1.6.1_Java_language_spec.md) — API and language specification
2. [JDK JRE](src/Chapter1/Section6_Java_language_spec/Ex_1_6_2_JDE_JRE/Ex_1.6.2_JDE_JRE.md) — Distinguishing JDK and JRE
3. [IDE](src/Chapter1/Section6_Java_language_spec/Ex_1_6_3_IDE/Ex_1.6.3_IDE.md) — Integrated Development Environments
4. [IDE examples](src/Chapter1/Section6_Java_language_spec/Ex_1_6_4_IDE_examples/Ex_1.6.4_IDE_examples.md) — Examples of popular IDEs

###### Section 7 – A Simple Java Program
- [Demo Welcome](src/Chapter1/Section7_Java_program/Demo_1_01_Welcome/Demo_1_01_Welcome.java) — First Java Program
- [Demo Welcome 3 times](src/Chapter1/Section7_Java_program/Demo_1_02_Welcome_3_times/Demo_1_02_Welcome_3_times.java) — Printing text multiple times
- [Demo Expressions](src/Chapter1/Section7_Java_program/Demo_1_03_Expressions/Demo_1_03_Expressions.java) — Mathematical expressions
1. [Java keyword](src/Chapter1/Section7_Java_program/Ex_1_7_1_Java_keyword/Ex_1_7_1_Java_keyword.md) — Reserved keywords
2. [Java naming conventions](src/Chapter1/Section7_Java_program/Ex_1_7_2_Java_naming_conventions/Ex_1_7_2_Java_naming_conventions.md) — Naming classes and files
3. [Java comments](src/Chapter1/Section7_Java_program/Ex_1_7_3_Java_comments/Ex_1_7_3_Java_comments.md) — Use of code comments
4. [Print statement](src/Chapter1/Section7_Java_program/Ex_1_7_4_Print_statement/Ex_1_7_4_Print_statement.md) — Console output variations
5. [Expression output](src/Chapter1/Section7_Java_program/Ex_1_7_5_Expression_output/Ex_1_7_5_Expression_output.java) — Evaluating an expression

###### Section 8 – Compiling and executing
1. [Source code and Bytecode](src/Chapter1/Section8_Compiling_executing/Ex_1_8_1_Sourcecode_Bytecode/Ex_1_8_1_Sourcecode_bytecode.md) — Java source, compilation and bytecode
2. [Input/output and the compiler](src/Chapter1/Section8_Compiling_executing/Ex_1_8_2_Input_output_compiler/Ex_1_8_2_Input_output_compiler.md) — Compiler I/O and messages
3. [Compile](src/Chapter1/Section8_Compiling_executing/Ex_1_8_3_Compile/Ex_1_8_3_Compile.md) — How to compile Java source files
4. [Run](src/Chapter1/Section8_Compiling_executing/Ex_1_8_4_Run/Ex_1_8_4_Run.md) — Running Java classes and classpath
5. [JVM](src/Chapter1/Section8_Compiling_executing/Ex_1_8_5_JVM/Ex_1_8_5_JVM.md) — Java Virtual Machine overview
6. [Portability](src/Chapter1/Section8_Compiling_executing/Ex_1_8_6_Portability/Ex_1_8_6_Portability.md) — Platform independence and portability
7. [No class defined](src/Chapter1/Section8_Compiling_executing/Ex_1_8_7_No_class_defined/Ex_1_8_7_No_class_defined.md) — Common compilation/runtime class errors
8. [No main](src/Chapter1/Section8_Compiling_executing/Ex_1_8_8_No_main/Ex_1_8_8_No_main.md) — Missing main method issues

###### Section 9 – Programming style
1. [Programming style](src/Chapter1/Section9_Programming_style/Ex_1_9_1_Programming_style/Ex_1_9_1_Programming_style.md) — Coding style, formatting and best practices

###### Section 10 – Programming errors
1. [Compile / Runtime / Logic errors](src/Chapter1/Section10_Programming_errors/Ex_1_10_1_Compile_Runtime_Logic_errors/Ex_1_10_1_Compile_runtime_logic_errors.md) — Types of programming errors
2. [Examples of compile/runtime/logic errors](src/Chapter1/Section10_Programming_errors/Ex_1_10_2_Examples_compile_runtime_logic_errors/Ex_1_10_2_Examples_compile_runtime_logic_errors.md) — Examples and explanations
3. [Syntax error](src/Chapter1/Section10_Programming_errors/Ex_1_10_3_Syntax_error/Ex_1_10_3_Syntax_error.md) — Common syntax mistakes
4. [Runtime error](src/Chapter1/Section10_Programming_errors/Ex_1_10_4_Runtime_error/Ex_1_10_4_Runtime_error.md) — Errors during execution
5. [Logic error](src/Chapter1/Section10_Programming_errors/Ex_1_10_5_Logic_error/Ex_1_10_5_Logic_error.md) — Incorrect program logic
6. [Fix errors](src/Chapter1/Section10_Programming_errors/Ex_1_10_6_Fix_errors/Ex_1_10_6_Fix_errors.md) — How to locate and fix errors

##### Chapter 2 – Elementary programming

###### Section 2 – Writing a simple program
- [Demo ComputeArea](src/Chapter2/Section2_Writing/Demo_2_1_ComputeArea/ComputeArea.java) — Compute the area of a circle (demo)
1. [String concatenation](src/Chapter2/Section2_Writing/Ex_2_2_1_String_concatenation/Ex_2_2_1_String_concatenation.md) — Identify and fix string concatenation errors (exercise)

###### Section 3 – Reading input from the console
- [Demo ComputeAreaWithConsoleInput](src/Chapter2/Section3_Reading_input/Demo_2_2_ComputeAreaWithConsoleInput/ComputeAreaWithConsoleInput.java) — Read radius from console and compute area (demo)
- [Demo ComputeAverage](src/Chapter2/Section3_Reading_input/Demo_2_3_ComputeAverage/ComputeAverage.java) — Read three numbers and compute their average (demo)
1. [Input error](src/Chapter2/Section3_Reading_input/Ex_2_3_1_Input_error/Ex_2_3_1_Input_error.md) — What happens on invalid input (exercise)
2. [Specific vs wildcard import](src/Chapter2/Section3_Reading_input/Ex_2_3_2_Specific_Wildcard_import/Ex_2_3_2_Specific_Wildcard_import.md) — Specific and wildcard import differences (exercise)
