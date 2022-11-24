package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	
	public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @RequestMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

}
