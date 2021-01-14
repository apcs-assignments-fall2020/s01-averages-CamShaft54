default: run

run:
	./gradlew run

clean:
	./gradlew clean

test:
	./gradlew clean test

testRollDie:
	./gradlew clean test --tests MyTests.testRollDie

tests: test