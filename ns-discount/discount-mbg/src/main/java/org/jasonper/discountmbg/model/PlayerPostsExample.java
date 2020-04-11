package org.jasonper.discountmbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerPostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerPostsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdIsNull() {
            addCriterion("player_base_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdIsNotNull() {
            addCriterion("player_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdEqualTo(Long value) {
            addCriterion("player_base_id =", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdNotEqualTo(Long value) {
            addCriterion("player_base_id <>", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdGreaterThan(Long value) {
            addCriterion("player_base_id >", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("player_base_id >=", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdLessThan(Long value) {
            addCriterion("player_base_id <", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdLessThanOrEqualTo(Long value) {
            addCriterion("player_base_id <=", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdIn(List<Long> values) {
            addCriterion("player_base_id in", values, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdNotIn(List<Long> values) {
            addCriterion("player_base_id not in", values, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdBetween(Long value1, Long value2) {
            addCriterion("player_base_id between", value1, value2, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdNotBetween(Long value1, Long value2) {
            addCriterion("player_base_id not between", value1, value2, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdIsNull() {
            addCriterion("game_base_id is null");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdIsNotNull() {
            addCriterion("game_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdEqualTo(Long value) {
            addCriterion("game_base_id =", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdNotEqualTo(Long value) {
            addCriterion("game_base_id <>", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdGreaterThan(Long value) {
            addCriterion("game_base_id >", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("game_base_id >=", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdLessThan(Long value) {
            addCriterion("game_base_id <", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdLessThanOrEqualTo(Long value) {
            addCriterion("game_base_id <=", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdIn(List<Long> values) {
            addCriterion("game_base_id in", values, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdNotIn(List<Long> values) {
            addCriterion("game_base_id not in", values, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdBetween(Long value1, Long value2) {
            addCriterion("game_base_id between", value1, value2, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdNotBetween(Long value1, Long value2) {
            addCriterion("game_base_id not between", value1, value2, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andAddFineIsNull() {
            addCriterion("add_fine is null");
            return (Criteria) this;
        }

        public Criteria andAddFineIsNotNull() {
            addCriterion("add_fine is not null");
            return (Criteria) this;
        }

        public Criteria andAddFineEqualTo(Integer value) {
            addCriterion("add_fine =", value, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineNotEqualTo(Integer value) {
            addCriterion("add_fine <>", value, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineGreaterThan(Integer value) {
            addCriterion("add_fine >", value, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_fine >=", value, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineLessThan(Integer value) {
            addCriterion("add_fine <", value, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineLessThanOrEqualTo(Integer value) {
            addCriterion("add_fine <=", value, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineIn(List<Integer> values) {
            addCriterion("add_fine in", values, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineNotIn(List<Integer> values) {
            addCriterion("add_fine not in", values, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineBetween(Integer value1, Integer value2) {
            addCriterion("add_fine between", value1, value2, "addFine");
            return (Criteria) this;
        }

        public Criteria andAddFineNotBetween(Integer value1, Integer value2) {
            addCriterion("add_fine not between", value1, value2, "addFine");
            return (Criteria) this;
        }

        public Criteria andIsFineIsNull() {
            addCriterion("is_fine is null");
            return (Criteria) this;
        }

        public Criteria andIsFineIsNotNull() {
            addCriterion("is_fine is not null");
            return (Criteria) this;
        }

        public Criteria andIsFineEqualTo(Integer value) {
            addCriterion("is_fine =", value, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineNotEqualTo(Integer value) {
            addCriterion("is_fine <>", value, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineGreaterThan(Integer value) {
            addCriterion("is_fine >", value, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_fine >=", value, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineLessThan(Integer value) {
            addCriterion("is_fine <", value, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineLessThanOrEqualTo(Integer value) {
            addCriterion("is_fine <=", value, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineIn(List<Integer> values) {
            addCriterion("is_fine in", values, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineNotIn(List<Integer> values) {
            addCriterion("is_fine not in", values, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineBetween(Integer value1, Integer value2) {
            addCriterion("is_fine between", value1, value2, "isFine");
            return (Criteria) this;
        }

        public Criteria andIsFineNotBetween(Integer value1, Integer value2) {
            addCriterion("is_fine not between", value1, value2, "isFine");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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