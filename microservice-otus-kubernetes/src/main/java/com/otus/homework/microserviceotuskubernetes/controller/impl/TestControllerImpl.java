package com.otus.homework.microserviceotuskubernetes.controller.impl;


import com.otus.homework.microserviceotuskubernetes.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestControllerImpl.
 *
 * @author Viktor_Shevliagin
 */


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/health")
public class TestControllerImpl {

  @GetMapping
  public ResponseEntity<ResponseDTO> healthCheck() {
    var responseDto = new ResponseDTO();
    responseDto.setStatus("OK");
    return ResponseEntity.ok(responseDto);
  }

}
