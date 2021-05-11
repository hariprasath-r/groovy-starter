package in.hp.groovy.collections

/**
 * Creating Sets are very similar to Lists in groovy
 * By default groovy creates the set as LinkedHashSet
 * to create a specific type of set, mention the type
 */
set = [4, 5, 5, 5, 6, 1, 2, 3, 6, 7, 2] as Set
println set
println set.class

TreeSet treeSet = set
println treeSet
println treeSet.class

hashSet = ['abc', 'ghi', 'def', 'xyz', 'ghi'] as HashSet
println hashSet
println hashSet.class