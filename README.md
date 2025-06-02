This project is an end-to-end automation script that simulates a real user journey on the Demoblaze e-commerce site. It starts by opening the website in a Chrome browser, logging in with a test account, selecting the first available product, and adding it to the cart. After that, it navigates to the cart page, fills in the checkout form with dummy customer details, and completes the purchase. The script then prints the confirmation message to the console. The project follows the Page Object Model (POM) design pattern to keep the code modular and easy to maintain, with separate classes for login, product selection, and cart handling. Everything runs from a main() method

---

##  Technologies Used

- Java
- Selenium WebDriver
- WebDriverManager 
- Maven
- Eclipse IDE

---

##  How to Run the Test

1. Clone this repo or download it
2. Open it in Eclipse
3. Make sure dependencies are downloaded via `pom.xml`
4. Run the `OrderTest` class as a Java Application

---

## Test Flow

The automation script performs the following actions:

1. Launches the browser and navigates to [https://www.demoblaze.com](https://www.demoblaze.com)
2. Logs in with username and password 
3. Selects the first product and adds it to the cart
4. Goes to the cart and completes the order form
5. Submits the order and prints confirmation

---

## Author

Jatin Tiwari
[GitHub Profile](https://github.com/jatintiwari234)

---

