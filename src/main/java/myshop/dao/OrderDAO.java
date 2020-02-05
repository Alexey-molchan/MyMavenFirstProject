package myshop.dao;

import java.util.List;

import myshop.model.CartInfo;
import myshop.model.OrderDetailInfo;
import myshop.model.OrderInfo;
import myshop.model.PaginationResult;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
