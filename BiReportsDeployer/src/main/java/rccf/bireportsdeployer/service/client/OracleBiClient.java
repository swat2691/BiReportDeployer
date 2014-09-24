package rccf.bireportsdeployer.service.client;

import oraclebi.wsdl.Login;
import oraclebi.wsdl.LoginResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class OracleBiClient extends WebServiceGatewaySupport
{
    public LoginResponse login(String userId, String password)
    {
        Login request = new Login();
        request.setUserID(userId);
        request.setPassword(password);

        LoginResponse response = (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback("http://srvh05p04.rccf.ru:7001/xmlpserver/services/PublicReportService/Login"));

        return response;
    }
}
