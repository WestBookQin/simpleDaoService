package utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class ServicePaginationHelper {
	public static final String PAGINATION = "pagination";
	public static final String PAGE_SIZE = "pageSize";
	public static final String PAGE_NUMBER = "pageNumber";

	public static Map<String, Object> build(Integer pageSize, Integer pageNumber) {
		Map<String, Object> _innerPagination = new LinkedHashMap<String, Object>();
		_innerPagination.put("pageSize", pageSize);
		_innerPagination.put("pageNumber", pageNumber);

		return _innerPagination;
	}
}
