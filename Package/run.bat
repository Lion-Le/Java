@echo off
echo �sĶ(Compiler):
echo javac lion/Example.java
echo javac le/Example.java
echo javac PackageExample.java
echo.
javac lion/Example.java
javac le/Example.java
javac PackageExample.java

echo ����(Run):
echo java PackageExample -classPath lion;le
echo.

echo ��X(Output):
java PackageExample -classPath lion;le

echo.	
echo.

pause