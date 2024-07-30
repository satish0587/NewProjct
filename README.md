# Simple Maven Web Application

This is a simple Maven-based web application that demonstrates the usage of servlets and JSP.

## Project Structure

```
simple-maven-webapp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── HelloWorldServlet.java
│   │   ├── resources
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── web.xml
│   │       └── index.jsp
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── HelloWorldServletTest.java
├── pom.xml
└── README.md
```

## Usage

To build the project and generate the WAR file, run the following command:

```
mvn clean package
```

The generated WAR file can be found in the `target` directory.

## Deployment

To deploy the web application, you can use a servlet container such as Apache Tomcat. Simply copy the generated WAR file to the `webapps` directory of your Tomcat installation.

## Testing

The project includes a test class `HelloWorldServletTest` that can be executed to test the functionality of the `HelloWorldServlet`. To run the tests, execute the following command:

```
mvn test
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

Please note that the `LICENSE` file mentioned in the `README.md` should be created separately with the appropriate license text.