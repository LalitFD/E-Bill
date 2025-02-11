# 🔌 Electricity Bill Generator

A Java-based console application that calculates electricity bills based on consumer type (Urban/Rural) and usage category (Domestic/Commercial). The program includes a login system and generates a formatted bill with various charges and subsidies applied.

## 📌 Features
- Secure login system for authentication
- Supports **Urban & Rural** billing calculations
- **Domestic & Commercial** billing rates
- **Government subsidy calculations** for eligible users
- **Random consumer number generation**
- Generates a structured electricity bill
- Input validation to prevent incorrect entries

## 🛠️ Technologies Used
- **Java** (Core concepts like OOPs, Exception Handling)
- **Scanner Class** (for user input)
- **Random Class** (for unique consumer number generation)
- **Thread.sleep()** (for delays)
- **LocalDate & Month API** (for date handling)

## 🚀 How to Run
1. **Clone the Repository**
   ```sh
   git clone https://github.com/your-username/Electricity-Bill-Generator.git
   ```
2. **Navigate to the Project Folder**
   ```sh
   cd Electricity-Bill-Generator
   ```
3. **Compile and Run the Java Program**
   ```sh
   javac Ebill.java
   java Ebill
   ```

## 📖 Usage Guide
1. **Login with the default password**: `7575`
2. **Enter Region**: Urban / Rural
3. **Enter Purpose**: Domestic / Commercial
4. **Provide Electricity Readings**: Current & Previous
5. **Enter Consumer Details**: Name & Address
6. **Receive a formatted bill** with total payable amount

## 📊 Billing Logic
| Units Consumed | Domestic (₹) - Urban | Domestic (₹) - Rural | Commercial (₹) - Urban | Commercial (₹) - Rural |
|---------------|-----------------|-----------------|------------------|------------------|
| 0 - 100       | 3.00/unit, ₹500 subsidy | 2.50/unit, ₹500 subsidy | 5.00/unit       | 4.00/unit       |
| 101 - 200     | 5.00/unit       | 4.00/unit       | 7.50/unit       | 6.50/unit       |
| 200+         | 7.00/unit       | 6.00/unit       | 10.00/unit      | 9.00/unit       |

## ⚡ Sample Output
```
|--------------------------------------------------------- |
|           🔥 Electricity Bill - URBAN                   |
|----------------------------------------------------------|
| Madhya Pradesh Paschim Kshetra Vidyut Vitran Company Ltd |
|         G.P.H. Compound, Pologround, Indore (M.P.)       |
+----------------------------------------------------------+
 GST No. 23ABCD1234561ZU           Call Centre No. 1912
+----------------------------------------------------------+
 Date:- February 2025
+----------------------------------------------------------+
 Consumer Number: A1234567        Connection Type: Domestic
 Mr/Ms. John Doe                   DC/Zone: Mangliya
 Address: 123 Main Street          Division: Indore
 Mobile No.: 7610712047            Feeder Code: 856416656
+----------------------------------------------------------+
 {Billing Detail}...........................{Amount in INR}
 Energy Charges                                  ₹350.00
 Fixed Charge                                     ₹324.00
 Electricity Duty                                 ₹89.00
 Interest On Security Deposit (-)                 ₹8.79
 M.P. Govt. Subsidy Amount (-)                  ₹500.00
+----------------------------------------------------------+
 [ Total Amount Payable ]                       ₹255.00
+----------------------------------------------------------+
```

## 🏗️ Future Enhancements
- **GUI Version** using Java Swing/JavaFX
- **Database Integration** for storing bills
- **Online Payment Integration**

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repo, make changes, and submit a pull request.

## 📜 License
This project is licensed under the **MIT License**. Feel free to modify and distribute it.

## 🔗 Connect with Me
- GitHub: [https://github.com/LalitFD].

