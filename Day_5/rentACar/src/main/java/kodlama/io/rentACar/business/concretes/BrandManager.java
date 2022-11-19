package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService{//BrandServiceImpl
	private BrandRepository brandRepository;
	
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {     //iş kuralları
		
		List<Brand> brands = brandRepository.findAll(); //marka listesini aldık
		//marka listesini aktaracağımız bir liste brandsResponse (aktar dönder)
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		
		//mapping 
		for (Brand brand : brands) { //veritabanındaki listeyi kendi listemize aktarıp işlem yaparız
			//geçici item oluşturup id ve name aktarması yaptık döngü yardımıyla
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			//döngü yardımıyla geçici itemdaki bilgileri yeni listeye ekledik.
			brandsResponse.add(responseItem);
		}
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);
		
	} 

	
}
