package com.riqthen.myandroid.accountflow.entity;

import java.util.List;

/**
 * @author H
 * @date 2017/11/29 14:49
 * @description
 */
public class AccountFlowEntity {

    /**
     * accountData : {"message":"账单记录列表","accounts":[{"accountBeginAddress":null,"accountChange":252.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:35:56:149","businessCode":"001001","chargeFrom":null,"consumptionType":"BACK","id":"d26d9f06dc364caa85a96d629ac24f84","inOrout":0,"orderId":"155555555551511836556145","out_trade_no":"155555555551511836530402","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"快餐撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":252.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:35:30:415","businessCode":"001000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"2204efa08a2c492d84440f69ac367e63","inOrout":1,"orderId":"155555555551511836530402","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91170.87,"status":1,"tranSummary":"快餐","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":299,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:29:21:213","businessCode":"004001","chargeFrom":null,"consumptionType":"BACK","id":"b92767d1f61e4a199258b5109384f4bf","inOrout":0,"orderId":"155555555551511836161207","out_trade_no":"155555555551511836064426","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"商城撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":299,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:27:44:437","businessCode":"004000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"30a3b508347846749b91b1392f82d1fd","inOrout":1,"orderId":"155555555551511836064426","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91123.95,"status":1,"tranSummary":"商城","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":27.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:49:26:770","businessCode":"001001","chargeFrom":null,"consumptionType":"BACK","id":"43d2972a1f5640548c325802129da0b2","inOrout":0,"orderId":"155555555551511833766765","out_trade_no":"155555555551511833760340","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"快餐撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":27.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:49:20:352","businessCode":"001000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"184c576f58694cfaa01624ebac1164bb","inOrout":1,"orderId":"155555555551511833760340","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91395.87,"status":1,"tranSummary":"快餐","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":358,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:47:56:700","businessCode":"004001","chargeFrom":null,"consumptionType":"BACK","id":"2bd25b6a12b34bdf92fe1d1de88619c8","inOrout":0,"orderId":"155555555551511833676695","out_trade_no":"155555555551511833669496","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"商城撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":358,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:47:49:507","businessCode":"004000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"0f4891b1a61c4cb6a8248f486b65c5e6","inOrout":1,"orderId":"155555555551511833669496","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91064.95,"status":1,"tranSummary":"商城","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":199,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-27 18:00:33:719","businessCode":"004001","chargeFrom":null,"consumptionType":"BACK","id":"6cf1680301354afbb5017e8f498880ac","inOrout":0,"orderId":"155555555551511776833712","out_trade_no":"155555555551511776819410","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"商城撤销","updateTime":"2017-11-27","version":0},{"accountBeginAddress":null,"accountChange":199,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-27 18:00:19:423","businessCode":"004000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"22e7a62689be4c96b88122021d9456ae","inOrout":1,"orderId":"155555555551511776819410","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91223.95,"status":1,"tranSummary":"商城","updateTime":"2017-11-27","version":0}],"code":0}
     */

    private AccountDataBean accountData;

    public AccountDataBean getAccountData() {
        return accountData;
    }

    public void setAccountData(AccountDataBean accountData) {
        this.accountData = accountData;
    }

    public static class AccountDataBean {
        /**
         * message : 账单记录列表
         * accounts : [{"accountBeginAddress":null,"accountChange":252.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:35:56:149","businessCode":"001001","chargeFrom":null,"consumptionType":"BACK","id":"d26d9f06dc364caa85a96d629ac24f84","inOrout":0,"orderId":"155555555551511836556145","out_trade_no":"155555555551511836530402","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"快餐撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":252.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:35:30:415","businessCode":"001000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"2204efa08a2c492d84440f69ac367e63","inOrout":1,"orderId":"155555555551511836530402","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91170.87,"status":1,"tranSummary":"快餐","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":299,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:29:21:213","businessCode":"004001","chargeFrom":null,"consumptionType":"BACK","id":"b92767d1f61e4a199258b5109384f4bf","inOrout":0,"orderId":"155555555551511836161207","out_trade_no":"155555555551511836064426","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"商城撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":299,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 10:27:44:437","businessCode":"004000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"30a3b508347846749b91b1392f82d1fd","inOrout":1,"orderId":"155555555551511836064426","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91123.95,"status":1,"tranSummary":"商城","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":27.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:49:26:770","businessCode":"001001","chargeFrom":null,"consumptionType":"BACK","id":"43d2972a1f5640548c325802129da0b2","inOrout":0,"orderId":"155555555551511833766765","out_trade_no":"155555555551511833760340","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"快餐撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":27.08,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:49:20:352","businessCode":"001000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"184c576f58694cfaa01624ebac1164bb","inOrout":1,"orderId":"155555555551511833760340","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91395.87,"status":1,"tranSummary":"快餐","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":358,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:47:56:700","businessCode":"004001","chargeFrom":null,"consumptionType":"BACK","id":"2bd25b6a12b34bdf92fe1d1de88619c8","inOrout":0,"orderId":"155555555551511833676695","out_trade_no":"155555555551511833669496","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"商城撤销","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":358,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-28 09:47:49:507","businessCode":"004000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"0f4891b1a61c4cb6a8248f486b65c5e6","inOrout":1,"orderId":"155555555551511833669496","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91064.95,"status":1,"tranSummary":"商城","updateTime":"2017-11-28","version":0},{"accountBeginAddress":null,"accountChange":199,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-27 18:00:33:719","businessCode":"004001","chargeFrom":null,"consumptionType":"BACK","id":"6cf1680301354afbb5017e8f498880ac","inOrout":0,"orderId":"155555555551511776833712","out_trade_no":"155555555551511776819410","realName":null,"relateAccount":"15555555555","remainder":91422.95,"status":1,"tranSummary":"商城撤销","updateTime":"2017-11-27","version":0},{"accountBeginAddress":null,"accountChange":199,"accountNumber":null,"accountType":"USER","beginTime":"2017-11-27 18:00:19:423","businessCode":"004000","chargeFrom":null,"consumptionType":"CONSUMPTIION","id":"22e7a62689be4c96b88122021d9456ae","inOrout":1,"orderId":"155555555551511776819410","out_trade_no":"","realName":null,"relateAccount":"15555555555","remainder":91223.95,"status":1,"tranSummary":"商城","updateTime":"2017-11-27","version":0}]
         * code : 0
         */

