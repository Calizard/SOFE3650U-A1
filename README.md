# SOFE3650U-A1
SOFE 3650U - Assignment 1: Design Patterns

**Structure of Repository**  
-src  
  \t contains all the Java source files required  
-TestFiles  
  \t contains the files needed to test the code  
    \t\t price_list.dat is a data file that contains comma-separated values (product name and product price)  
      \t\t\t it is used to set the price after a product has been created  
    \t\t GroceryTest.java is a Java main class to test the code  
      \t\t\t is also found in the src directory as it should be located along with the other source files to compile  
-UML_Diagram.pdf  
  \t answer file to exercise 1 of this assignment  

**Test Method Details**  
To test our program we:  
  \t 1. Stored the product name and price respectively in a Map object  
  \t 2. Created our concrete factories  
  \t 3. Created grocery products  
  \t 4. Set the product prices of each grocery product by utilizing the map object to fetch the product price  
  \t 5. Display the attributes of each grocery product and verify that they are correct  
In our test, we demonstrated our code by creating the following grocery products:  
  \t Apple, Banana, Orange  
Execution of our Test:  
![image](https://github.com/Calizard/SOFE3650U-A1/assets/119135039/8a8d8f3a-e393-4721-9ac1-1fb1b9d8bae1)
