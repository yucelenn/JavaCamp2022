package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologiesRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	TechnologyRepository technologyRepository;
	LanguageRepository languageRepository;
	List<Technology> technologies;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, 
			LanguageRepository languageRepository, List<Technology> technologies) {
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
		this.technologies = technologies;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> allTechnologiesResponses = new ArrayList<GetAllTechnologiesResponse>();
		
		for (Technology technology : technologies) {
			GetAllTechnologiesResponse technologiesResponse = new GetAllTechnologiesResponse();
			technologiesResponse.setId(technology.getId());
			technologiesResponse.setName(technology.getName());
			allTechnologiesResponses.add(technologiesResponse);
		}
		return allTechnologiesResponses;
	}

	public void isTechnologyExist(String name) throws Exception {
		for (Technology technology : technologyRepository.findAll()) {
			if (technology.getName().equals(name)) {
				throw new Exception("alt teknoloji mevcut.");
			}
		}
	}

	public void isTechnologyExist(int id) throws Exception {
		for (Technology technology : technologyRepository.findAll()) {
			if (technology.getId() == id)
				break;
			else {
				throw new Exception("alt teknoloji mevcut değil.");
			}
		}

	}

	public void isTechnologyNameEmpty(String name) throws Exception {
		if (name.isEmpty()) {
			throw new Exception("alt teknoloji ismi boş bırakılamaz.");
		}
	}
	
	@Override
	public Technology getById(int id) throws Exception {
		try {
			isTechnologyExist(id);
			return technologyRepository.getReferenceById(id);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public void add(CreateTechnologiesRequest technologiesRequest) throws Exception {
		try {
			Technology technology = new Technology();
			isTechnologyExist(technologiesRequest.getName());
			isTechnologyNameEmpty(technologiesRequest.getName());
			technology.setName(technologiesRequest.getName());
			technology.setLanguage(languageRepository.getReferenceById(technologiesRequest.getLanguageId()));
			this.technologyRepository.save(technology);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void update(CreateTechnologiesRequest technologiesRequest) throws Exception {
		try {
			isTechnologyExist(technologiesRequest.getId());
			Technology technology = technologyRepository.getReferenceById(technologiesRequest.getId());
			technology.setName(technologiesRequest.getName());
			this.technologyRepository.save(technology);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(int id) throws Exception {
		try {
			isTechnologyExist(id);
			technologyRepository.delete(technologyRepository.getReferenceById(id));
		} catch (Exception e) {
			throw e;
		}
	}

}