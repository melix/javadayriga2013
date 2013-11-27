import org.codehaus.groovy.control.CompilerConfiguration

def config = new CompilerConfiguration()
def shell = new GroovyShell(config)
assert Math.PI == shell.evaluate('PI')