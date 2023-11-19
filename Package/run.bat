@echo off
echo ½sÄ¶(Compiler):
echo javac lion/Example.java
echo javac le/Example.java
echo javac PackageExample.java
echo.
javac lion/Example.java
javac le/Example.java
javac PackageExample.java

echo °õ¦æ(Run):
echo java PackageExample -classPath lion;le
echo.

echo ¿é¥X(Output):
java PackageExample -classPath lion;le

echo.	
echo.

pause