package nidb

import grails.rest.RestfulController
import groovy.transform.CompileStatic

@CompileStatic
class PortController extends RestfulController {

        static responseFormats = ['json']

        PortController() {
            super(Port)
        }

    }
