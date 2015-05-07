

CLASSPATH=.\
;slf4j-api-1.7.12.jar\
;logback-classic-1.1.3.jar\
;logback-core-1.1.3.jar

SKIPPED=\
;slf4j-log4j12-1.7.12.jar\
;log4j-1.2.17.jar

test:	Playground.class
	java Playground logback.xml

%.class: %.java
	javac $<
