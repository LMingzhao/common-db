package com.common.dao.dbmain.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DefDataSourcePOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DefDataSourcePOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDataSoureceKeyIsNull() {
            addCriterion("data_sourece_key is null");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyIsNotNull() {
            addCriterion("data_sourece_key is not null");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyEqualTo(String value) {
            addCriterion("data_sourece_key =", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyNotEqualTo(String value) {
            addCriterion("data_sourece_key <>", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyGreaterThan(String value) {
            addCriterion("data_sourece_key >", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("data_sourece_key >=", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyLessThan(String value) {
            addCriterion("data_sourece_key <", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyLessThanOrEqualTo(String value) {
            addCriterion("data_sourece_key <=", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyLike(String value) {
            addCriterion("data_sourece_key like", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyNotLike(String value) {
            addCriterion("data_sourece_key not like", value, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyIn(List<String> values) {
            addCriterion("data_sourece_key in", values, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyNotIn(List<String> values) {
            addCriterion("data_sourece_key not in", values, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyBetween(String value1, String value2) {
            addCriterion("data_sourece_key between", value1, value2, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andDataSoureceKeyNotBetween(String value1, String value2) {
            addCriterion("data_sourece_key not between", value1, value2, "dataSoureceKey");
            return (Criteria) this;
        }

        public Criteria andIntialSizeIsNull() {
            addCriterion("intial_size is null");
            return (Criteria) this;
        }

        public Criteria andIntialSizeIsNotNull() {
            addCriterion("intial_size is not null");
            return (Criteria) this;
        }

        public Criteria andIntialSizeEqualTo(Integer value) {
            addCriterion("intial_size =", value, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeNotEqualTo(Integer value) {
            addCriterion("intial_size <>", value, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeGreaterThan(Integer value) {
            addCriterion("intial_size >", value, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("intial_size >=", value, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeLessThan(Integer value) {
            addCriterion("intial_size <", value, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeLessThanOrEqualTo(Integer value) {
            addCriterion("intial_size <=", value, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeIn(List<Integer> values) {
            addCriterion("intial_size in", values, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeNotIn(List<Integer> values) {
            addCriterion("intial_size not in", values, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeBetween(Integer value1, Integer value2) {
            addCriterion("intial_size between", value1, value2, "intialSize");
            return (Criteria) this;
        }

        public Criteria andIntialSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("intial_size not between", value1, value2, "intialSize");
            return (Criteria) this;
        }

        public Criteria andMaxActiveIsNull() {
            addCriterion("max_active is null");
            return (Criteria) this;
        }

        public Criteria andMaxActiveIsNotNull() {
            addCriterion("max_active is not null");
            return (Criteria) this;
        }

        public Criteria andMaxActiveEqualTo(Integer value) {
            addCriterion("max_active =", value, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveNotEqualTo(Integer value) {
            addCriterion("max_active <>", value, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveGreaterThan(Integer value) {
            addCriterion("max_active >", value, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_active >=", value, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveLessThan(Integer value) {
            addCriterion("max_active <", value, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveLessThanOrEqualTo(Integer value) {
            addCriterion("max_active <=", value, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveIn(List<Integer> values) {
            addCriterion("max_active in", values, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveNotIn(List<Integer> values) {
            addCriterion("max_active not in", values, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveBetween(Integer value1, Integer value2) {
            addCriterion("max_active between", value1, value2, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("max_active not between", value1, value2, "maxActive");
            return (Criteria) this;
        }

        public Criteria andMaxIdleIsNull() {
            addCriterion("max_idle is null");
            return (Criteria) this;
        }

        public Criteria andMaxIdleIsNotNull() {
            addCriterion("max_idle is not null");
            return (Criteria) this;
        }

        public Criteria andMaxIdleEqualTo(Integer value) {
            addCriterion("max_idle =", value, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleNotEqualTo(Integer value) {
            addCriterion("max_idle <>", value, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleGreaterThan(Integer value) {
            addCriterion("max_idle >", value, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_idle >=", value, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleLessThan(Integer value) {
            addCriterion("max_idle <", value, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleLessThanOrEqualTo(Integer value) {
            addCriterion("max_idle <=", value, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleIn(List<Integer> values) {
            addCriterion("max_idle in", values, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleNotIn(List<Integer> values) {
            addCriterion("max_idle not in", values, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleBetween(Integer value1, Integer value2) {
            addCriterion("max_idle between", value1, value2, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andMaxIdleNotBetween(Integer value1, Integer value2) {
            addCriterion("max_idle not between", value1, value2, "maxIdle");
            return (Criteria) this;
        }

        public Criteria andDriverClassIsNull() {
            addCriterion("driver_class is null");
            return (Criteria) this;
        }

        public Criteria andDriverClassIsNotNull() {
            addCriterion("driver_class is not null");
            return (Criteria) this;
        }

        public Criteria andDriverClassEqualTo(String value) {
            addCriterion("driver_class =", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassNotEqualTo(String value) {
            addCriterion("driver_class <>", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassGreaterThan(String value) {
            addCriterion("driver_class >", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassGreaterThanOrEqualTo(String value) {
            addCriterion("driver_class >=", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassLessThan(String value) {
            addCriterion("driver_class <", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassLessThanOrEqualTo(String value) {
            addCriterion("driver_class <=", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassLike(String value) {
            addCriterion("driver_class like", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassNotLike(String value) {
            addCriterion("driver_class not like", value, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassIn(List<String> values) {
            addCriterion("driver_class in", values, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassNotIn(List<String> values) {
            addCriterion("driver_class not in", values, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassBetween(String value1, String value2) {
            addCriterion("driver_class between", value1, value2, "driverClass");
            return (Criteria) this;
        }

        public Criteria andDriverClassNotBetween(String value1, String value2) {
            addCriterion("driver_class not between", value1, value2, "driverClass");
            return (Criteria) this;
        }

        public Criteria andConnectUrlIsNull() {
            addCriterion("connect_url is null");
            return (Criteria) this;
        }

        public Criteria andConnectUrlIsNotNull() {
            addCriterion("connect_url is not null");
            return (Criteria) this;
        }

        public Criteria andConnectUrlEqualTo(String value) {
            addCriterion("connect_url =", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotEqualTo(String value) {
            addCriterion("connect_url <>", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlGreaterThan(String value) {
            addCriterion("connect_url >", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("connect_url >=", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlLessThan(String value) {
            addCriterion("connect_url <", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlLessThanOrEqualTo(String value) {
            addCriterion("connect_url <=", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlLike(String value) {
            addCriterion("connect_url like", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotLike(String value) {
            addCriterion("connect_url not like", value, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlIn(List<String> values) {
            addCriterion("connect_url in", values, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotIn(List<String> values) {
            addCriterion("connect_url not in", values, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlBetween(String value1, String value2) {
            addCriterion("connect_url between", value1, value2, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andConnectUrlNotBetween(String value1, String value2) {
            addCriterion("connect_url not between", value1, value2, "connectUrl");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}