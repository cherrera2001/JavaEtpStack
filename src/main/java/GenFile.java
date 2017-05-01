import Energistics.Datatypes.*;
import Energistics.Protocol.Core.OpenSession;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Chris on 4/26/17.
 */
public class GenFile {

    public static void main(String[] args)
    {
        Version v = new Version(1,0,0,0);
        SupportedProtocol spCore = new SupportedProtocol(0, v, "producer", null);
        SupportedProtocol spStreaming = new SupportedProtocol(1, v, "producer", null);
        List<SupportedProtocol> sps = new ArrayList<>();
        sps.add(spCore);
        sps.add(spStreaming);

        List<String> supportedObjects = new ArrayList<>();
        supportedObjects.add("application/x-witsml+xml;version=2.0;type=Channel");

        OpenSession os = new OpenSession("Tempus", "0.0.1-SNAPSHOT", UUID.randomUUID().toString(), sps, supportedObjects);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(os));
    }
}