        private String message;
        private int code;
        private List<AccountsBean> accounts;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public List<AccountsBean> getAccounts() {
            return accounts;
        }

        public void setAccounts(List<AccountsBean> accounts) {
            this.accounts = accounts;
        }

        public static class AccountsBean {
            /**
             * accountBeginAddress : null
             * accountChange : 252.08
             * accountNumber : null
             * accountType : USER
             * beginTime : 2017-11-28 10:35:56:149
             * businessCode : 001001
             * chargeFrom : null
             * consumptionType : BACK
             * id : d26d9f06dc364caa85a96d629ac24f84
             * inOrout : 0
             * orderId : 155555555551511836556145
             * out_trade_no : 155555555551511836530402
             * realName : null
             * relateAccount : 15555555555
             * remainder : 91422.95
             * status : 1
             * tranSummary : 快餐撤销
             * updateTime : 2017-11-28
             * version : 0
             */

            private Object accountBeginAddress;
            private double accountChange;
            private Object accountNumber;
            private String accountType;
            private String beginTime;
            private String businessCode;
            private Object chargeFrom;
            private String consumptionType;
            private String id;
            private int inOrout;
            private String orderId;
            private String out_trade_no;
            private Object realName;
            private String relateAccount;
            private double remainder;
            private int status;
            private String tranSummary;
            private String updateTime;
            private int version;

            public Object getAccountBeginAddress() {
                return accountBeginAddress;
            }

            public void setAccountBeginAddress(Object accountBeginAddress) {
                this.accountBeginAddress = accountBeginAddress;
            }

            public double getAccountChange() {
                return accountChange;
            }

            public void setAccountChange(double accountChange) {
                this.accountChange = accountChange;
            }

            public Object getAccountNumber() {
                return accountNumber;
            }

            public void setAccountNumber(Object accountNumber) {
                this.accountNumber = accountNumber;
            }

            public String getAccountType() {
                return accountType;
            }

            public void setAccountType(String accountType) {
                this.accountType = accountType;
            }

            public String getBeginTime() {
                return beginTime;
            }

            public void setBeginTime(String beginTime) {
                this.beginTime = beginTime;
            }

            public String getBusinessCode() {
                return businessCode;
            }

            public void setBusinessCode(String businessCode) {
                this.businessCode = businessCode;
            }

            public Object getChargeFrom() {
                return chargeFrom;
            }

            public void setChargeFrom(Object chargeFrom) {
                this.chargeFrom = chargeFrom;
            }

            public String getConsumptionType() {
                return consumptionType;
            }

            public void setConsumptionType(String consumptionType) {
                this.consumptionType = consumptionType;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getInOrout() {
                return inOrout;
            }

            public void setInOrout(int inOrout) {
                this.inOrout = inOrout;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getOut_trade_no() {
                return out_trade_no;
            }

            public void setOut_trade_no(String out_trade_no) {
                this.out_trade_no = out_trade_no;
            }

            public Object getRealName() {
                return realName;
            }

            public void setRealName(Object realName) {
                this.realName = realName;
            }

            public String getRelateAccount() {
                return relateAccount;
            }

            public void setRelateAccount(String relateAccount) {
                this.relateAccount = relateAccount;
            }

            public double getRemainder() {
                return remainder;
            }

            public void setRemainder(double remainder) {
                this.remainder = remainder;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTranSummary() {
                return tranSummary;
            }

            public void setTranSummary(String tranSummary) {
                this.tranSummary = tranSummary;
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
        }
    }
}
