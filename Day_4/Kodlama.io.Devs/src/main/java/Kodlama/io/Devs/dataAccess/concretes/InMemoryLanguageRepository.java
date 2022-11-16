package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"Python"));
        languages.add(new Language(4,"JavaScript"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void create(Language language) throws Exception {
		if (language.getName().isEmpty()){
            throw new Exception("Dil ismi boş bırakılamaz");
        }
        for(Language language1: getAll()){
            if(language1.getName() == language.getName()){
                throw new Exception("Dil isimleri tekrar edemez");
            }
        }
		languages.add(language);		
	}

	@Override
	public void update(Language language, int id) throws Exception {
		Language language1 = getById(language.getId());
        language1.setName(language.getName());
	}

	@Override
	public void delete(int id) throws Exception {
		Language language2 = getById(id);
        languages.remove(language2);
		
	}

	@Override
	public Language getById(int id) throws Exception {
		for(Language language : languages){
            if(language.getId() == id){
                return language;
            }
        }
        throw new Exception("kayıt bulunamadı");		
	}

}
