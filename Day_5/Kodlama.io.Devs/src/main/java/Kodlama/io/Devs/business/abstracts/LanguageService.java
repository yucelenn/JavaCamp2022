package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateLanguagesRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.entities.Language;

public interface LanguageService {

	List<GetAllLanguagesResponse> getAll();

	void add(CreateLanguagesRequest languageRequest) throws Exception;

	void update(CreateLanguagesRequest languageRequest) throws Exception;

	void delete(int id) throws Exception;

	Language getById(int id) throws Exception;
    
}
