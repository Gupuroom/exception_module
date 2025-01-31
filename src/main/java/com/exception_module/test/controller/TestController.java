package com.exception_module.test.controller;

import com.exception_module.exception.CommonException;
import com.exception_module.test.type.TestErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/error")
    public ResponseEntity<?> getError() {
        log.error("Simulating an error in GET request");
        throw new CommonException(TestErrorCode.GET_TEST_ERROR);
    }

    @PostMapping("/error")
    public ResponseEntity<?> postError() {
        log.error("Simulating an error in POST request");
        throw new CommonException(TestErrorCode.POST_TEST_ERROR);
    }
}
