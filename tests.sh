rm -rf ./chess/bin
javac -d ./chess/bin -cp .:junit-platform-console-standalone.jar ./chess/**/*.java
java -jar junit-platform-console-standalone.jar --class-path ./chess/bin --scan-class-path --fail-if-no-tests