package com.controller;

import com.domain.News;
import com.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController
{
	@Autowired
	private NewsService newsService;

	@RequestMapping("/test")
	public String test()
	{
		return "baby i love u";
	}

	@RequestMapping("/news/{id}")
	public News selectNews(@PathVariable("id") int id)
	{
		return newsService.selectNews(id);
	}

}
