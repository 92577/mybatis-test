package com.mapper;

import com.domain.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NewsMapper
{
	@Select("select * from news where id = #{id}")
	News select(@Param("id") int id);
}
