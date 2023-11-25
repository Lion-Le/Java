@echo off

echo 建立./bin資料夾
mkdir bin
echo.

echo 編譯(Compiler):
echo javac -d .\bin .\src\bank\Card.java .\src\lion\wallet\card\MyCard.java .\src\lion\wallet\MyWallet.java
echo.
javac -d .\bin .\src\bank\Card.java .\src\lion\wallet\card\MyCard.java .\src\lion\wallet\MyWallet.java

echo 執行(Run):
echo java -cp .\bin lion.wallet.MyWallet
echo.

echo 輸出(Output):
java -cp .\bin lion.wallet.MyWallet

echo.	
echo.

pause