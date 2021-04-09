package study.java.dao;

import java.util.List;
import study.java.model.WebSearchItem;

public interface WebSearchDao {

	public List<WebSearchItem> getWebSerchList(String keyword);
}
