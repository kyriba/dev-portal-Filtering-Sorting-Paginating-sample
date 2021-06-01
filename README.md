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

To deploy it to a localhost go into the project folder and execute:

```shell
gradle build
```
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

And execute jar file: 

```shell
java -jar "localPath/build/libs/swagger-java-client-1.0.0.jar"
```

Instead of "localPath" input your local directory to the project together with project name.


If everything has been made properly you can reach the page localhost:8080/accounts.

By default, there is used port 8080, and it can be change in file ..\..\src\main\resources\application.