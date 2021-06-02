# swagger-java-client


## Requirements

Building the API client library requires:
1. Java 11
2. Gradle

## Installation

To copy the API client to your computer copy link of the repository, open Command Prompt, go to the location where project will be copied and execute git clone command:

```shell
git clone https://github.com/OlhaLevko/AccountsAPI.git
```

Open the project folder via command prompt.

Set following environment variables:
* BASE_URL
* TOKEN_URL
* CLIENT_ID
* CLIENT_SECRET

Example:

```shell
set BASE_URL=*******
```

or they can be set up in the file ..\..\src\main\resources\application.

###One way 

Build project:
```shell
gradle build
```

And execute jar file: 

```shell
java -jar "localPath\build\libs\swagger-java-client-1.0.0.jar"
```

Instead of "localPath" input your local directory to the project together with project name.

###Another way

Install gradle wrapper:

```shell
gradlew wrapper --gradle-version 6.3
```
Compile the project without executing any tests:
```shell
gradlew assemble
```

Run application:
```shell
gradlew clean bootRun
```

If everything has been made properly you can reach the page localhost:8080/accounts.

By default, there is used port 8080, and it can be change in file ..\..\src\main\resources\application.yml

To terminate application press Ctrl + C and execute Y if this appeared:

```shell
Terminate batch job (Y/N)?
```