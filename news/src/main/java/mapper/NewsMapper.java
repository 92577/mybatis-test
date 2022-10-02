package mapper;

import com.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NewsMapper
{
	@Select("select * from news where id = #{id}")
	News select(int id);
}
