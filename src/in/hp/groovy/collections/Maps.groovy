package in.hp.groovy.collections

/**
 * Map in Groovy is kinda similar to dictionary in python, atleast the declaration part
 * But it is mostly similar syntactically to JavaScript Maps & Objects
 */

map = [:] // empty map

// we can use the below methods to add values into map
map.put('courseName', 'Groovy')
map.rating = 5
map['price'] = '500INR'

println map

// similarly we can read values from the map
println map.get('courseName')
println map.rating
println map['price']
println map['invalidKey'] // will return null

TreeMap treeMap = [hari: 25, gopi: 23, balaji: 25]
treeMap.each { key, value -> println("Name: ${key}, Age: ${value}") }
