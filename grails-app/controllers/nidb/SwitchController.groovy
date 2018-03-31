package nidb

import grails.rest.RestfulController
import groovy.transform.CompileStatic

@CompileStatic
class SwitchController extends RestfulController{

    static responseFormats = ['json']

    SwitchController() {
        super(Switch)
    }


}