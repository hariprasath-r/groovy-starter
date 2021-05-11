package in.hp.groovy

class Student {
    def id, name, age, isMinor
    static school = 'SASTRA'

    // overriding default setter method
    def setAge(age) {
        this.isMinor = age < 18
        this.age = age
    }

    // overriding toString
    String toString() {
        "id: ${id}, name: ${name}, age: ${age}, ${isMinor ? 'MINOR' : 'NOT MINOR'}"
    }

    def displaySchool() {
        println school
    }
}

// normal Java way of creating object and accessing fields
student1 = new Student()

// groovy generates constructor with arguments also
student2 = new Student(id: 2, name: 'Prasath')

// notice that by default Groovy creates getter and setter methods
student1.setId(1)
student1.setName('Hari')
student1.setAge(25)

println student1
println student1.name
println Student.school

println student2
