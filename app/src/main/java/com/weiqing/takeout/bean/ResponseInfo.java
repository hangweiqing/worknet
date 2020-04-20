package com.weiqing.takeout.bean;

import java.io.Serializable;
import java.util.List;

public class ResponseInfo implements Serializable{
    private String flag;
    private String flowCode;
    private DataBean data;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlowCode() {
        return flowCode;
    }

    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{

        private OrderDetailBean orderDetail;

        public OrderDetailBean getOrderDetail() {
            return orderDetail;
        }

        public void setOrderDetail(OrderDetailBean orderDetail) {
            this.orderDetail = orderDetail;
        }

        public static class OrderDetailBean implements Serializable{

            private String startId;
            private String startName;
            private String startTypeName;
            private String endId;
            private String endName;
            private String endTypeName;
            private int totalGoodCodeCount;
            private int correctGoodCount;
            private int suspiciousGoodCount;
            private List<CorrectGoodsBean> correctGoods;
            private List<SuspiciousGoodsBean> suspiciousGoods;

            public String getStartId() {
                return startId;
            }

            public void setStartId(String startId) {
                this.startId = startId;
            }

            public String getStartName() {
                return startName;
            }

            public void setStartName(String startName) {
                this.startName = startName;
            }

            public String getStartTypeName() {
                return startTypeName;
            }

            public void setStartTypeName(String startTypeName) {
                this.startTypeName = startTypeName;
            }

            public String getEndId() {
                return endId;
            }

            public void setEndId(String endId) {
                this.endId = endId;
            }

            public String getEndName() {
                return endName;
            }

            public void setEndName(String endName) {
                this.endName = endName;
            }

            public String getEndTypeName() {
                return endTypeName;
            }

            public void setEndTypeName(String endTypeName) {
                this.endTypeName = endTypeName;
            }

            public int getTotalGoodCodeCount() {
                return totalGoodCodeCount;
            }

            public void setTotalGoodCodeCount(int totalGoodCodeCount) {
                this.totalGoodCodeCount = totalGoodCodeCount;
            }

            public int getCorrectGoodCount() {
                return correctGoodCount;
            }

            public void setCorrectGoodCount(int correctGoodCount) {
                this.correctGoodCount = correctGoodCount;
            }

            public int getSuspiciousGoodCount() {
                return suspiciousGoodCount;
            }

            public void setSuspiciousGoodCount(int suspiciousGoodCount) {
                this.suspiciousGoodCount = suspiciousGoodCount;
            }

            public List<CorrectGoodsBean> getCorrectGoods() {
                return correctGoods;
            }

            public void setCorrectGoods(List<CorrectGoodsBean> correctGoods) {
                this.correctGoods = correctGoods;
            }

            public List<SuspiciousGoodsBean> getSuspiciousGoods() {
                return suspiciousGoods;
            }

            public void setSuspiciousGoods(List<SuspiciousGoodsBean> suspiciousGoods) {
                this.suspiciousGoods = suspiciousGoods;
            }

            public static class CorrectGoodsBean implements Serializable{
                /**
                 * goodCode : VB53280381475-1-1-
                 * similarFlag : null
                 */

                private String goodCode;
                private String similarFlag;

                public String getGoodCode() {
                    return goodCode;
                }

                public void setGoodCode(String goodCode) {
                    this.goodCode = goodCode;
                }

                public String getSimilarFlag() {
                    return similarFlag;
                }

                public void setSimilarFlag(String similarFlag) {
                    this.similarFlag = similarFlag;
                }

                @Override
                public String toString() {
                    return "CorrectGoodsBean{" +
                            "goodCode='" + goodCode + '\'' +
                            ", similarFlag='" + similarFlag + '\'' +
                            '}';
                }
            }

            public static class SuspiciousGoodsBean implements Serializable {
                /**
                 * goodCode : VB53280381475
                 * similarFlag : N
                 */

                private String goodCode;
                private String similarFlag;

                public String getGoodCode() {
                    return goodCode;
                }

                public void setGoodCode(String goodCode) {
                    this.goodCode = goodCode;
                }

                public String getSimilarFlag() {
                    return similarFlag;
                }

                public void setSimilarFlag(String similarFlag) {
                    this.similarFlag = similarFlag;
                }

                @Override
                public String toString() {
                    return "SuspiciousGoodsBean{" +
                            "goodCode='" + goodCode + '\'' +
                            ", similarFlag='" + similarFlag + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "OrderDetailBean{" +
                        "startId='" + startId + '\'' +
                        ", startName='" + startName + '\'' +
                        ", startTypeName='" + startTypeName + '\'' +
                        ", endId='" + endId + '\'' +
                        ", endName='" + endName + '\'' +
                        ", endTypeName='" + endTypeName + '\'' +
                        ", totalGoodCodeCount=" + totalGoodCodeCount +
                        ", correctGoodCount=" + correctGoodCount +
                        ", suspiciousGoodCount=" + suspiciousGoodCount +
                        ", correctGoods=" + correctGoods +
                        ", suspiciousGoods=" + suspiciousGoods +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "orderDetail=" + orderDetail +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ResponseInfo{" +
                "flag='" + flag + '\'' +
                ", flowCode='" + flowCode + '\'' +
                ", data=" + data +
                '}';
    }
}









