@echo off
echo �sĶ(Compiler):
echo javac UseEnumExample.java
echo javac NotUseEnumExample.java
echo.
cd ./UseEnumExample
javac UseEnumExample.java
cd ../NotUseEnumExample
javac NotUseEnumExample.java

echo ����(Run):
echo java UseEnumExample
echo java NotUseEnumExample
echo.

echo UseEnumExample��X(Output):
cd ../UseEnumExample
java UseEnumExample

echo NotUseEnumExample��X(Output):
cd ../NotUseEnumExample
java NotUseEnumExample

echo.	
echo.

pause