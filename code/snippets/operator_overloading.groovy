import groovy.transform.*

@Canonical
class Person {
   String name
   Couple plus(Person other) {
   	new Couple(this, other)
   }
}

@TupleConstructor
class Couple {
    Person a,b
    String toString() { "${a.name} and ${b.name}" }
}

def p1 = new Person('Jacques Dutron')
def p2 = new Person('Françoise Hardy')
println (p1+p2)
