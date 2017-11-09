package com.demo.camera

import spock.lang.Specification

class PhotoCameraSpec extends Specification {


    def "Should power up the sensor when camera is switched on"() {

    }

    def "Check if camera is turn on"() {
        given:
        PhotoCamera photoCamera = Mock(PhotoCamera)
        ImageSensor is = Mock(ImageSensor)

        when:
        photoCamera.turnOn()

        then:
        1 * is.turnOn()
    }

}
