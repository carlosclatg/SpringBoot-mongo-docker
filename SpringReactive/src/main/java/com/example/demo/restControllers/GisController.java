package com.example.demo.restControllers;


import com.example.demo.mapping.GisDocument;
import com.example.demo.mapping.User;
import com.example.demo.repository.GisDocumentCrudRepository;
import com.example.demo.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;


@Controller
@RequestMapping(path = "/ohmygod")
public class GisController {

    @Autowired
    private GisDocumentCrudRepository repo;

    @Autowired
    private UserInterface ui;

    @GetMapping()
    public @ResponseBody
    Flux<GisDocument> getAllDocuments(){
        return repo.findAll();
    }

    @GetMapping("/1")
    public @ResponseBody Flux<GisDocument> getByCode(){
        String code = "SB00.1.300006-SB00.1.300045-1";
        return repo.findByCode(code);
    }

    @GetMapping("/2")
    public @ResponseBody Flux<User> getAllUser(){
        return ui.findAll();
    }
}
