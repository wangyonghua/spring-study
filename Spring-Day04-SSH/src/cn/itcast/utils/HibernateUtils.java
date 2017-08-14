package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	static Session session = null;
	static SessionFactory factory = null;
	static Configuration cfg = null;

	static {
		cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	public static Session getSessionobject() {
		return factory.getCurrentSession();
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static void main(String[] args) {
		// HibernateUtils.getSessionFactory();
		System.out.println("okay");
	}
}
