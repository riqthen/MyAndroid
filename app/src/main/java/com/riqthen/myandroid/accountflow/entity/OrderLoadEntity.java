package com.riqthen.myandroid.accountflow.entity;

import java.util.List;

/**
 * @author H
 * @date 2017/11/29 17:24
 * @description
 */
public class OrderLoadEntity {
    /**
     * orderData : {"message":"加载订单成功","store":{"acctAmt":1909.29,"areaID":"440306","birthday":"","checkCode":null,"createTime":"2017-07-24 14:29:45","description":"某？！！？哦婆婆破","dianZanCount":47,"grade":0,"id":1602,"ipAdd":null,"isMain":1,"lastLoginTime":null,"licenseId":"450981198707206262","logoImage":"/upload/storeLogo/20170807/1371426761901.jpg","minute":2,"onlineSeconds":20171129110920,"password":"e10a7c3b4b9a5ba99e56e05df20f883e","payImage":null,"payType":1,"phoneimei":"4C1F681B-5808-4A71-B1FF-7A17EC9A6B98","relateName":"你你是在说","relatePhone":"84887","remainder":0,"salt":"","sendFoodTime":"08:05|23:01","sendRange":"600","sendfee":2,"servedFoodflow":1,"shopId":"2897","shopNo":"255","signType":3,"start_send_price":1,"status":3,"storeAddress":"广东省宝安区","storeId":13714267619,"storeLogo":null,"storeName":"京东快餐a","storeSrvNumber":"dc100000","storeType":1,"teaFee":0,"updateTime":"2017-11-29 10:25:31","version":9856,"weiXinNo":null},"order":{"addressId":562,"appFlowNum":"137142676191511836537654","bookPlatformId":"","bookTime":"2017-11-28 10:35:30:402","channelSource":null,"dinnerTime":"2017-11-28","hbAmt":0,"hongbaoId":null,"oldOrderId":null,"orderId":"155555555551511836530402","orderItems":[{"food":{"category":null,"chilliCount":1,"cid":"1","cookingType":2,"description":"","endDate":null,"foodAmount":258,"foodClass":"","foodId":"22b341652e754f5bb17d9801252205dd","foodImage":"upload/food_foodImage/20171125/7ec1efce94bc49209d23e298f6cdb274.jpg","foodName":"图来咯哦路","foodPrice":20.08,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":14},"foodNumber":1,"order":null,"orderItemId":"ed8be526418d4f67a6924bfbaa9c3467","smallCount":20.08,"status":0},{"food":{"category":null,"chilliCount":2,"cid":"2","cookingType":2,"description":"米开朗基罗","endDate":null,"foodAmount":258,"foodClass":"","foodId":"64b3ba78d2a043879bab0a3709301d3a","foodImage":"upload/food_foodImage/20171125/2c7365afc2bb424b8d5b765e1b1a8db2.jpg","foodName":"金窝银窝","foodPrice":225,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":9},"foodNumber":1,"order":null,"orderItemId":"168e392793c74339861d3b56d39d59da","smallCount":225,"status":0}],"orderType":"COMMON","out_trade_no":null,"payAccount":null,"payAmt":0,"payOffAmt":252.08,"payStatus":"2","payType":"1","sendType":null,"sendfee":7,"serialNumber":null,"simpleAdd":"贵州省::黔南布依族苗族自治州::惠水县::12345678i::哈喽144::15555555555","status":"5","storeId":13714267619,"storeSrvNumber":"dc100000","storeType":1,"sysAbbreviation":"dcxt","totalAccount":252.08,"tranSummary":null,"userId":15555555555,"usrSrvNumber":"","version":1},"booker":{"acctAmt":91420.95,"appType":null,"birthYearMonth":null,"birthday":"","chargeType":null,"checkCode":null,"createTime":"2017-07-22 10:18:00","description":null,"deviceId":"ffffffff-dd9e-9389-ffff-ffffad30cc97","education":null,"frozenAmt":544.25,"gender":"1","industry":null,"ipAdd":null,"lastLoginTime":"2017-11-28 15:49:51","licenseId":"350725197812114503","loginName":"","name":"哈喽144","openId":"dbe863857f186c7a5ade265ebd54d132","password":"e10a7c3b4b9a5ba99e56e05df20f883e","phoneType":"","phoneimei":"864601026520189","qq":"137258569","recommemdPhone":"","registFrom":null,"remainder":0,"salt":"AIFvk1eJMh+l6BkCoX3kL0F5Og==","serverNumber":"dc100000","simId":"ffffffff-dd9e-9389-ffff-ffff9c1c9630","status":1,"takein":0,"updateTime":null,"userId":15555555555,"version":138,"webServerUrl":null,"weiXinNo":"helloweixin14","workjob":null},"code":0}
     */

