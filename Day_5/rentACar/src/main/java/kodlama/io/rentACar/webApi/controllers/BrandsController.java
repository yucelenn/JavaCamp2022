package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController    //anostasyon-bilgilendirme
@RequestMapping("/api/brands")   //adresleme www.kodlama.io/api/brands
public class BrandsController {
	
	private BrandService brandService;

	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall") // www.kodlama.io/api/brands/getAll
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();		
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
}
