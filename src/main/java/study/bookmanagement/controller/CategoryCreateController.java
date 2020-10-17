package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Category;
import study.bookmanagement.service.CategoryService;
import study.bookmanagement.util.NumberUtils;

public class CategoryCreateController implements Controller {
	private CategoryService categoryService = CategoryService.getInstance();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		String categoryName = (String)httpRequest.getAttribute("categoryName");
		
		Category category = new Category(categoryName);
		categoryService.registerCategory(category);
		
		return new HttpResponse<>("200", category.getId());
	}

}
