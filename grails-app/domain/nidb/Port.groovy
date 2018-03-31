package nidb

import org.grails.datastore.gorm.*

class Port implements GormEntity<Port> {

    String interfaceName
    String description
    static belongsTo = [switch: Switch]

}
