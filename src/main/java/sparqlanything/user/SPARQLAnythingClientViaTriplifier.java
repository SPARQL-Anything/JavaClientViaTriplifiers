package sparqlanything.user;

import io.github.sparqlanything.json.JSONTriplifier;
import io.github.sparqlanything.model.*;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.sparql.core.DatasetGraph;

import java.io.IOException;
import java.util.Properties;

public class SPARQLAnythingClientViaTriplifier {

    public static void main(String[] args) throws TriplifierHTTPException, IOException {

        // Instantiate the triplifier
        JSONTriplifier jsonTriplifier = new JSONTriplifier();

        // Set the triplifier options
        Properties options = new Properties();

        // Set the location of the resource
        options.setProperty(IRIArgument.LOCATION.toString(), "https://sparql-anything.cc/examples/simpleArray.json");

        // Create the builder
        FacadeXGraphBuilder builder = new BaseFacadeXGraphBuilder(options);

        // Build the Facade-X DatasetGraph
        jsonTriplifier.triplify(options, builder);

        // Retrieve the Facade-X DatasetGraph
        DatasetGraph datasetGraph = builder.getDatasetGraph();

        // Use the Facade-X DatasetGraph via the Jena APIs
        RDFDataMgr.write(System.out, datasetGraph, Lang.NQ);


    }
}
