package org.bpj.baseInformation.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by taraneh on 4/26/2019.
 */

@FeignClient(name = "UAA")
@Profile("!test")
public interface UaaClient {

    @GetMapping(value = "/api/user")
    ResponseEntity<?> getuser();

    @GetMapping(value = "/api/msg")
     ResponseEntity<?> getmsg();

}
