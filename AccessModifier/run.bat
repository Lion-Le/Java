@echo off

echo �إ�./bin��Ƨ�
mkdir bin
echo.

echo �sĶ(Compiler):
echo javac -d .\bin .\src\bank\Card.java .\src\lion\wallet\card\MyCard.java .\src\lion\wallet\MyWallet.java
echo.
javac -d .\bin .\src\bank\Card.java .\src\lion\wallet\card\MyCard.java .\src\lion\wallet\MyWallet.java

echo ����(Run):
echo java -cp .\bin lion.wallet.MyWallet
echo.

echo ��X(Output):
java -cp .\bin lion.wallet.MyWallet

echo.	
echo.

pause