package org.bpj.baseInformation.controller;

import org.bpj.baseInformation.service.impl.ManagerUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taraneh on 4/26/2019.
 */

@RestController
@RequestMapping("/api")
public class ManagerUserController {

    @Autowired
    private ManagerUserInfo managerUserInfo;

    @GetMapping(value = "/msg")
    public ResponseEntity<?> getmsg(){
        return ResponseEntity.status(HttpStatus.OK).body(managerUserInfo.msgUsers());
    }
}
