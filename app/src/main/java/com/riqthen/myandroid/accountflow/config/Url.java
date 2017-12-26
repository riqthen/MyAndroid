package com.riqthen.myandroid.accountflow.config;

/**
 * @author H
 * @date 2017/11/29 14:41
 * @description
 */
public class Url {
    /**
     * 查询流水
     * {"relateAccount":"15555555555","accountType":"USER","currentPage":1,"pageSize":10,"consumptionType":"","serverNumber":"dc100001"}
     */
    public static String URL_ACCOUNT_FLOW = "http://112.74.72.144/dcxt/account_getAccounts.do";
    /**
     * 订单详情
     * {"orderId":"155555555551511836530402","storeSrvNumber":"dc100000"}
     */
    public static String URL_ORDER_LOAD = "http://112.74.72.144/dcxt/order_load.do";

}
