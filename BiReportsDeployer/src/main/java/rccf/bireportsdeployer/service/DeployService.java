package rccf.bireportsdeployer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import rccf.bireportsdeployer.service.client.OracleBiClient;

@Service
public class DeployService
{
    @Autowired
    OracleBiClient oracleBiClient;

    public boolean loginToOracleBi(String userId, String password)
    {
        String loginReturn = oracleBiClient.login(userId, password).getLoginReturn();
        return !StringUtils.isEmpty(loginReturn);
    }

}
