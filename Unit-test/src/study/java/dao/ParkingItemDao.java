package study.java.dao;

import java.util.List;
import study.java.model.ParkingItem;

public interface ParkingItemDao {

	public List<ParkingItem> getParkingList(String keyword);
}
