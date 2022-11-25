package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguagesRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	
	public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @RequestMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){
        return this.languageService.getAll();
    }

    @PostMapping("/add")
	public void add(CreateLanguagesRequest languageRequest) throws Exception {
		this.languageService.add(languageRequest);
	}

	@PutMapping("/update")
	public void update(CreateLanguagesRequest languageRequest) throws Exception {
		this.languageService.update(languageRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		this.languageService.delete(id);
	}

	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) throws Exception {
		return this.languageService.getById(id);
	}
	
}
