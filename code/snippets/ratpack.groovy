@GrabResolver("https://oss.jfrog.org/artifactory/repo")
@Grab("org.ratpack-framework:ratpack-groovy:0.9.0-SNAPSHOT")
import static org.ratpackframework.groovy.RatpackScript.ratpack
import static org.ratpackframework.groovy.Template.groovyTemplate

ratpack {
    handlers {
        get {
            response.send "Hey, Groovy!"
        }
    }
}
