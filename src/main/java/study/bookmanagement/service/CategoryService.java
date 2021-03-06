package study.bookmanagement.service;

import java.util.List;

import study.bookmanagement.repository.CategoryRepository;

public class CategoryService {
	private static CategoryService categoryService = new CategoryService();
	private CategoryRepository categoryRepository = CategoryRepository.getInstance();
	
	private CategoryService() {
	}
	
	public static CategoryService getInstance() {
		return categoryService;
	}
	
	public void registerCategory(Category category) {
		categoryRepository.create(category);
	}
	
	public void updateCategory(Category category) {
		categoryRepository.update(category);
	}
	
	public void removeCategory(Integer categoryId) {
		Category category = categoryRepository.findOneById(categoryId);
		
		if (category == null) {
			throw new RuntimeException("존재하지 않는 카테고리");
		}
		
		categoryRepository.deleteById(categoryId);
	}
	
	public List<Category> getCategoryList() {
		List<Category> categoryList = categoryRepository.findAllCategories();
		return categoryList;
	}

	public Category findOneCategory(int categoryId) {
		Category category = categoryRepository.findOneById(categoryId);
		return category;
	}
}
