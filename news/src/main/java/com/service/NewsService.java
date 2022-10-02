package com.service;

import com.domain.News;
import com.mapper.NewsMapper;
import org.springframework.stereotype.Service;

@Service
public class NewsService
{
	private NewsMapper newsMapper;

	public News selectNews(int id)
	{
		return newsMapper.selectNews(id);
	}
}
