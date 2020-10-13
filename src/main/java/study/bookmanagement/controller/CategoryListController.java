package study.bookmanagement.controller;

import java.util.List;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Category;
import study.bookmanagement.service.CategoryService;

public class CategoryListController implements Controller {
	private CategoryService categoryService = new CategoryService();
	
	@Override
	public HttpResponse<List<Category>> command(HttpRequest httpRequest) {
		List<Category> categoryList = categoryService.getCategoryList();
		
		return new HttpResponse<>("200", categoryList);
	}
	
}
