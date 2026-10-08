# Selenium Ecommerce Order Flow

## 📌 Project Overview

This project automates an end-to-end e-commerce order flow using **Selenium WebDriver with Java**.

The automation is performed on the **SauceDemo** website and covers user login, product sorting, selecting the lowest-priced product, adding it to the cart, checkout, validation, and completing the order.

## 🛠️ Technologies Used

* Java
* Selenium WebDriver
* Chrome Browser
* Eclipse IDE
* Git
* GitHub

## 🌐 Application

**SauceDemo:** https://www.saucedemo.com/

## 🔍 Test Flow

The automation performs the following steps:

1. Launches Chrome browser.
2. Opens the SauceDemo website.
3. Enters the standard user credentials.
4. Logs into the application.
5. Retrieves and prints all available product sorting options.
6. Selects **Price (low to high)** from the dropdown.
7. Verifies that the correct sorting option is selected.
8. Identifies the product with the lowest price.
9. Adds the lowest-priced product to the cart.
10. Opens the shopping cart.
11. Proceeds to checkout.
12. Enters customer information.
13. Continues to the order summary page.
14. Verifies that the selected product is present in the checkout.
15. Retrieves and displays the tax and total amount.
16. Completes the order.
17. Closes the browser.

## 🔧 Selenium Concepts Used

* `WebDriver`
* `ChromeDriver`
* `findElement()`
* `findElements()`
* `By.id()`
* `By.className()`
* `By.name()`
* `By.xpath()`
* `Select`
* `getOptions()`
* `selectByVisibleText()`
* `getFirstSelectedOption()`
* `sendKeys()`
* `click()`
* `getText()`

## 💡 Key Logic

The program identifies the lowest-priced product by:

* Retrieving all products using `findElements()`
* Reading each product name and price
* Converting the price from `String` to `double`
* Comparing the prices
* Selecting the product with the minimum price
* Adding that product to the cart

The selected product is then validated again during checkout.

## 📂 Project Structure

```text
Selenium-Ecommerce-Order-Flow/
│
├── src/
│   └── ecommerce_order_flow/
│       └── Ecommerce.java
│
├── .classpath
├── .project
├── .gitignore
└── org.eclipse.jdt.prefs
```

## ▶️ How to Run

1. Clone this repository.
2. Open the project in Eclipse.
3. Make sure Java is installed and configured.
4. Add Selenium WebDriver libraries to the project.
5. Make sure Chrome browser is installed.
6. Open `Ecommerce.java`.
7. Run the program as a Java Application.

## 👤 Test User

The project uses the SauceDemo standard test user:

```text
Username: standard_user
Password: secret_sauce
```

These are the publicly provided test credentials for the SauceDemo practice application.

## ✅ Expected Result

The automation should:

* Successfully log in.
* Select **Price (low to high)**.
* Identify the lowest-priced product.
* Add the product to the cart.
* Complete the checkout process.
* Verify the selected product during checkout.
* Display the product price, tax, and total.
* Complete the order successfully.

## 👩‍💻 Author

**Laxmipriya Singaravadivelu**

B.Tech Artificial Intelligence and Data Science
2026 Graduate
