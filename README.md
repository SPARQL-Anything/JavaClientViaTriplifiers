# JavaClientExample
This project shows how to use SPARQL Anything as a Java library.

You can compile the project by using Maven.

```commandline
mvn install
```

Then, you can run the examples.

The following command runs the class showing how to use SPARQL Anything via the SPARQL client.

```
mvn exec:java -Dexec.mainClass="sparqlanything.user.SPARQLAnythingClientViaSPARQL" 
```

The following command runs the class showing how to use SPARQL Anything Triplifier.

```
mvn exec:java -Dexec.mainClass="sparqlanything.user.SPARQLAnythingClientViaTriplifier" 
```

## Licence

This project is distributed under  [Apache 2.0 License](LICENSE).
