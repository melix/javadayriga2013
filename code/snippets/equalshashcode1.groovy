import groovy.transform.*

@EqualsAndHashCode
class Person {
   String name
   int age   
}
def p = new Person(name: 'Santa', age: 215)
def p2 = new Person(name: 'Santa', age: 215)
assert p == p2


