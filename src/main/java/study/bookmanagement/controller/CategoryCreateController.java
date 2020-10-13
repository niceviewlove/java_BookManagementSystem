package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Category;
import study.bookmanagement.service.CategoryService;
import study.bookmanagement.util.NumberUtils;

public class CategoryCreateController implements Controller {
	private CategoryService categoryService = new CategoryService();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int categoryNumber = NumberUtils.parseInt(httpRequest.getAttribute("category_number"));
		String categoryName = httpRequest.getAttribute("category_name");
		
		Category category = new Category(categoryNumber, categoryName);
		categoryService.registerCategory(category);
		
		return new HttpResponse<>("200", category.getId());
	}

}
