package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Category;
import study.bookmanagement.service.CategoryService;
import study.bookmanagement.util.NumberUtils;

public class CategoryUpdateController implements Controller {
	private CategoryService categoryService = new CategoryService();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int categoryId = NumberUtils.parseInt(httpRequest.getAttribute("categoryId"));
		String categoryName = httpRequest.getAttribute("category_name");
		
		Category category = new Category(categoryName);
		category.setId(categoryId);
		categoryService.updateCategory(category);
		
		return new HttpResponse<>("200", category.getId());
	}

}
