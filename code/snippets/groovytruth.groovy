
@groovy.transform.ToString(includeNames=true)
class Optional<T> {
   final T value
   final boolean absent
   private Optional() { absent = true }
   private Optional(T val) { value = val }
   static T absent() { new Optional() }
   static T present(T val) { new Optional(val) }
   public boolean asBoolean() { !absent }
}

def p = Optional.present('foo')
println "P = $p ; Has value = ${p as boolean}"
p = Optional.absent()
println "P = $p ; Has value = ${p as boolean}"
p = Optional.present(null)
println "P = $p ; Has value = ${p as boolean}"


