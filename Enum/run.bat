@echo off
echo ½sÄ¶(Compiler):
echo javac UseEnumExample.java
echo javac NotUseEnumExample.java
echo.
cd ./UseEnumExample
javac UseEnumExample.java
cd ../NotUseEnumExample
javac NotUseEnumExample.java

echo °õ¦æ(Run):
echo java UseEnumExample
echo java NotUseEnumExample
echo.

echo UseEnumExample¿é¥X(Output):
cd ../UseEnumExample
java UseEnumExample

echo NotUseEnumExample¿é¥X(Output):
cd ../NotUseEnumExample
java NotUseEnumExample

echo.	
echo.

pause