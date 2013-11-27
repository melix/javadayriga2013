import groovy.transform.*

@Immutable
class Person {
   String name
   int age   
}
def p = new Person(name: 'Santa', age: 215)
p.age = 666 // ReadOnlyPropertyException


