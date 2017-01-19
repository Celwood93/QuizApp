@echo off

set a=C:\Users\Cameron\Desktop

javac -d Classes -cp .;%a%\junit\junit-4.12.jar TesterForFunctionality.java

java -cp .;%a%\junit\junit-4.12.jar;Classes;%a%\junit\hamcrest-core-1.3.jar org.junit.runner.JUnitCore TesterForFunctionality

pause