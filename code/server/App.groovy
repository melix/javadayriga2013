@Grab('org.codehaus.groovy:groovy-json:2.1.8')
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

@RestController 
class App { 
    @RequestMapping("/") 
    String welcome(String city, String country) {
        def raw = new URL("http://api.openweathermap.org/data/2.5/weather?q=$city,$country&lang=en&units=metric").text
        def json = new JsonSlurper().parseText(raw)
	    """<html><body>Hello from $city! The weather there is ${json.weather.description[0]}, ${json.main.temp}°C<br>
Raw json: <pre>${JsonOutput.prettyPrint(raw)}</pre></body></html>"""
    } 
}

