package com.riqthen.myandroid.address;

import java.util.List;

/**
 * Created by H on 2017/11/20 17:33
 */

public class AddressEntity {
    /**
     * addressData : {"message":"所有个人地址","code":0,"addresses":[{"addressId":701,"version":0,"cityCode":null,"province":"福建省","city":"龙岩市","townAndStreet":"连城县","addressDetail":"功能机","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":700,"version":0,"cityCode":null,"province":"山东省","city":"枣庄市","townAndStreet":"峄城区","addressDetail":"不理我","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":607,"version":0,"cityCode":null,"province":"广东省","city":"深圳市","townAndStreet":"宝安区","addressDetail":"向南商业大厦509","receiverName":"王宝强","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":697,"version":0,"cityCode":null,"province":"福建省","city":"宁德市","townAndStreet":"屏南县","addressDetail":"给","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":691,"version":0,"cityCode":null,"province":"湖北省","city":"武汉市","townAndStreet":"武昌区","addressDetail":"友谊大道","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null}]}
     */

    private AddressDataBean addressData;

    public AddressDataBean getAddressData() {
        return addressData;
    }

    public void setAddressData(AddressDataBean addressData) {
        this.addressData = addressData;
    }

    public static class AddressDataBean {
        /**
         * message : 所有个人地址
         * code : 0
         * addresses : [{"addressId":701,"version":0,"cityCode":null,"province":"福建省","city":"龙岩市","townAndStreet":"连城县","addressDetail":"功能机","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":700,"version":0,"cityCode":null,"province":"山东省","city":"枣庄市","townAndStreet":"峄城区","addressDetail":"不理我","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":607,"version":0,"cityCode":null,"province":"广东省","city":"深圳市","townAndStreet":"宝安区","addressDetail":"向南商业大厦509","receiverName":"王宝强","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":697,"version":0,"cityCode":null,"province":"福建省","city":"宁德市","townAndStreet":"屏南县","addressDetail":"给","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null},{"addressId":691,"version":0,"cityCode":null,"province":"湖北省","city":"武汉市","townAndStreet":"武昌区","addressDetail":"友谊大道","receiverName":"哈喽","receiverPhone":"15555555555","status":"1","userId":15555555555,"abbreviatedCode":null}]
         */

        private String message;
        private int code;
        private List<AddressesBean> addresses;

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

        public List<AddressesBean> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<AddressesBean> addresses) {
            this.addresses = addresses;
        }

        public static class AddressesBean {
            /**
             * addressId : 701
             * version : 0
             * cityCode : null
             * province : 福建省
             * city : 龙岩市
             * townAndStreet : 连城县
             * addressDetail : 功能机
             * receiverName : 哈喽
             * receiverPhone : 15555555555
             * status : 1
             * userId : 15555555555
             * abbreviatedCode : null
             */

            private int addressId;
            private int version;
            private Object cityCode;
            private String province;
            private String city;
            private String townAndStreet;
            private String addressDetail;
            private String receiverName;
            private String receiverPhone;
            private String status;
            private long userId;
            private Object abbreviatedCode;

            public int getAddressId() {
                return addressId;
            }

            public void setAddressId(int addressId) {
                this.addressId = addressId;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public Object getCityCode() {
                return cityCode;
            }

            public void setCityCode(Object cityCode) {
                this.cityCode = cityCode;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getTownAndStreet() {
                return townAndStreet;
            }

            public void setTownAndStreet(String townAndStreet) {
                this.townAndStreet = townAndStreet;
            }

            public String getAddressDetail() {
                return addressDetail;
            }

            public void setAddressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
            }

            public String getReceiverName() {
                return receiverName;
            }

            public void setReceiverName(String receiverName) {
                this.receiverName = receiverName;
            }

            public String getReceiverPhone() {
                return receiverPhone;
            }

            public void setReceiverPhone(String receiverPhone) {
                this.receiverPhone = receiverPhone;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public Object getAbbreviatedCode() {
                return abbreviatedCode;
            }

            public void setAbbreviatedCode(Object abbreviatedCode) {
                this.abbreviatedCode = abbreviatedCode;
            }

            @Override
            public String toString() {
                return "AddressesBean{" +
                        "addressId=" + addressId +
                        ", version=" + version +
                        ", cityCode=" + cityCode +
                        ", province='" + province + '\'' +
                        ", city='" + city + '\'' +
                        ", townAndStreet='" + townAndStreet + '\'' +
                        ", addressDetail='" + addressDetail + '\'' +
                        ", receiverName='" + receiverName + '\'' +
                        ", receiverPhone='" + receiverPhone + '\'' +
                        ", status='" + status + '\'' +
                        ", userId=" + userId +
                        ", abbreviatedCode=" + abbreviatedCode +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "AddressDataBean{" +
                    "message='" + message + '\'' +
                    ", code=" + code +
                    ", addresses=" + addresses +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "addressData=" + addressData +
                '}';
    }
}
