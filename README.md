phidgets-finger-strength-test
=============================

A simple finger strength test, similar to the carnival strength test (high striker) built using phidgets.



Setup
-----

Install gradle http://www.gradle.org/installation

Phidgets Required:
- Interface Kit: http://www.phidgets.com/products.php?category=0&product_id=1018_2
- LEDs: http://www.phidgets.com/products.php?category=26&product_id=3600_0
- Force Sensor: http://www.phidgets.com/products.php?category=33&product_id=1106_0

Phidgets Configuration
----------------------

Add an LEDs into output 0-5. You can use a bread board to ground multiple LEDs. Plug the force sensor into sensor input 0.

Run the Program
---------------
	$ gradle run

or

	$ gradle jar
	$ java -jar build/libs/phidgets-finger-strength-test.jar

