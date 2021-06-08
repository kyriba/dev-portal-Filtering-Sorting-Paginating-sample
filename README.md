#FilteringSortingPaginationAPI



## Requirements

Building the API client library requires:
1. Java 1.8 or higher
2. Gradle

## Installation

To copy the API client to your computer copy link of the repository, open Command Prompt, go to the location where project will be copied and execute git clone command:

```shell
git clone https://github.com/OlhaLevko/FilteringSortingPaginationAPI.git
```

Open the project folder via command prompt, for example:
```shell
cd FilteringSortingPaginationAPI
```

> ⚠️  _Before building project go to .../src/main/resources/application.yml and set up your credentials._

[comment]: <> (* BASE_URL)

[comment]: <> (* TOKEN_URL)

[comment]: <> (* CLIENT_ID)

[comment]: <> (* CLIENT_SECRET)


Build project:
```shell
gradle build
```

And execute jar file: 

```shell
java -jar "build/libs/filtering-sorting-pagination-1.0.0.jar"
```
> ⚠️  _Please notice that the path to your local directory is provided in MacOS/Unix format. Windows is slash-sensitive, so if you are using a Windows system, replace "/" with "\\"._

[comment]: <> (###Another way)

[comment]: <> (Install gradle wrapper:)

[comment]: <> (```shell)

[comment]: <> (gradlew wrapper --gradle-version 6.3)

[comment]: <> (```)

[comment]: <> (Compile the project without executing any tests:)

[comment]: <> (```shell)

[comment]: <> (gradlew assemble)

[comment]: <> (```)

[comment]: <> (Run application:)

[comment]: <> (```shell)

[comment]: <> (gradlew clean bootRun)

[comment]: <> (```)

If everything has been made properly you can reach the page localhost:8080/list.

By default, there is used port 8080, and it can be change in file ..\..\src\main\resources\application.yml

To terminate application press Ctrl + C and execute Y if this appeared:

```shell
Terminate batch job (Y/N)?
```