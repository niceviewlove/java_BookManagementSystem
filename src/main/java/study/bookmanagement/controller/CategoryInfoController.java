package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Category;
import study.bookmanagement.service.CategoryService;

public class CategoryInfoController implements Controller {
	private CategoryService categoryService = CategoryService.getInstance();
	
	@Override
	public HttpResponse<Category> command(HttpRequest httpRequest) {
		int id = Integer.parseInt((String)httpRequest.getParameter("category_id"));
		Category category = categoryService.findOneCategory(id);
		
		return new HttpResponse<>("200", category);
	}
	
}
