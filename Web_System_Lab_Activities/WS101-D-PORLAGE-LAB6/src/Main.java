import program1.Greeting;
import program2.Fibonacci;
import program3.SumAverage;
import program4.Palindrome;
import program5.Rectangle;
import program6.ManageProducts;
import program6.Product;

void main() {

    Greeting greeting = new Greeting();
    Fibonacci fibonacci = new Fibonacci();
    SumAverage sumAverage = new SumAverage();
    Palindrome palindrome = new Palindrome();
    Rectangle rectangle = new Rectangle(5, 10);
    ManageProducts manageProducts = new ManageProducts();

//    Program 1
//    greeting.greet();

//    Program 2, Either scan or direct value
//    fibonacci.fib();

//    Program 3
//    sumAverage.start();

//    Program 4, Either scan or direct value
//    palindrome.isPalindrome();

//    Program 5
//    rectangle.calculateArea();

//    Program 6
    manageProducts.addProduct("ballpen", 12);
    manageProducts.addProduct("pencil", 6.69);
    manageProducts.addProduct("eraser", 19);
    manageProducts.addProduct("notebook", 56);
    manageProducts.addProduct("ruler", 13);
    manageProducts.getProductGreaterThan(12);
//    manageProducts.getTotalExpensiveProduct();
}