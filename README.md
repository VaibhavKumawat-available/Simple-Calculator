 **_Simple Calculator_**

This Java program implements a simple calculator that allows users to perform basic arithmetic operations **(addition, subtraction, multiplicat-
-ion, and division)** on two input numbers. The program prompts the user to enter the first number, an operator, and the second number, and 
then displays the result of the operation.

-----------------------------------------------------------------------------------------------------------------------------------------------------
**_Usage:_**

1) Compile the program using a Java compiler:
   
   **javac SimpleCalculator.java**
2) Run the compiled program:
   
   **java SimpleCalculator**
  
-----------------------------------------------------------------------------------------------------------------------------------------------------
**_Instructions:_**

1) The program starts by printing **"Simple Calculator"** to the console.

2) The user is prompted to enter the **first number**. The input is read as a double using the **Scanner** class.

3) The user is prompted to enter an operator **(+, -, *, /)**. The input is read as a character using the **Scanner** class.

4) The user is prompted to enter the **second number**. The input is read as a double using the **Scanner** class.

5) The program then performs the selected arithmetic operation using a **switch statement** based on the input operator.
If the operator is **not** recognized, an **error** message is displayed.

6) For **division**, the program checks if the second number is not zero before performing the division operation. 
If the **second number is zero**, an **error message** is displayed to avoid division by zero.

7) The calculated result is displayed to the user along with a congratulatory message.

8) The **Scanner** is closed to release system resources.

-----------------------------------------------------------------------------------------------------------------------------------------------------
**_Note:_**

(i) Make sure to provide valid numeric input when prompted.

(ii) The program is designed to handle basic arithmetic operations. Complex calculations or scientific calculations are not supported.

-----------------------------------------------------------------------------------------------------------------------------------------------------
**_Example:_**

**Simple Calculator**

**Enter the first number:**
**10**

**Enter an operator (+, -, *, /):**
**+**

**Enter the second number:**
**5**

**Your result is: 15.0**

**CONGRATULATIONS! Your result is: 15.0**

-----------------------------------------------------------------------------------------------------------------------------------------------------
**_Conclusion:_**

In conclusion, the "Simple Calculator" Java program offers a user-friendly and basic solution for performing arithmetic calculations on two
input numbers. By leveraging the **Scanner** class for user input and employing a **switch** statement for operator selection, the program provides
a seamless experience for users to perform addition, subtraction, multiplication, and division operations.

The program ensures proper input validation, preventing division by zero and handling invalid operators gracefully. When executed, the pro-
gram guides the user through the process step by step, displaying both the calculated result and a congratulatory message. It's important to
note that the program is designed for simplicity and convenience, making it ideal for straightforward calculations and educational purposes.
