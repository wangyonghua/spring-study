package com.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import com.itcast.dao.OrderDao;

@Transactional
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
