package com.develhope.proveSpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/reverse")
    public String reverseName(@RequestParam String name) {
        return Name.reverseName(name);
    }

    @PostMapping("/reversePost")
    public String createReverseName(@RequestParam String name) {
        return Name.reverseName(name);
    }
}
