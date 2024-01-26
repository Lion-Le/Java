@echo off
echo 編譯(Compiler):
echo javac Example.java
echo.
javac Example.java

echo 執行(Run) - 不啟動斷言檢查(預設):
echo java Example
echo.

echo 輸出(Output):
java Example

echo.
echo 執行(Run) - 啟動斷言檢查(給予 -enableassertions 或 -ea 引數):
echo java -ea Example
echo.

echo 輸出(Output):
java -ea Example

echo.	
echo.

pause