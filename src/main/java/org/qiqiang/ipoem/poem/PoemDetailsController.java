package org.qiqiang.ipoem.poem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoemDetailsController {
    private final IPoemDetailsService poemDetailsService;

    public PoemDetailsController(IPoemDetailsService poemDetailsService) {
        this.poemDetailsService = poemDetailsService;
    }

    @GetMapping("/poemDetails/{id}")
    public PoemDetails getOne(@PathVariable String id) {
        return poemDetailsService.getOne(id);
    }
}
