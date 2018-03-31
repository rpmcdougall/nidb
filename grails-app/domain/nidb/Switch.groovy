package nidb

//import grails.compiler.GrailsCompileStatic
import org.grails.datastore.gorm.*

//@GrailsCompileStatic
class Switch implements GormEntity<Switch>{

    String hostname
    static hasMany = [port: Port]

}