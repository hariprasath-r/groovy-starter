package in.hp.groovy

println('Groovy is Good and Dynamic')

def a = 10
def b = 20.50F
def c = 'Hari'
def d = "My name is ${c}"
def e = /[\w-\.]+@([\w-]+\.)+[\w-]{2,4}/
def f = '''This is a multiline string
And this feature is good
It is also introduced from Java 12+'''

println("Type of ${a} is ${a.getClass()}")
println("Type of ${b} is ${b.getClass()}")
println("Type of ${c} is ${c.getClass()}")
println("Type of ${d} is ${d.getClass()}")
println("Type of ${f} is \n ${f.getClass()}")

// e is a string containing regex, it can be used to match patterns
email = "abc@def.com"
println("Is ${email} a valid email? ${email ==~ e}")