package in.hp.groovy

/**
 * Here n = 2 is the default value
 * THe closure can also be like below, inside curly brackets
 *{ n = 2 -> n % 2 == 0 ? 'even' : 'odd' }*/
checkEvenOdd = (n = 2) -> n % 2 == 0 ? 'even' : 'odd'

build = {
    s = '''This is an example of build string
trying to create a multi-line string and returning it from closure'''
}

result = checkEvenOdd.call(10)
println(result)
println(build.call())

/**
 * In the below code, times is a method from DefaultGroovyMethods class
 * It accepts a closure as input
 * 'it' is a keyword, which refers to the current element in scope, like 'this'
 */
10.times { print it }