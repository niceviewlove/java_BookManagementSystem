package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.CategoryService;
import study.bookmanagement.util.NumberUtils;

public class CategoryRemoveController implements Controller {
	private CategoryService categoryService = CategoryService.getInstance();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int id = NumberUtils.parseInt((String)httpRequest.getAttribute("category_id"));
		categoryService.removeCategory(id);
		
		return new HttpResponse<>("200", id);
	}

}
