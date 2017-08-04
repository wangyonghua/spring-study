package com.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itcast.dao.OrderDao;

@Transactional
@Service(value = "orderService")
public class OrderService {
	@Autowired
	private OrderDao orderDao;

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void accountMoney() {
		orderDao.lessMoney(1, 20);
		orderDao.moreMoney(2, 20);
	}
}
