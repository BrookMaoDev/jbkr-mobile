# JBKR Mobile

JBKR Mobile (Java Brokers Mobile) is a stock trading simulator inspired by Hollywood movies. In these films, stock data in white text is displayed on several black monitors for a stock broker to ignore. We decided to build this project to add color to these stock trading interfaces. Now, stock brokers can ignore colorful monitors rather than black and white ones. The desktop app was built using [**Lanterna**](https://github.com/mabe02/lanterna) for the TUI and [**yahoofinance-api**](https://github.com/sstrickx/yahoofinance-api) to pull stock data from the NYSE and NASDAQ.

![JBKR Mobile](https://github.com/wang-owen/JBKR-Mobile/assets/69203168/9bc91515-cfc4-459c-a814-54f108e8fa7a)

## Features

### 📈 Stock Data
- Stock data is pulled real-time through the Yahoo Finance API from the NYSE and NASDAQ.
- Stocks can be searched by their ticker name, with the most relevant results being shown.

### 😃 Users
- Users can create profiles with a username and password (which will be encrypted) to save their purchases and balance. User sessions can be managed by logging in and out without resetting upon app restart.
- When a user logs in, a searching algorithm is used to verify credentials with the database.
- Users can create either adult or child profiles, with child profiles being restricted to a certain balance and stock purchases.
- Users can view their portfolio, showing their owned stocks, net worth, and net profit gained since the creation of their account.
- Stocks may be modified directly within the portfolio (e.g., purchase more, sell stocks).
- Stocks in the portfolio can be sorted alphabetically, by quantity, or by price using insertion sort.

### 💸 Transactions
- Users may deposit and withdraw balance to and from their account, which can be used to purchase stocks.
- Stocks listed on the NYSE and NASDAQ are available to be purchased, with the user specifying the amount they wish to buy.
- Users are able to activate a "buy max" function on their owned stocks, which recursively purchases quantities of their owned stocks from most expensive to least until they are no longer able to do so.

## ✍️ Contributing
Any developer contributions are welcome, and we appreciate your interest! To contribute, follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b bugfix`).
3. Make the appropriate changes in the files.
4. Stage and commit changes (`git commit -am 'bugfix'`).
5. Push to the branch (`git push origin bugfix`).
6. Create a Pull Request.

### 🪲 Known bugs:
- [ ] Java.net.CookieManager Invalid Cookie when requesting from Yahoo Finance (2023/10/16).

## 🧑‍💻 Usage
1. Fork or clone the repository.
2. Ensure you can open the Maven Project.
3. Run `Main.java`.
