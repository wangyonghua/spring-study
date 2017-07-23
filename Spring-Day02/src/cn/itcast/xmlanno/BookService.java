package cn.itcast.xmlanno;

import javax.annotation.Resource;

public class BookService {
	@Resource(name = "orderDao")
	private OrderDao orderDao;

	@Resource(name = "bookDao")
	private BookDao bookDao;

	public void add() {
		System.out.println("service");
		orderDao.buy();
		bookDao.book();
	}
}