    private OrderDataBean orderData;

    public OrderDataBean getOrderData() {
        return orderData;
    }

    public void setOrderData(OrderDataBean orderData) {
        this.orderData = orderData;
    }

    public static class OrderDataBean {
        /**
         * message : 加载订单成功
         * store : {"acctAmt":1909.29,"areaID":"440306","birthday":"","checkCode":null,"createTime":"2017-07-24 14:29:45","description":"某？！！？哦婆婆破","dianZanCount":47,"grade":0,"id":1602,"ipAdd":null,"isMain":1,"lastLoginTime":null,"licenseId":"450981198707206262","logoImage":"/upload/storeLogo/20170807/1371426761901.jpg","minute":2,"onlineSeconds":20171129110920,"password":"e10a7c3b4b9a5ba99e56e05df20f883e","payImage":null,"payType":1,"phoneimei":"4C1F681B-5808-4A71-B1FF-7A17EC9A6B98","relateName":"你你是在说","relatePhone":"84887","remainder":0,"salt":"","sendFoodTime":"08:05|23:01","sendRange":"600","sendfee":2,"servedFoodflow":1,"shopId":"2897","shopNo":"255","signType":3,"start_send_price":1,"status":3,"storeAddress":"广东省宝安区","storeId":13714267619,"storeLogo":null,"storeName":"京东快餐a","storeSrvNumber":"dc100000","storeType":1,"teaFee":0,"updateTime":"2017-11-29 10:25:31","version":9856,"weiXinNo":null}
         * order : {"addressId":562,"appFlowNum":"137142676191511836537654","bookPlatformId":"","bookTime":"2017-11-28 10:35:30:402","channelSource":null,"dinnerTime":"2017-11-28","hbAmt":0,"hongbaoId":null,"oldOrderId":null,"orderId":"155555555551511836530402","orderItems":[{"food":{"category":null,"chilliCount":1,"cid":"1","cookingType":2,"description":"","endDate":null,"foodAmount":258,"foodClass":"","foodId":"22b341652e754f5bb17d9801252205dd","foodImage":"upload/food_foodImage/20171125/7ec1efce94bc49209d23e298f6cdb274.jpg","foodName":"图来咯哦路","foodPrice":20.08,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":14},"foodNumber":1,"order":null,"orderItemId":"ed8be526418d4f67a6924bfbaa9c3467","smallCount":20.08,"status":0},{"food":{"category":null,"chilliCount":2,"cid":"2","cookingType":2,"description":"米开朗基罗","endDate":null,"foodAmount":258,"foodClass":"","foodId":"64b3ba78d2a043879bab0a3709301d3a","foodImage":"upload/food_foodImage/20171125/2c7365afc2bb424b8d5b765e1b1a8db2.jpg","foodName":"金窝银窝","foodPrice":225,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":9},"foodNumber":1,"order":null,"orderItemId":"168e392793c74339861d3b56d39d59da","smallCount":225,"status":0}],"orderType":"COMMON","out_trade_no":null,"payAccount":null,"payAmt":0,"payOffAmt":252.08,"payStatus":"2","payType":"1","sendType":null,"sendfee":7,"serialNumber":null,"simpleAdd":"贵州省::黔南布依族苗族自治州::惠水县::12345678i::哈喽144::15555555555","status":"5","storeId":13714267619,"storeSrvNumber":"dc100000","storeType":1,"sysAbbreviation":"dcxt","totalAccount":252.08,"tranSummary":null,"userId":15555555555,"usrSrvNumber":"","version":1}
         * booker : {"acctAmt":91420.95,"appType":null,"birthYearMonth":null,"birthday":"","chargeType":null,"checkCode":null,"createTime":"2017-07-22 10:18:00","description":null,"deviceId":"ffffffff-dd9e-9389-ffff-ffffad30cc97","education":null,"frozenAmt":544.25,"gender":"1","industry":null,"ipAdd":null,"lastLoginTime":"2017-11-28 15:49:51","licenseId":"350725197812114503","loginName":"","name":"哈喽144","openId":"dbe863857f186c7a5ade265ebd54d132","password":"e10a7c3b4b9a5ba99e56e05df20f883e","phoneType":"","phoneimei":"864601026520189","qq":"137258569","recommemdPhone":"","registFrom":null,"remainder":0,"salt":"AIFvk1eJMh+l6BkCoX3kL0F5Og==","serverNumber":"dc100000","simId":"ffffffff-dd9e-9389-ffff-ffff9c1c9630","status":1,"takein":0,"updateTime":null,"userId":15555555555,"version":138,"webServerUrl":null,"weiXinNo":"helloweixin14","workjob":null}
         * code : 0
         */

