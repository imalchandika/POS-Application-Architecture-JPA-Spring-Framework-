package lk.ijse.dep.app.dao.custom.impl;

import lk.ijse.dep.app.dao.CrudDAOImpl;
import lk.ijse.dep.app.dao.custom.OrderDAO;
import lk.ijse.dep.app.entity.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderDAOImpl extends CrudDAOImpl<Order,String> implements OrderDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Long count() throws Exception {
        Long count= (Long) em.createQuery("SELECT COUNT(o) FROM Order o").getSingleResult();
        System.out.println(count);
        return count;
    }
}
