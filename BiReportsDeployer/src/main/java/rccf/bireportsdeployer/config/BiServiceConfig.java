package rccf.bireportsdeployer.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import rccf.bireportsdeployer.service.client.OracleBiClient;

@Configuration
public class BiServiceConfig
{
    public static final String SERVICE_URI = "http://srvh05p04.rccf.ru:7001/xmlpserver/services/PublicReportService";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("oraclebi.wsdl");
        return marshaller;
    }

    @Bean
    public OracleBiClient oracleBiClient(Jaxb2Marshaller marshaller) {
        OracleBiClient client = new OracleBiClient();
        client.setDefaultUri(SERVICE_URI);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
