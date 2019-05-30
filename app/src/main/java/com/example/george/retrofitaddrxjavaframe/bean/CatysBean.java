package com.example.george.retrofitaddrxjavaframe.bean;

import java.util.List;

public class CatysBean {

    /**
     * reason : 查询成功
     * result : [{"id":"1111","province_id":"16","city_name":"宝应"},{"id":"1112","province_id":"16","city_name":"滨海"},{"id":"1113","province_id":"16","city_name":"常熟"},{"id":"1114","province_id":"16","city_name":"常州"},{"id":"1115","province_id":"16","city_name":"大丰"},{"id":"1116","province_id":"16","city_name":"丹阳"},{"id":"1117","province_id":"16","city_name":"东海"},{"id":"1118","province_id":"16","city_name":"东台"},{"id":"1119","province_id":"16","city_name":"丰县"},{"id":"1120","province_id":"16","city_name":"阜宁"},{"id":"1121","province_id":"16","city_name":"赣榆"},{"id":"1122","province_id":"16","city_name":"高淳"},{"id":"1123","province_id":"16","city_name":"高邮"},{"id":"1124","province_id":"16","city_name":"灌南"},{"id":"1125","province_id":"16","city_name":"灌云"},{"id":"1126","province_id":"16","city_name":"海安"},{"id":"1127","province_id":"16","city_name":"海门"},{"id":"1128","province_id":"16","city_name":"洪泽"},{"id":"1129","province_id":"16","city_name":"淮安"},{"id":"1130","province_id":"16","city_name":"建湖"},{"id":"1131","province_id":"16","city_name":"江都"},{"id":"1132","province_id":"16","city_name":"江宁"},{"id":"1133","province_id":"16","city_name":"江阴"},{"id":"1134","province_id":"16","city_name":"姜堰"},{"id":"1135","province_id":"16","city_name":"金湖"},{"id":"1136","province_id":"16","city_name":"金坛"},{"id":"1137","province_id":"16","city_name":"靖江"},{"id":"1138","province_id":"16","city_name":"句容"},{"id":"1139","province_id":"16","city_name":"昆山"},{"id":"1140","province_id":"16","city_name":"溧水"},{"id":"1141","province_id":"16","city_name":"溧阳"},{"id":"1142","province_id":"16","city_name":"连云港"},{"id":"1143","province_id":"16","city_name":"涟水"},{"id":"1144","province_id":"16","city_name":"六合"},{"id":"1145","province_id":"16","city_name":"南京"},{"id":"1146","province_id":"16","city_name":"南通"},{"id":"1147","province_id":"16","city_name":"沛县"},{"id":"1148","province_id":"16","city_name":"邳州"},{"id":"1149","province_id":"16","city_name":"浦口"},{"id":"1150","province_id":"16","city_name":"启东"},{"id":"1151","province_id":"16","city_name":"如东"},{"id":"1152","province_id":"16","city_name":"如皋"},{"id":"1153","province_id":"16","city_name":"射阳"},{"id":"1154","province_id":"16","city_name":"沭阳"},{"id":"1155","province_id":"16","city_name":"泗洪"},{"id":"1156","province_id":"16","city_name":"泗阳"},{"id":"1157","province_id":"16","city_name":"苏州"},{"id":"1158","province_id":"16","city_name":"宿迁"},{"id":"1159","province_id":"16","city_name":"睢宁"},{"id":"1160","province_id":"16","city_name":"太仓"},{"id":"1161","province_id":"16","city_name":"泰兴"},{"id":"1162","province_id":"16","city_name":"泰州"},{"id":"1163","province_id":"16","city_name":"无锡"},{"id":"1164","province_id":"16","city_name":"吴江"},{"id":"1165","province_id":"16","city_name":"响水"},{"id":"1166","province_id":"16","city_name":"新沂"},{"id":"1167","province_id":"16","city_name":"兴化"},{"id":"1168","province_id":"16","city_name":"盱眙"},{"id":"1169","province_id":"16","city_name":"徐州"},{"id":"1170","province_id":"16","city_name":"盐城"},{"id":"1171","province_id":"16","city_name":"扬中"},{"id":"1172","province_id":"16","city_name":"扬州"},{"id":"1173","province_id":"16","city_name":"仪征"},{"id":"1174","province_id":"16","city_name":"宜兴"},{"id":"1175","province_id":"16","city_name":"张家港"},{"id":"1176","province_id":"16","city_name":"镇江"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 1111
         * province_id : 16
         * city_name : 宝应
         */

        private String id;
        private String province_id;
        private String city_name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getProvince_id() {
            return province_id;
        }

        public void setProvince_id(String province_id) {
            this.province_id = province_id;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }
    }
}
