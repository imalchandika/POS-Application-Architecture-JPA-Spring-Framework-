package lk.ijse.dep.app.business.custom.impl;

import lk.ijse.dep.app.business.custom.ManageOrdersBO;
import lk.ijse.dep.app.dto.OrderDTO;
import lk.ijse.dep.app.dto.OrderDTO2;

import java.util.List;

public class ManageOrdersBOImpl implements ManageOrdersBO {
    @Override
    public List<OrderDTO2> getOrdersWithCustomerNamesAndTotals() throws Exception {
        return null;
    }

    @Override
    public List<OrderDTO> getOrders() throws Exception {
        return null;
    }

    @Override
    public String generateOrderId() throws Exception {
        return null;
    }

    @Override
    public void createOrder(OrderDTO dto) throws Exception {

    }

    @Override
    public OrderDTO findOrder(String orderId) throws Exception {
        return null;
    }

}
