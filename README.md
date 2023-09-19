# Report on the Banking System Project

## Introduction

This Java project aims to create a visual banking system using `JOptionPane` for user interaction. The system allows users to register, access their accounts, make withdrawals, deposits, and request loans. It also utilizes inheritance and superclasses to manage account information.

## Main Challenges

During the development of this project, I encountered several challenges:

1. **Graphical User Interface (GUI)**: Implementing a user-friendly GUI using `JOptionPane` for account registration and operations was a significant challenge. Ensuring that the interface was intuitive and easy to navigate required careful design.

2. **Account Creation Logic**: Designing the logic to create different types of accounts (Individual and Business) based on user input presented its own set of challenges. Handling user input and validating it for account creation was crucial.

3. **Account Access and Operations**: Allowing users to access their accounts, perform transactions like withdrawals, deposits, and loan requests while ensuring the security of sensitive information required careful planning.

## Project Explanation

### Class: Person

This class represents a person with attributes such as `name`, `age`, `cpf`, and `cnpj` (tax identification numbers). It contains basic getters and setters for these attributes.

### Class: Account

This class extends `Person` and represents an account. It includes attributes like `balance`, `code` (account code), `accountType` (account type), `password` (account password), and `loan` (loan amount). The methods within this class allow for account creation, access, withdrawals, deposits, and loan requests.

### Class: Main

The `Main` class orchestrates the entire program. It manages user interactions, allowing them to create accounts, search for existing accounts, and perform operations like viewing account information and making transactions.

## Banking System Functionalities

1. **Account Creation**:
   - Users are prompted to enter their age and select an account type (Individual or Business).
   - Depending on the selection, the user may need to provide additional information like CPF or CNPJ.

2. **Account Access**:
   - Users can search for existing accounts by providing the account name.
   - Once found, users can perform operations like withdrawals, deposits, and loan requests.

3. **Withdrawals**:
   - Users can withdraw a specified amount, provided that the account balance is sufficient.

4. **Deposits**:
   - Users can deposit a specified amount into their account.

5. **Loan Requests**:
   - Users can request a loan, subject to certain limits and conditions.

## Conclusion

This banking system project provided a practical application of Java programming principles, emphasizing object-oriented principles, user interface design, and inheritance. It required careful consideration of user interactions, security measures, and account management.

The project successfully achieved its objectives, and future improvements may involve enhanced user authentication, transaction history, and additional security features.

---

*Note: The code presented has been summarized for documentation purposes and may contain omitted sections for brevity.*
