phidgets-finger-strength-test
=============================

A simple finger strength test, similar to the carnival strength test (high striker) built using phidgets.



Setup
-----

Install Phidgets on your OS. For help installing Phidgets on a Raspberry Pi, check out this blog post: 
http://www.philipwhitt.com/blog/2014/02/how-to-install-phidgets-on-a-raspberry-pi/30

Install gradle http://www.gradle.org/installation

Phidgets Required:
- Interface Kit: http://www.phidgets.com/products.php?category=0&product_id=1018_2
- LEDs: http://www.phidgets.com/products.php?category=26&product_id=3600_0
- Force Sensor: http://www.phidgets.com/products.php?category=33&product_id=1106_0

Optional:
- Tiny breadboard: http://www.adafruit.com/products/64

Phidgets Configuration
----------------------

Add LEDs into output 0-5. A bread board may be necessary to ground multiple I/O with phidgets. Plug the force sensor into sensor input 0.

Run the Program
---------------
	$ gradle run

or

	$ gradle jar
	$ java -jar build/libs/phidgets-finger-strength-test.jar

