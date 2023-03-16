package com.feirasoft.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MainController {

    @GetMapping("/prime")
    public static ResponseEntity<?> getPrimes(@RequestParam("n") Integer n) {
        List<Integer> primes = new ArrayList<>();
        LinkedHashMap<String, Object> res = new LinkedHashMap<>();
        try{
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes.add(i);
                }
            }

            res.put("status", true);
            res.put("data", primes);
            return ResponseEntity.ok(res);
        } catch (Exception e) {
            res.put("status", false);
            res.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(res);
        }

    }

    @PostMapping("/sort")
    public static ResponseEntity<?> getSorted(@RequestBody List<Integer> list) {
        LinkedHashMap<String, Object> res = new LinkedHashMap<>();
        try {
            Collections.sort(list);

            res.put("status", true);
            res.put("data", list);
            return ResponseEntity.ok(res);
        } catch (Exception e) {
            res.put("status", false);
            res.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(res);
        }

    }
}