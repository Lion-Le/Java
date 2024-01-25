@echo off
echo 編譯(Compiler):
echo javac Hello.java
echo.
javac Hello.java

echo 產生標頭檔(.h)
echo JDK8以前版本語法: javah Hello
echo JDK8(含)以後版本語法: javac -h . Hello.java
echo javac -h . Hello.java
echo.
javac -h . Hello.java

echo 執行(Run):
echo java -cp . Hello
echo.

echo 輸出(Output):
java -cp . Hello

echo.	
echo.

pause