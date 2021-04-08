package study.java.dao;

import java.util.List;

import study.java.model.ImageItem;

public interface ImageDao {
	public List<ImageItem> getImageSerchList(String keyword);
}
