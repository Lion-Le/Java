@echo off
echo �sĶ(Compiler):
echo javac Hello.java
echo.
javac Hello.java

echo ���ͼ��Y��(.h)
echo JDK8�H�e�����y�k: javah Hello
echo JDK8(�t)�H�᪩���y�k: javac -h . Hello.java
echo javac -h . Hello.java
echo.
javac -h . Hello.java

echo ����(Run):
echo java -cp . Hello
echo.

echo ��X(Output):
java -cp . Hello

echo.	
echo.

pause