        private String message;
        private StoreBean store;
        private OrderBean order;
        private BookerBean booker;
        private int code;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public StoreBean getStore() {
            return store;
        }

        public void setStore(StoreBean store) {
            this.store = store;
        }

        public OrderBean getOrder() {
            return order;
        }

        public void setOrder(OrderBean order) {
            this.order = order;
        }

        public BookerBean getBooker() {
            return booker;
        }

        public void setBooker(BookerBean booker) {
            this.booker = booker;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public static class StoreBean {
            /**
             * acctAmt : 1909.29
             * areaID : 440306
             * birthday :
             * checkCode : null
             * createTime : 2017-07-24 14:29:45
             * description : 某？！！？哦婆婆破
             * dianZanCount : 47
             * grade : 0
             * id : 1602
             * ipAdd : null
             * isMain : 1
             * lastLoginTime : null
             * licenseId : 450981198707206262
             * logoImage : /upload/storeLogo/20170807/1371426761901.jpg
             * minute : 2
             * onlineSeconds : 20171129110920
             * password : e10a7c3b4b9a5ba99e56e05df20f883e
             * payImage : null
             * payType : 1
             * phoneimei : 4C1F681B-5808-4A71-B1FF-7A17EC9A6B98
             * relateName : 你你是在说
             * relatePhone : 84887
             * remainder : 0.0
             * salt :
             * sendFoodTime : 08:05|23:01
             * sendRange : 600
             * sendfee : 2.0
             * servedFoodflow : 1
             * shopId : 2897
             * shopNo : 255
             * signType : 3
             * start_send_price : 1.0
             * status : 3
             * storeAddress : 广东省宝安区
             * storeId : 13714267619
             * storeLogo : null
             * storeName : 京东快餐a
             * storeSrvNumber : dc100000
             * storeType : 1
             * teaFee : 0.0
             * updateTime : 2017-11-29 10:25:31
             * version : 9856
             * weiXinNo : null
             */

            private double acctAmt;
            private String areaID;
            private String birthday;
            private Object checkCode;
            private String createTime;
            private String description;
            private int dianZanCount;
            private int grade;
            private int id;
            private Object ipAdd;
            private int isMain;
            private Object lastLoginTime;
            private String licenseId;
            private String logoImage;
            private int minute;
            private long onlineSeconds;
            private String password;
            private Object payImage;
            private int payType;
            private String phoneimei;
            private String relateName;
            private String relatePhone;
            private double remainder;
            private String salt;
            private String sendFoodTime;
            private String sendRange;
            private double sendfee;
            private int servedFoodflow;
            private String shopId;
            private String shopNo;
            private int signType;
            private double start_send_price;
            private int status;
            private String storeAddress;
            private long storeId;
            private Object storeLogo;
            private String storeName;
            private String storeSrvNumber;
            private int storeType;
            private double teaFee;
            private String updateTime;
            private int version;
            private Object weiXinNo;

            public double getAcctAmt() {
                return acctAmt;
            }

            public void setAcctAmt(double acctAmt) {
                this.acctAmt = acctAmt;
            }

            public String getAreaID() {
                return areaID;
            }

            public void setAreaID(String areaID) {
                this.areaID = areaID;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public Object getCheckCode() {
                return checkCode;
            }

            public void setCheckCode(Object checkCode) {
                this.checkCode = checkCode;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getDianZanCount() {
                return dianZanCount;
            }

            public void setDianZanCount(int dianZanCount) {
                this.dianZanCount = dianZanCount;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getIpAdd() {
                return ipAdd;
            }

            public void setIpAdd(Object ipAdd) {
                this.ipAdd = ipAdd;
            }

            public int getIsMain() {
                return isMain;
            }

            public void setIsMain(int isMain) {
                this.isMain = isMain;
            }

            public Object getLastLoginTime() {
                return lastLoginTime;
            }

            public void setLastLoginTime(Object lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
            }

            public String getLicenseId() {
                return licenseId;
            }

            public void setLicenseId(String licenseId) {
                this.licenseId = licenseId;
            }

            public String getLogoImage() {
                return logoImage;
            }

            public void setLogoImage(String logoImage) {
                this.logoImage = logoImage;
            }

            public int getMinute() {
                return minute;
            }

            public void setMinute(int minute) {
                this.minute = minute;
            }

            public long getOnlineSeconds() {
                return onlineSeconds;
            }

            public void setOnlineSeconds(long onlineSeconds) {
                this.onlineSeconds = onlineSeconds;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public Object getPayImage() {
                return payImage;
            }

            public void setPayImage(Object payImage) {
                this.payImage = payImage;
            }

            public int getPayType() {
                return payType;
            }

            public void setPayType(int payType) {
                this.payType = payType;
            }

            public String getPhoneimei() {
                return phoneimei;
            }

            public void setPhoneimei(String phoneimei) {
                this.phoneimei = phoneimei;
            }

            public String getRelateName() {
                return relateName;
            }

            public void setRelateName(String relateName) {
                this.relateName = relateName;
            }

            public String getRelatePhone() {
                return relatePhone;
            }

            public void setRelatePhone(String relatePhone) {
                this.relatePhone = relatePhone;
            }

            public double getRemainder() {
                return remainder;
            }

            public void setRemainder(double remainder) {
                this.remainder = remainder;
            }

            public String getSalt() {
                return salt;
            }

            public void setSalt(String salt) {
                this.salt = salt;
            }

            public String getSendFoodTime() {
                return sendFoodTime;
            }

            public void setSendFoodTime(String sendFoodTime) {
                this.sendFoodTime = sendFoodTime;
            }

            public String getSendRange() {
                return sendRange;
            }

            public void setSendRange(String sendRange) {
                this.sendRange = sendRange;
            }

            public double getSendfee() {
                return sendfee;
            }

            public void setSendfee(double sendfee) {
                this.sendfee = sendfee;
            }

            public int getServedFoodflow() {
                return servedFoodflow;
            }

            public void setServedFoodflow(int servedFoodflow) {
                this.servedFoodflow = servedFoodflow;
            }

            public String getShopId() {
                return shopId;
            }

            public void setShopId(String shopId) {
                this.shopId = shopId;
            }

            public String getShopNo() {
                return shopNo;
            }

            public void setShopNo(String shopNo) {
                this.shopNo = shopNo;
            }

            public int getSignType() {
                return signType;
            }

            public void setSignType(int signType) {
                this.signType = signType;
            }

            public double getStart_send_price() {
                return start_send_price;
            }

            public void setStart_send_price(double start_send_price) {
                this.start_send_price = start_send_price;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getStoreAddress() {
                return storeAddress;
            }

            public void setStoreAddress(String storeAddress) {
                this.storeAddress = storeAddress;
            }

            public long getStoreId() {
                return storeId;
            }

            public void setStoreId(long storeId) {
                this.storeId = storeId;
            }

            public Object getStoreLogo() {
                return storeLogo;
            }

            public void setStoreLogo(Object storeLogo) {
                this.storeLogo = storeLogo;
            }

            public String getStoreName() {
                return storeName;
            }

            public void setStoreName(String storeName) {
                this.storeName = storeName;
            }

            public String getStoreSrvNumber() {
                return storeSrvNumber;
            }

            public void setStoreSrvNumber(String storeSrvNumber) {
                this.storeSrvNumber = storeSrvNumber;
            }

            public int getStoreType() {
                return storeType;
            }

            public void setStoreType(int storeType) {
                this.storeType = storeType;
            }

            public double getTeaFee() {
                return teaFee;
            }

            public void setTeaFee(double teaFee) {
                this.teaFee = teaFee;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public Object getWeiXinNo() {
                return weiXinNo;
            }

            public void setWeiXinNo(Object weiXinNo) {
                this.weiXinNo = weiXinNo;
            }
        }

        public static class OrderBean {
            /**
             * addressId : 562
             * appFlowNum : 137142676191511836537654
             * bookPlatformId :
             * bookTime : 2017-11-28 10:35:30:402
             * channelSource : null
             * dinnerTime : 2017-11-28
             * hbAmt : 0.0
             * hongbaoId : null
             * oldOrderId : null
             * orderId : 155555555551511836530402
             * orderItems : [{"food":{"category":null,"chilliCount":1,"cid":"1","cookingType":2,"description":"","endDate":null,"foodAmount":258,"foodClass":"","foodId":"22b341652e754f5bb17d9801252205dd","foodImage":"upload/food_foodImage/20171125/7ec1efce94bc49209d23e298f6cdb274.jpg","foodName":"图来咯哦路","foodPrice":20.08,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":14},"foodNumber":1,"order":null,"orderItemId":"ed8be526418d4f67a6924bfbaa9c3467","smallCount":20.08,"status":0},{"food":{"category":null,"chilliCount":2,"cid":"2","cookingType":2,"description":"米开朗基罗","endDate":null,"foodAmount":258,"foodClass":"","foodId":"64b3ba78d2a043879bab0a3709301d3a","foodImage":"upload/food_foodImage/20171125/2c7365afc2bb424b8d5b765e1b1a8db2.jpg","foodName":"金窝银窝","foodPrice":225,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":9},"foodNumber":1,"order":null,"orderItemId":"168e392793c74339861d3b56d39d59da","smallCount":225,"status":0}]
             * orderType : COMMON
             * out_trade_no : null
             * payAccount : null
             * payAmt : 0.0
             * payOffAmt : 252.08
             * payStatus : 2
             * payType : 1
             * sendType : null
             * sendfee : 7.0
             * serialNumber : null
             * simpleAdd : 贵州省::黔南布依族苗族自治州::惠水县::12345678i::哈喽144::15555555555
             * status : 5
             * storeId : 13714267619
             * storeSrvNumber : dc100000
             * storeType : 1
             * sysAbbreviation : dcxt
             * totalAccount : 252.08
             * tranSummary : null
             * userId : 15555555555
             * usrSrvNumber :
             * version : 1
             */

            private int addressId;
            private String appFlowNum;
            private String bookPlatformId;
            private String bookTime;
            private Object channelSource;
            private String dinnerTime;
            private double hbAmt;
            private Object hongbaoId;
            private Object oldOrderId;
            private String orderId;
            private String orderType;
            private Object out_trade_no;
            private Object payAccount;
            private double payAmt;
            private double payOffAmt;
            private String payStatus;
            private String payType;
            private Object sendType;
            private double sendfee;
            private Object serialNumber;
            private String simpleAdd;
            private String status;
            private long storeId;
            private String storeSrvNumber;
            private int storeType;
            private String sysAbbreviation;
            private double totalAccount;
            private Object tranSummary;
            private long userId;
            private String usrSrvNumber;
            private int version;
            private List<OrderItemsBean> orderItems;

            public int getAddressId() {
                return addressId;
            }

            public void setAddressId(int addressId) {
                this.addressId = addressId;
            }

            public String getAppFlowNum() {
                return appFlowNum;
            }

            public void setAppFlowNum(String appFlowNum) {
                this.appFlowNum = appFlowNum;
            }

            public String getBookPlatformId() {
                return bookPlatformId;
            }

            public void setBookPlatformId(String bookPlatformId) {
                this.bookPlatformId = bookPlatformId;
            }

            public String getBookTime() {
                return bookTime;
            }

            public void setBookTime(String bookTime) {
                this.bookTime = bookTime;
            }

            public Object getChannelSource() {
                return channelSource;
            }

            public void setChannelSource(Object channelSource) {
                this.channelSource = channelSource;
            }

            public String getDinnerTime() {
                return dinnerTime;
            }

            public void setDinnerTime(String dinnerTime) {
                this.dinnerTime = dinnerTime;
            }

            public double getHbAmt() {
                return hbAmt;
            }

            public void setHbAmt(double hbAmt) {
                this.hbAmt = hbAmt;
            }

            public Object getHongbaoId() {
                return hongbaoId;
            }

            public void setHongbaoId(Object hongbaoId) {
                this.hongbaoId = hongbaoId;
            }

            public Object getOldOrderId() {
                return oldOrderId;
            }

            public void setOldOrderId(Object oldOrderId) {
                this.oldOrderId = oldOrderId;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getOrderType() {
                return orderType;
            }

            public void setOrderType(String orderType) {
                this.orderType = orderType;
            }

            public Object getOut_trade_no() {
                return out_trade_no;
            }

            public void setOut_trade_no(Object out_trade_no) {
                this.out_trade_no = out_trade_no;
            }

            public Object getPayAccount() {
                return payAccount;
            }

            public void setPayAccount(Object payAccount) {
                this.payAccount = payAccount;
            }

            public double getPayAmt() {
                return payAmt;
            }

            public void setPayAmt(double payAmt) {
                this.payAmt = payAmt;
            }

            public double getPayOffAmt() {
                return payOffAmt;
            }

            public void setPayOffAmt(double payOffAmt) {
                this.payOffAmt = payOffAmt;
            }

            public String getPayStatus() {
                return payStatus;
            }

            public void setPayStatus(String payStatus) {
                this.payStatus = payStatus;
            }

            public String getPayType() {
                return payType;
            }

            public void setPayType(String payType) {
                this.payType = payType;
            }

            public Object getSendType() {
                return sendType;
            }

            public void setSendType(Object sendType) {
                this.sendType = sendType;
            }

            public double getSendfee() {
                return sendfee;
            }

            public void setSendfee(double sendfee) {
                this.sendfee = sendfee;
            }

            public Object getSerialNumber() {
                return serialNumber;
            }

            public void setSerialNumber(Object serialNumber) {
                this.serialNumber = serialNumber;
            }

            public String getSimpleAdd() {
                return simpleAdd;
            }

            public void setSimpleAdd(String simpleAdd) {
                this.simpleAdd = simpleAdd;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public long getStoreId() {
                return storeId;
            }

            public void setStoreId(long storeId) {
                this.storeId = storeId;
            }

            public String getStoreSrvNumber() {
                return storeSrvNumber;
            }

            public void setStoreSrvNumber(String storeSrvNumber) {
                this.storeSrvNumber = storeSrvNumber;
            }

            public int getStoreType() {
                return storeType;
            }

            public void setStoreType(int storeType) {
                this.storeType = storeType;
            }

            public String getSysAbbreviation() {
                return sysAbbreviation;
            }

            public void setSysAbbreviation(String sysAbbreviation) {
                this.sysAbbreviation = sysAbbreviation;
            }

            public double getTotalAccount() {
                return totalAccount;
            }

            public void setTotalAccount(double totalAccount) {
                this.totalAccount = totalAccount;
            }

            public Object getTranSummary() {
                return tranSummary;
            }

            public void setTranSummary(Object tranSummary) {
                this.tranSummary = tranSummary;
            }

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public String getUsrSrvNumber() {
                return usrSrvNumber;
            }

            public void setUsrSrvNumber(String usrSrvNumber) {
                this.usrSrvNumber = usrSrvNumber;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public List<OrderItemsBean> getOrderItems() {
                return orderItems;
            }

            public void setOrderItems(List<OrderItemsBean> orderItems) {
                this.orderItems = orderItems;
            }

            public static class OrderItemsBean {
                /**
                 * food : {"category":null,"chilliCount":1,"cid":"1","cookingType":2,"description":"","endDate":null,"foodAmount":258,"foodClass":"","foodId":"22b341652e754f5bb17d9801252205dd","foodImage":"upload/food_foodImage/20171125/7ec1efce94bc49209d23e298f6cdb274.jpg","foodName":"图来咯哦路","foodPrice":20.08,"isRecommended":"0","isSpecial":null,"showLevel":0,"spePrice":0,"startDate":null,"status":1,"store":null,"storeId":13714267619,"storeType":1,"version":14}
                 * foodNumber : 1
                 * order : null
                 * orderItemId : ed8be526418d4f67a6924bfbaa9c3467
                 * smallCount : 20.08
                 * status : 0
                 */

                private FoodBean food;
                private int foodNumber;
                private Object order;
                private String orderItemId;
                private double smallCount;
                private int status;

                public FoodBean getFood() {
                    return food;
                }

                public void setFood(FoodBean food) {
                    this.food = food;
                }

                public int getFoodNumber() {
                    return foodNumber;
                }

                public void setFoodNumber(int foodNumber) {
                    this.foodNumber = foodNumber;
                }

                public Object getOrder() {
                    return order;
                }

                public void setOrder(Object order) {
                    this.order = order;
                }

                public String getOrderItemId() {
                    return orderItemId;
                }

                public void setOrderItemId(String orderItemId) {
                    this.orderItemId = orderItemId;
                }

                public double getSmallCount() {
                    return smallCount;
                }

                public void setSmallCount(double smallCount) {
                    this.smallCount = smallCount;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public static class FoodBean {
                    /**
                     * category : null
                     * chilliCount : 1
                     * cid : 1
                     * cookingType : 2
                     * description :
                     * endDate : null
                     * foodAmount : 258
                     * foodClass :
                     * foodId : 22b341652e754f5bb17d9801252205dd
                     * foodImage : upload/food_foodImage/20171125/7ec1efce94bc49209d23e298f6cdb274.jpg
                     * foodName : 图来咯哦路
                     * foodPrice : 20.08
                     * isRecommended : 0
                     * isSpecial : null
                     * showLevel : 0
                     * spePrice : 0.0
                     * startDate : null
                     * status : 1
                     * store : null
                     * storeId : 13714267619
                     * storeType : 1
                     * version : 14
                     */

                    private Object category;
                    private int chilliCount;
                    private String cid;
                    private int cookingType;
                    private String description;
                    private Object endDate;
                    private int foodAmount;
                    private String foodClass;
                    private String foodId;
                    private String foodImage;
                    private String foodName;
                    private double foodPrice;
                    private String isRecommended;
                    private Object isSpecial;
                    private int showLevel;
                    private double spePrice;
                    private Object startDate;
                    private int status;
                    private Object store;
                    private long storeId;
                    private int storeType;
                    private int version;

                    public Object getCategory() {
                        return category;
                    }

                    public void setCategory(Object category) {
                        this.category = category;
                    }

                    public int getChilliCount() {
                        return chilliCount;
                    }

                    public void setChilliCount(int chilliCount) {
                        this.chilliCount = chilliCount;
                    }

                    public String getCid() {
                        return cid;
                    }

                    public void setCid(String cid) {
                        this.cid = cid;
                    }

                    public int getCookingType() {
                        return cookingType;
                    }

                    public void setCookingType(int cookingType) {
                        this.cookingType = cookingType;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public Object getEndDate() {
                        return endDate;
                    }

                    public void setEndDate(Object endDate) {
                        this.endDate = endDate;
                    }

                    public int getFoodAmount() {
                        return foodAmount;
                    }

                    public void setFoodAmount(int foodAmount) {
                        this.foodAmount = foodAmount;
                    }

                    public String getFoodClass() {
                        return foodClass;
                    }

                    public void setFoodClass(String foodClass) {
                        this.foodClass = foodClass;
                    }

                    public String getFoodId() {
                        return foodId;
                    }

                    public void setFoodId(String foodId) {
                        this.foodId = foodId;
                    }

                    public String getFoodImage() {
                        return foodImage;
                    }

                    public void setFoodImage(String foodImage) {
                        this.foodImage = foodImage;
                    }

                    public String getFoodName() {
                        return foodName;
                    }

                    public void setFoodName(String foodName) {
                        this.foodName = foodName;
                    }

                    public double getFoodPrice() {
                        return foodPrice;
                    }

                    public void setFoodPrice(double foodPrice) {
                        this.foodPrice = foodPrice;
                    }

                    public String getIsRecommended() {
                        return isRecommended;
                    }

                    public void setIsRecommended(String isRecommended) {
                        this.isRecommended = isRecommended;
                    }

                    public Object getIsSpecial() {
                        return isSpecial;
                    }

                    public void setIsSpecial(Object isSpecial) {
                        this.isSpecial = isSpecial;
                    }

                    public int getShowLevel() {
                        return showLevel;
                    }

                    public void setShowLevel(int showLevel) {
                        this.showLevel = showLevel;
                    }

                    public double getSpePrice() {
                        return spePrice;
                    }

                    public void setSpePrice(double spePrice) {
                        this.spePrice = spePrice;
                    }

                    public Object getStartDate() {
                        return startDate;
                    }

                    public void setStartDate(Object startDate) {
                        this.startDate = startDate;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public Object getStore() {
                        return store;
                    }

                    public void setStore(Object store) {
                        this.store = store;
                    }

                    public long getStoreId() {
                        return storeId;
                    }

                    public void setStoreId(long storeId) {
                        this.storeId = storeId;
                    }

                    public int getStoreType() {
                        return storeType;
                    }

                    public void setStoreType(int storeType) {
                        this.storeType = storeType;
                    }

                    public int getVersion() {
                        return version;
                    }

                    public void setVersion(int version) {
                        this.version = version;
                    }
                }
            }
        }

        public static class BookerBean {
            /**
             * acctAmt : 91420.95
             * appType : null
             * birthYearMonth : null
             * birthday :
             * chargeType : null
             * checkCode : null
             * createTime : 2017-07-22 10:18:00
             * description : null
             * deviceId : ffffffff-dd9e-9389-ffff-ffffad30cc97
             * education : null
             * frozenAmt : 544.25
             * gender : 1
             * industry : null
             * ipAdd : null
             * lastLoginTime : 2017-11-28 15:49:51
             * licenseId : 350725197812114503
             * loginName :
             * name : 哈喽144
             * openId : dbe863857f186c7a5ade265ebd54d132
             * password : e10a7c3b4b9a5ba99e56e05df20f883e
             * phoneType :
             * phoneimei : 864601026520189
             * qq : 137258569
             * recommemdPhone :
             * registFrom : null
             * remainder : 0.0
             * salt : AIFvk1eJMh+l6BkCoX3kL0F5Og==
             * serverNumber : dc100000
             * simId : ffffffff-dd9e-9389-ffff-ffff9c1c9630
             * status : 1
             * takein : 0.0
             * updateTime : null
             * userId : 15555555555
             * version : 138
             * webServerUrl : null
             * weiXinNo : helloweixin14
             * workjob : null
             */

            private double acctAmt;
            private Object appType;
            private Object birthYearMonth;
            private String birthday;
            private Object chargeType;
            private Object checkCode;
            private String createTime;
            private Object description;
            private String deviceId;
            private Object education;
            private double frozenAmt;
            private String gender;
            private Object industry;
            private Object ipAdd;
            private String lastLoginTime;
            private String licenseId;
            private String loginName;
            private String name;
            private String openId;
            private String password;
            private String phoneType;
            private String phoneimei;
            private String qq;
            private String recommemdPhone;
            private Object registFrom;
            private double remainder;
            private String salt;
            private String serverNumber;
            private String simId;
            private int status;
            private double takein;
            private Object updateTime;
            private long userId;
            private int version;
            private Object webServerUrl;
            private String weiXinNo;
            private Object workjob;

            public double getAcctAmt() {
                return acctAmt;
            }

            public void setAcctAmt(double acctAmt) {
                this.acctAmt = acctAmt;
            }

            public Object getAppType() {
                return appType;
            }

            public void setAppType(Object appType) {
                this.appType = appType;
            }

            public Object getBirthYearMonth() {
                return birthYearMonth;
            }

            public void setBirthYearMonth(Object birthYearMonth) {
                this.birthYearMonth = birthYearMonth;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public Object getChargeType() {
                return chargeType;
            }

            public void setChargeType(Object chargeType) {
                this.chargeType = chargeType;
            }

            public Object getCheckCode() {
                return checkCode;
            }

            public void setCheckCode(Object checkCode) {
                this.checkCode = checkCode;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public Object getDescription() {
                return description;
            }

            public void setDescription(Object description) {
                this.description = description;
            }

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public Object getEducation() {
                return education;
            }

            public void setEducation(Object education) {
                this.education = education;
            }

            public double getFrozenAmt() {
                return frozenAmt;
            }

            public void setFrozenAmt(double frozenAmt) {
                this.frozenAmt = frozenAmt;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public Object getIndustry() {
                return industry;
            }

            public void setIndustry(Object industry) {
                this.industry = industry;
            }

            public Object getIpAdd() {
                return ipAdd;
            }

            public void setIpAdd(Object ipAdd) {
                this.ipAdd = ipAdd;
            }

            public String getLastLoginTime() {
                return lastLoginTime;
            }

            public void setLastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
            }

            public String getLicenseId() {
                return licenseId;
            }

            public void setLicenseId(String licenseId) {
                this.licenseId = licenseId;
            }

            public String getLoginName() {
                return loginName;
            }

            public void setLoginName(String loginName) {
                this.loginName = loginName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOpenId() {
                return openId;
            }

            public void setOpenId(String openId) {
                this.openId = openId;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getPhoneType() {
                return phoneType;
            }

            public void setPhoneType(String phoneType) {
                this.phoneType = phoneType;
            }

            public String getPhoneimei() {
                return phoneimei;
            }

            public void setPhoneimei(String phoneimei) {
                this.phoneimei = phoneimei;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getRecommemdPhone() {
                return recommemdPhone;
            }

            public void setRecommemdPhone(String recommemdPhone) {
                this.recommemdPhone = recommemdPhone;
            }

            public Object getRegistFrom() {
                return registFrom;
            }

            public void setRegistFrom(Object registFrom) {
                this.registFrom = registFrom;
            }

            public double getRemainder() {
                return remainder;
            }

            public void setRemainder(double remainder) {
                this.remainder = remainder;
            }

            public String getSalt() {
                return salt;
            }

            public void setSalt(String salt) {
                this.salt = salt;
            }

            public String getServerNumber() {
                return serverNumber;
            }

            public void setServerNumber(String serverNumber) {
                this.serverNumber = serverNumber;
            }

            public String getSimId() {
                return simId;
            }

            public void setSimId(String simId) {
                this.simId = simId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public double getTakein() {
                return takein;
            }

            public void setTakein(double takein) {
                this.takein = takein;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public Object getWebServerUrl() {
                return webServerUrl;
            }

            public void setWebServerUrl(Object webServerUrl) {
                this.webServerUrl = webServerUrl;
            }

            public String getWeiXinNo() {
                return weiXinNo;
            }

            public void setWeiXinNo(String weiXinNo) {
                this.weiXinNo = weiXinNo;
            }

            public Object getWorkjob() {
                return workjob;
            }

            public void setWorkjob(Object workjob) {
                this.workjob = workjob;
            }
        }
    }
}
