package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologiesRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.entities.Technology;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;
	
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll() {
		return this.technologyService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateTechnologiesRequest technologiesRequest) throws Exception {
		this.technologyService.add(technologiesRequest);
	}

	@PutMapping("/update")
	public void update(CreateTechnologiesRequest technologiesRequest) throws Exception {
		this.technologyService.update(technologiesRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		this.technologyService.delete(id);
	}

	@GetMapping("/{id}")
	public Technology getById(@PathVariable int id) throws Exception {
		return this.technologyService.getById(id);
	}
	
}
