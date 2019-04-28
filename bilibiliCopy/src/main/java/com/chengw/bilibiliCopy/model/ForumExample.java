package com.bilibili.main.model;

import java.util.ArrayList;
import java.util.List;

public class ForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
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

        public Criteria andForumIdIsNull() {
            addCriterion("forum_id is null");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("forum_id is not null");
            return (Criteria) this;
        }

        public Criteria andForumIdEqualTo(String value) {
            addCriterion("forum_id =", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotEqualTo(String value) {
            addCriterion("forum_id <>", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThan(String value) {
            addCriterion("forum_id >", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(String value) {
            addCriterion("forum_id >=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThan(String value) {
            addCriterion("forum_id <", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThanOrEqualTo(String value) {
            addCriterion("forum_id <=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLike(String value) {
            addCriterion("forum_id like", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotLike(String value) {
            addCriterion("forum_id not like", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdIn(List<String> values) {
            addCriterion("forum_id in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotIn(List<String> values) {
            addCriterion("forum_id not in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdBetween(String value1, String value2) {
            addCriterion("forum_id between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotBetween(String value1, String value2) {
            addCriterion("forum_id not between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumUserNameIsNull() {
            addCriterion("forum_user_name is null");
            return (Criteria) this;
        }

        public Criteria andForumUserNameIsNotNull() {
            addCriterion("forum_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andForumUserNameEqualTo(String value) {
            addCriterion("forum_user_name =", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameNotEqualTo(String value) {
            addCriterion("forum_user_name <>", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameGreaterThan(String value) {
            addCriterion("forum_user_name >", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("forum_user_name >=", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameLessThan(String value) {
            addCriterion("forum_user_name <", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameLessThanOrEqualTo(String value) {
            addCriterion("forum_user_name <=", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameLike(String value) {
            addCriterion("forum_user_name like", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameNotLike(String value) {
            addCriterion("forum_user_name not like", value, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameIn(List<String> values) {
            addCriterion("forum_user_name in", values, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameNotIn(List<String> values) {
            addCriterion("forum_user_name not in", values, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameBetween(String value1, String value2) {
            addCriterion("forum_user_name between", value1, value2, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumUserNameNotBetween(String value1, String value2) {
            addCriterion("forum_user_name not between", value1, value2, "forumUserName");
            return (Criteria) this;
        }

        public Criteria andForumTimeIsNull() {
            addCriterion("forum_time is null");
            return (Criteria) this;
        }

        public Criteria andForumTimeIsNotNull() {
            addCriterion("forum_time is not null");
            return (Criteria) this;
        }

        public Criteria andForumTimeEqualTo(String value) {
            addCriterion("forum_time =", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotEqualTo(String value) {
            addCriterion("forum_time <>", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeGreaterThan(String value) {
            addCriterion("forum_time >", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeGreaterThanOrEqualTo(String value) {
            addCriterion("forum_time >=", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeLessThan(String value) {
            addCriterion("forum_time <", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeLessThanOrEqualTo(String value) {
            addCriterion("forum_time <=", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeLike(String value) {
            addCriterion("forum_time like", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotLike(String value) {
            addCriterion("forum_time not like", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeIn(List<String> values) {
            addCriterion("forum_time in", values, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotIn(List<String> values) {
            addCriterion("forum_time not in", values, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeBetween(String value1, String value2) {
            addCriterion("forum_time between", value1, value2, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotBetween(String value1, String value2) {
            addCriterion("forum_time not between", value1, value2, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumListIsNull() {
            addCriterion("forum_list is null");
            return (Criteria) this;
        }

        public Criteria andForumListIsNotNull() {
            addCriterion("forum_list is not null");
            return (Criteria) this;
        }

        public Criteria andForumListEqualTo(String value) {
            addCriterion("forum_list =", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListNotEqualTo(String value) {
            addCriterion("forum_list <>", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListGreaterThan(String value) {
            addCriterion("forum_list >", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListGreaterThanOrEqualTo(String value) {
            addCriterion("forum_list >=", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListLessThan(String value) {
            addCriterion("forum_list <", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListLessThanOrEqualTo(String value) {
            addCriterion("forum_list <=", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListLike(String value) {
            addCriterion("forum_list like", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListNotLike(String value) {
            addCriterion("forum_list not like", value, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListIn(List<String> values) {
            addCriterion("forum_list in", values, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListNotIn(List<String> values) {
            addCriterion("forum_list not in", values, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListBetween(String value1, String value2) {
            addCriterion("forum_list between", value1, value2, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumListNotBetween(String value1, String value2) {
            addCriterion("forum_list not between", value1, value2, "forumList");
            return (Criteria) this;
        }

        public Criteria andForumAmountIsNull() {
            addCriterion("forum_amount is null");
            return (Criteria) this;
        }

        public Criteria andForumAmountIsNotNull() {
            addCriterion("forum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andForumAmountEqualTo(String value) {
            addCriterion("forum_amount =", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountNotEqualTo(String value) {
            addCriterion("forum_amount <>", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountGreaterThan(String value) {
            addCriterion("forum_amount >", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountGreaterThanOrEqualTo(String value) {
            addCriterion("forum_amount >=", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountLessThan(String value) {
            addCriterion("forum_amount <", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountLessThanOrEqualTo(String value) {
            addCriterion("forum_amount <=", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountLike(String value) {
            addCriterion("forum_amount like", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountNotLike(String value) {
            addCriterion("forum_amount not like", value, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountIn(List<String> values) {
            addCriterion("forum_amount in", values, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountNotIn(List<String> values) {
            addCriterion("forum_amount not in", values, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountBetween(String value1, String value2) {
            addCriterion("forum_amount between", value1, value2, "forumAmount");
            return (Criteria) this;
        }

        public Criteria andForumAmountNotBetween(String value1, String value2) {
            addCriterion("forum_amount not between", value1, value2, "forumAmount");
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