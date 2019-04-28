package com.bilibili.main.model;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdIsNull() {
            addCriterion("message_video_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdIsNotNull() {
            addCriterion("message_video_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdEqualTo(String value) {
            addCriterion("message_video_id =", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdNotEqualTo(String value) {
            addCriterion("message_video_id <>", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdGreaterThan(String value) {
            addCriterion("message_video_id >", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_video_id >=", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdLessThan(String value) {
            addCriterion("message_video_id <", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdLessThanOrEqualTo(String value) {
            addCriterion("message_video_id <=", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdLike(String value) {
            addCriterion("message_video_id like", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdNotLike(String value) {
            addCriterion("message_video_id not like", value, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdIn(List<String> values) {
            addCriterion("message_video_id in", values, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdNotIn(List<String> values) {
            addCriterion("message_video_id not in", values, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdBetween(String value1, String value2) {
            addCriterion("message_video_id between", value1, value2, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageVideoIdNotBetween(String value1, String value2) {
            addCriterion("message_video_id not between", value1, value2, "messageVideoId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIsNull() {
            addCriterion("message_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIsNotNull() {
            addCriterion("message_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdEqualTo(String value) {
            addCriterion("message_user_id =", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotEqualTo(String value) {
            addCriterion("message_user_id <>", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThan(String value) {
            addCriterion("message_user_id >", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_id >=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThan(String value) {
            addCriterion("message_user_id <", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThanOrEqualTo(String value) {
            addCriterion("message_user_id <=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLike(String value) {
            addCriterion("message_user_id like", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotLike(String value) {
            addCriterion("message_user_id not like", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIn(List<String> values) {
            addCriterion("message_user_id in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotIn(List<String> values) {
            addCriterion("message_user_id not in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdBetween(String value1, String value2) {
            addCriterion("message_user_id between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotBetween(String value1, String value2) {
            addCriterion("message_user_id not between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameIsNull() {
            addCriterion("message_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameIsNotNull() {
            addCriterion("message_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameEqualTo(String value) {
            addCriterion("message_user_name =", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotEqualTo(String value) {
            addCriterion("message_user_name <>", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameGreaterThan(String value) {
            addCriterion("message_user_name >", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_name >=", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameLessThan(String value) {
            addCriterion("message_user_name <", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameLessThanOrEqualTo(String value) {
            addCriterion("message_user_name <=", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameLike(String value) {
            addCriterion("message_user_name like", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotLike(String value) {
            addCriterion("message_user_name not like", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameIn(List<String> values) {
            addCriterion("message_user_name in", values, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotIn(List<String> values) {
            addCriterion("message_user_name not in", values, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameBetween(String value1, String value2) {
            addCriterion("message_user_name between", value1, value2, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotBetween(String value1, String value2) {
            addCriterion("message_user_name not between", value1, value2, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("message_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("message_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(String value) {
            addCriterion("message_time =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(String value) {
            addCriterion("message_time <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(String value) {
            addCriterion("message_time >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("message_time >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(String value) {
            addCriterion("message_time <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(String value) {
            addCriterion("message_time <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLike(String value) {
            addCriterion("message_time like", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotLike(String value) {
            addCriterion("message_time not like", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<String> values) {
            addCriterion("message_time in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<String> values) {
            addCriterion("message_time not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(String value1, String value2) {
            addCriterion("message_time between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(String value1, String value2) {
            addCriterion("message_time not between", value1, value2, "messageTime");
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