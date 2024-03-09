package org.bpj.baseInformation.service.impl;

import org.bpj.baseInformation.client.UaaClient;
import org.springframework.stereotype.Service;

/**
 * Created by taraneh on 4/26/2019.
 */

@Service
public class ManagerUserInfo {

    /*@Autowired
    private UaaClient uaaClient;*/

    private  final UaaClient uaaClient;


    public ManagerUserInfo(UaaClient uaaClient) {
        this.uaaClient = uaaClient;
    }

    public String msgUsers(){
      return String.valueOf(uaaClient.getmsg());
    }


}
