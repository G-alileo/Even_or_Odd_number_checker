    # Even or Odd Checker - Java Program

## 📌 Overview

This Java program checks whether a given integer is even or odd. It prompts the user for input, evaluates the number, and displays the result. The program also includes exception handling to manage invalid inputs.

## 🚀 Features

- Accepts user input via the `Scanner` class.
- Determines whether the input is even or odd.
- Uses exception handling (`InputMismatchException`) to handle invalid inputs.
- Displays appropriate messages for valid and invalid inputs.

## 📜 Code Structure

### 🔹 EvenorOddChecker Method

- Accepts an integer (`user_value`).
- Checks if the number is divisible by `2`:
  - If true, returns `"Even"`.
  - Otherwise, returns `"Odd"`.

### 🔹 Main Method

- **Variable Declarations:**

  - `user_val`: Stores the integer input from the user.
  - `validity`: Controls the loop to allow continuous execution.

- **Creating Scanner Object:**

  - `Scanner` is used to capture user input.
  - `Main obj = new Main();` creates an object to call `EvenorOddChecker`.

- **Loop to Handle Input:**

  - The loop runs continuously, prompting the user for input.

- **Calling the EvenorOddChecker Method:**

  - Calls the method and prints the result.

- **Exception Handling for Invalid Input:**

  - If a non-integer is entered, an `InputMismatchException` is caught.
  - Displays an error message and exits.

## 💻 Usage

1. Clone this repository:
2. Navigate to the project directory:
3. Compile and run the program:

## 📌 Example Outputs

### ✅ Valid Input
- **2**
### ❌ Invalid Input
- **abc**
## 🔧 Possible Improvements

- **Loop Enhancement:** Allow the user to retry after an invalid input instead of exiting immediately.
- **GUI Version:** Create a simple graphical user interface for a better user experience.
- **Enhanced User Experience:** Provide an option to check multiple numbers in one session.

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).

---

👨‍💻 Developed by Jamespeter Murithi

