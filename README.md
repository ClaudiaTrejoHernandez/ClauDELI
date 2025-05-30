# 🥪 Welcome to ClauDELI

## 📖 Project Description
ClauDELI is a custom sandwich shop application. It automates the ordering process, letting users build their sandwich exactly how they want. Orders are saved as text files in a `receipts` folder, named with the date and time the order was placed. The app uses Object-Oriented Programming to provide a smooth and flexible ordering experience.

---

## ✅ Screens and Features

- **Home Screen**  
  Offers two options:  
  - 1) New Order  
  - 0) Exit  
  The application keeps running until the user chooses to exit.

- **Order Screen**  
  Displays a menu where the newest entries appear first:  
  - 1) Add Sandwich  
  - 2) Add Signature Sandwich  
  - 3) Add Drink  
  - 4) Add Chips  
  - 5) Checkout  
  - 0) Cancel Order (deletes the current order and returns to the Home Screen)

- **Add Sandwich Screen**  
  Guides the user step-by-step to create a custom sandwich:  
  - Select Bread  
  - Choose Sandwich Size  
  - Add Toppings (meat, cheese, other toppings, sauces, and sides)  
  - Choose if the sandwich should be toasted

- **Add Drink Screen**  
  Lets the user add a drink:  
  - Choose Drink Size  
  - Choose Drink Flavor

- **Add Chips Screen**  
  Lets the user choose a chip flavor.

- **Checkout Screen**  
  Displays the order details, item prices, and the total price.  
  - Confirm: Saves the receipt as a text file in the `receipts` folder (creates the folder if it doesn’t exist).  
  - Cancel: Deletes the order and returns to the Home Screen.

---

## 🖥️ Application Screens
- **Home Screen**  
  ![HomeScreen](https://github.com/user-attachments/assets/050eee4d-1d54-4cef-baa3-886cf993ee1c)

- **Order Screen**  
  ![OrderScreen](https://github.com/user-attachments/assets/fa9436c4-2ce3-4c7f-b3b9-671340864b56)

- **Add Sandwich Screen**  
  ![AddSandwichScreen_Bread](https://github.com/user-attachments/assets/b639aaae-5b00-4409-bd2a-79e8121c0e7e)  
  ![AddSandwichScreen_Size](https://github.com/user-attachments/assets/a33fd46e-9908-4d48-a41b-e92ca1df08d3)  
  ![AddSandwichScreen_Toasted](https://github.com/user-attachments/assets/68b35b90-17ea-48fd-91e8-f364b5aac114)  
  ![AddSandwichScreen_Meat](https://github.com/user-attachments/assets/5d8fd798-1bfb-4e73-af31-02fdafe4824c)  
  ![AddSandwichScreen_Cheese](https://github.com/user-attachments/assets/fd3ea28c-c89f-4a80-a84b-d565d037f9bc)  
  ![AddSandwichScreen_Toppings](https://github.com/user-attachments/assets/ec4d495e-1ad0-4195-8d70-3bd67e5db17e)  
  ![AddSandwichScreen_Sauces](https://github.com/user-attachments/assets/83d9f98a-6a5b-4317-8321-967a03943825)  
  ![AddSandwichScreen_Sides](https://github.com/user-attachments/assets/cbc8e860-2d7f-4756-826a-ad93636b73e6)  

- **Add Drink Screen**  
  ![AddDrinkScreen](https://github.com/user-attachments/assets/3c6b40cf-b300-4840-9d45-24c71b8df540)

- **Add Chips Screen**  
  ![AddChipsScreen](https://github.com/user-attachments/assets/4ade3a50-f2c5-4acc-bed6-682c6f2aab0d)

- **Checkout Screen (app screen)**  
  ![CheckoutScreen__Receipt](https://github.com/user-attachments/assets/e3019f7e-b650-498f-81ed-bff2d6590aec)
- **Checkout Screen (text file)**  
  ![CheckoutScreen__ReceiptTXT](https://github.com/user-attachments/assets/1fb3d153-d8aa-4bbe-bad8-498593802484)

---

## 👩‍💻 Interesting Piece of Code
![InterestingPieceOfCode](https://github.com/user-attachments/assets/823bc5bb-c2ca-410b-8b0b-a45a6443331f)  
This class helps manage input from users and improves the program’s reliability:
- Keeps the code clean and avoids repeating the same input-checking tasks in different parts of the app.  
- Makes sure the user enters numbers within a specific range.  
- Handles cases when the user types something that isn’t a number, preventing errors or crashes.  
- Adds clear dividers in the console to make menus and information easier to read.

---

## 🌱 Resources
- YearUp instructor  
- Fellow YearUp peers  
- Java Bootcamp Workbooks and past exercises  
- [Java Trainer Remsey](https://chatgpt.com/g/g-6800332fde008191822e81c0f54c8321-java-trainer-remsey)  
- Google Search  
- GitHub  
