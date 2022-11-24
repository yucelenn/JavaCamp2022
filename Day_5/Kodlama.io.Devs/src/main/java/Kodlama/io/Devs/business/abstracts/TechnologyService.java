package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateTechnologiesRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.entities.Technology;

public interface TechnologyService {
	
	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologiesRequest technologiesRequest) throws Exception;

	void update(CreateTechnologiesRequest technologiesRequest) throws Exception;

	void delete(int id) throws Exception;

	Technology getById(int id) throws Exception;

}
