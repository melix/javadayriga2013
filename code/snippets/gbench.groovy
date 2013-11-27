@Grab(group='org.gperfutils', module='gbench', version='0.4.2-groovy-2.1')
import gbench.*

int fib(int n) {
    n<2?1:fib(n-2)+fib(n-1)
}

@groovy.transform.CompileStatic
int fib2(int n) {
    n<2?1:fib2(n-2)+fib2(n-1)
}

benchmark {
    'Fib dynamic' { fib(40) }
    'Fib static' { fib2(40) }
}.prettyPrint()
