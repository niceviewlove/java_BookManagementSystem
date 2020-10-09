package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;

public interface Controller {
	HttpResponse command(HttpRequest httpRequest);
}
