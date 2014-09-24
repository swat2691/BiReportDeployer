package rccf.bireportsdeployer;

import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import rccf.bireportsdeployer.service.DeployService;

public class DeployServiceTest extends TestCase
{
    @Autowired
    DeployService service;

    public void testLoginToOracleBi()
    {
        String login = "";
        String password = "";
        Assert.isTrue(service.loginToOracleBi(login, password));
    }
}
