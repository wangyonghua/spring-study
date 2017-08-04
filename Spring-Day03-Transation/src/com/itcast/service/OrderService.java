package com.itcast.service;

import com.itcast.dao.OrderDao;

public class OrderService {
	private OrderDao orderDao;

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void accountMoney() {
		orderDao.lessMoney(1, 20);
		int i = 10 / 0;
		orderDao.moreMoney(2, 20);
	}
}
