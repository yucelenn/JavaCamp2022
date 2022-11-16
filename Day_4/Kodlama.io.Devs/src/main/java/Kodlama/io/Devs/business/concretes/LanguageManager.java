package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void create(Language language) throws Exception {
		if (language.getName().isEmpty()){
            throw new Exception("Dil ismi boş bırakılamaz");
        }
        for(Language language1: getAll()){
            if(language1.getId() == language.getId()){
                throw new Exception("Dil isimleri tekrar edemez");
            }
        }
        languageRepository.create(language);
	}

	@Override
	public void update(Language language, int id) throws Exception {
		if(languageRepository.getById(id) == null){
            throw new Exception("Dil sistemde kayıtlı değil.");
        }
        languageRepository.update(language, id);		
	}

	@Override
	public void delete(int id) throws Exception {
		languageRepository.delete(id);
	}

	@Override
	public Language getById(int id) throws Exception {
		return languageRepository.getById(id);
	}

}
