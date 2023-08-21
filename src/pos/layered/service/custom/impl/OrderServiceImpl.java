/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import pos.layered.dao.DaoFactory;
import pos.layered.dao.OrderDao;
import pos.layered.dao.OrderDetailDao;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.OrderDto;
import pos.layered.service.OrderService;
import pos.layered.service.ServiceFactory;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import pos.layered.db.DBConnection;
import pos.layered.dto.OrderDetailDto;
import pos.layered.entity.ItemEntity;
import pos.layered.entity.OrderDetailEntity;
import pos.layered.entity.OrderEntity;

/**
 *
 * @author Dell
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orederDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER_DETAIL);
    private ItemDao item = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            if (orederDao.add(new OrderEntity(dto.getOrderId(), sdf.format(new Date()), dto.getCustomerId()))) {
                boolean isOrderSaved = true;
                for (OrderDetailDto orderDetailDto : dto.getOrderDetailDtos()) {

                    if (!orderDetailDao.add(new OrderDetailEntity(dto.getOrderId(),
                            orderDetailDto.getItemId(),
                            orderDetailDto.getQty(),
                            orderDetailDto.getDiscount()))) {
                        isOrderSaved = false;
                    }
                }
                if (isOrderSaved) {
                    boolean isItemUpdated = true;
                    for (OrderDetailDto orderDetailDto : dto.getOrderDetailDtos()) {
                        ItemEntity entity = item.get(orderDetailDto.getItemId());
                        entity.setQoh(entity.getQoh() - orderDetailDto.getQty());
                        if (!item.update(entity)) {
                            isItemUpdated = false;
                        }
                    }
                    if (isItemUpdated) {
                        connection.commit();
                        return "Item Successfully updated";
                    } else {
                        connection.rollback();
                        return "Item Update Error";
                    }
                } else {
                    connection.rollback();
                    return "Order Detail Saving Error";
                }

            } else {
                connection.rollback();
                return "Order Saving Error";
            }
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;
        } finally {

            connection.setAutoCommit(true);
        }
        
    }

}
