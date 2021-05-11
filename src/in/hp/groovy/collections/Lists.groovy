package in.hp.groovy.collections

/**
 * we can create List using the [] notations
 * by default groovy creates them as ArrayList
 */
list = [1, 2, 3]
println(list)
println(list.getClass()) // -> ArrayList

// we can specify specific type with which we want the list to be
LinkedList linkedList = list
println(linkedList.getClass())

// all the Java collection methods are also available
linkedList.add(4)

//println(linkedList)

// in addition there are powerful operator overloading available in groovy, Check 'DefaultGroovyMethods' class
// the below adds an element to the list
list << 4

// adds a series of elements to the list and assigns back to list
list += [5, 6, 7]

// removes mentioned elements if present from the list
list -= [6, 7, 8]

// we can use groovy methods with closures
list.each { print it }
println()

linkedList.eachWithIndex { def entry, int i -> println("Index ${i}, value ${entry}") }
linkedList.eachPermutation { println it }
