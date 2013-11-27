class Foo {
}
class Bar extends Foo {
}

void foo(Foo foo) { println 'FOO' }
void foo(Bar bar) { println 'BAR' }

Foo f = new Foo()
Bar b = new Bar()

foo(f)
foo(b)

