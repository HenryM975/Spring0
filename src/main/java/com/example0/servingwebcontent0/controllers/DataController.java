package com.example0.servingwebcontent0.controllers;


import com.example0.servingwebcontent0.models.Post;
import com.example0.servingwebcontent0.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {
    @Autowired
    private PostRepo postRepo;

    @GetMapping("/data")
    public String dataMain(Model model){
        Iterable<Post> posts = postRepo.findAll();
        model.addAttribute("posts", posts);
        return "dataMain";
    }

    @GetMapping("/data/add")
    public String dataAdd(Model model){
        return "dataAdd";
    }

    @PostMapping("/data/add")
    public String dataPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String data, Model model){
        Post post = new Post(title, anons, data);
        postRepo.save(post);
        return "redirect:/data";
    }
}
