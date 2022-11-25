package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguagesRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	List<Language> languages;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository,List<Language> languages) {
		super();
		this.languageRepository = languageRepository;
		this.languages = languages;
	}
	
	public void isLanguageExist(String name) throws Exception {
		for (Language language : languageRepository.findAll()) {
			if (language.getName().equals(name)) {
				throw new Exception("Yazılım dili mevcut.");
			}
		}
	}

	public void isLanguageExist(int id) throws Exception {
		for (Language language : languageRepository.findAll()) {
			if (language.getId() == id)
				break;
			else {
				throw new Exception("Yazılım dili mevcut değil.");
			}
		}

	}

	public void isLanguageNameEmpty(String name) throws Exception {
		if (name.isEmpty()) {
			throw new Exception("Yazılım dili ismi boş bırakılamaz.");
		}
	}
	
	public Language getById(int id) throws Exception {
		try {
			isLanguageExist(id);
			return languageRepository.getReferenceById(id);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> brandsResponse = new ArrayList<GetAllLanguagesResponse>();
		for (Language language : languages) {
			GetAllLanguagesResponse allLanguagesResponse = new GetAllLanguagesResponse();
			allLanguagesResponse.setId(language.getId());
			allLanguagesResponse.setName(language.getName());
			brandsResponse.add(allLanguagesResponse);
		}
		return brandsResponse;
	}

	@Override
	public void add(CreateLanguagesRequest languageRequest) throws Exception {
		try {
			Language language = new Language();
			isLanguageExist(languageRequest.getName());
			isLanguageNameEmpty(languageRequest.getName());
			language.setName(languageRequest.getName());
			this.languageRepository.save(language);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void update(CreateLanguagesRequest languageRequest) throws Exception {
		try {
			isLanguageExist(languageRequest.getId());
			Language language = languageRepository.getReferenceById(languageRequest.getId());
			language.setName(languageRequest.getName());
			this.languageRepository.save(language);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(int id) throws Exception {
		isLanguageExist(id);
		languageRepository.delete(languageRepository.getReferenceById(id));
	}

	

}
