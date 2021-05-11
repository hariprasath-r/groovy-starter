package in.hp.groovy

/**
 * There are various ways in creating method in groovy, Mentioned as below
 * Note:
 *  1. The def keyword or return type is atleast needed to mention it is a method
 *  2. return keyword is optional as the last line result is by default returned
 */

// 1. Normal Java way of creating
int add(int a, int b) {
    return a + b
}

// 2. with def keyword
def sub(def a, def b) {
    return a - b
}

/**
 * 3. without any type reference for input and output,
 * the def is needed to specify this is a method, else groovy will check for inbuilt methods with the same name
 */
def multiply(a, b) {
    a * b
}

// 4. default values for input
def divide(a, b = 1) {
    a / b;
}

// 5. Methods with named parameters
def display(Map map) {
    println map.name
    println map.price
}

// 6. with varargs
def display(... a) {
    a.sum()
}

/**
 * Different types of calling methods in groovy
 */
// 1. usual way
print add(10, 20)
println sub(20, 10)

// 2. without parenthesis
result = multiply 5, 2
println result

println divide(10, 2)
result = divide 10
println result

// 3. different types of passing map / named parameter
display([name: 'iPhone', price: 50000])
display(name: 'iPhone', price: 50000)
display name: 'iPhone', price: 50000

// 4. calling varargs method
println display(1, 2, 3, 4, 5)