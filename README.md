# House Price Prediction Using Linear Regression in Java

## Overview
This project implements a **House Price Prediction System** using **Multiple Linear Regression in Java**.  
The model predicts house prices based on:
- Square Footage
- Number of Bedrooms
- Number of Bathrooms


---

## Features
- Predicts house prices using Linear Regression
- Uses CSV dataset for training data
- Built completely in Java
- Attractive HTML frontend interface
- Maven-based project structure
- Uses Apache Commons Math library for regression calculations

---

## Technologies Used
- Java
- Maven
- Apache Commons Math
- HTML/CSS
- Git & GitHub

---

## Project Structure

```plaintext
HousePricePrediction
│
├── index.html
├── house_prices.csv
├── pom.xml
├── README.md
│
└── src
    └── main
        └── java
            ├── HouseData.java
            ├── LinearRegressionModel.java
            └── Main.java
```

---

## Dataset

The dataset contains the following columns:

| Feature | Description |
|---|---|
| sqft | Area of house in square feet |
| bedrooms | Number of bedrooms |
| bathrooms | Number of bathrooms |
| price | House price |

Sample Data:

```csv
sqft,bedrooms,bathrooms,price
1000,2,1,200000
1200,2,2,250000
1500,3,2,310000
1800,3,3,400000
```

---

## How the Project Works

1. Reads data from CSV file
2. Stores house details using `HouseData` class
3. Trains Multiple Linear Regression model
4. Predicts house price using user inputs
5. Displays predicted result

---

## Installation & Setup

### 1. Clone Repository

```bash
git clone https://github.com/aayushia089-web/HousePricePrediction.git
```

---

### 2. Open in IntelliJ IDEA
- Open IntelliJ IDEA
- Select **Open Project**
- Choose the cloned repository folder

---

### 3. Install Maven Dependencies

The project uses:

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
```

Reload Maven project after opening.

---

## Running the Project

### Run Main.java

The program will:
- Train the regression model
- Predict house prices
- Print output in console

---

## Sample Output

```plaintext
========== MODEL COEFFICIENTS ==========
Intercept: ...
Square Footage Coefficient: ...
Bedrooms Coefficient: ...
Bathrooms Coefficient: ...

==========================
Predicted House Price
==========================
House: 2100 sqft, 4 bedrooms, 3 bathrooms
Predicted Price: $470000
```

---

## Frontend UI

The project also contains an attractive HTML frontend where users can:
- Enter house details
- Predict estimated house price
- View results interactively

---

## Learning Outcomes
Through this project, the following concepts were learned:
- Machine Learning Basics
- Linear Regression
- Java Programming
- CSV File Handling
- Maven Dependency Management
- Git & GitHub Usage

---

## Future Improvements
- Add real-time backend integration
- Improve prediction accuracy using larger datasets
- Add graphical visualizations
- Deploy as a web application

---

## Author
**Aayushi**

GitHub:  
https://github.com/aayushia089-web

---

## License
This project is created for educational and internship purposes.
