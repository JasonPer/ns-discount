package org.jasonper.discountmbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerReplysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerReplysExample() {
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

        public Criteria andPlayerCommentIdIsNull() {
            addCriterion("player_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdIsNotNull() {
            addCriterion("player_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdEqualTo(Long value) {
            addCriterion("player_comment_id =", value, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdNotEqualTo(Long value) {
            addCriterion("player_comment_id <>", value, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdGreaterThan(Long value) {
            addCriterion("player_comment_id >", value, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("player_comment_id >=", value, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdLessThan(Long value) {
            addCriterion("player_comment_id <", value, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("player_comment_id <=", value, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdIn(List<Long> values) {
            addCriterion("player_comment_id in", values, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdNotIn(List<Long> values) {
            addCriterion("player_comment_id not in", values, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdBetween(Long value1, Long value2) {
            addCriterion("player_comment_id between", value1, value2, "playerCommentId");
            return (Criteria) this;
        }

        public Criteria andPlayerCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("player_comment_id not between", value1, value2, "playerCommentId");
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Long value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Long value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Long value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Long value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Long> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Long> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Long value1, Long value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdIsNull() {
            addCriterion("from_player_id is null");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdIsNotNull() {
            addCriterion("from_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdEqualTo(Long value) {
            addCriterion("from_player_id =", value, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdNotEqualTo(Long value) {
            addCriterion("from_player_id <>", value, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdGreaterThan(Long value) {
            addCriterion("from_player_id >", value, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("from_player_id >=", value, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdLessThan(Long value) {
            addCriterion("from_player_id <", value, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdLessThanOrEqualTo(Long value) {
            addCriterion("from_player_id <=", value, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdIn(List<Long> values) {
            addCriterion("from_player_id in", values, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdNotIn(List<Long> values) {
            addCriterion("from_player_id not in", values, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdBetween(Long value1, Long value2) {
            addCriterion("from_player_id between", value1, value2, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andFromPlayerIdNotBetween(Long value1, Long value2) {
            addCriterion("from_player_id not between", value1, value2, "fromPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdIsNull() {
            addCriterion("to_player_id is null");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdIsNotNull() {
            addCriterion("to_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdEqualTo(Long value) {
            addCriterion("to_player_id =", value, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdNotEqualTo(Long value) {
            addCriterion("to_player_id <>", value, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdGreaterThan(Long value) {
            addCriterion("to_player_id >", value, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("to_player_id >=", value, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdLessThan(Long value) {
            addCriterion("to_player_id <", value, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdLessThanOrEqualTo(Long value) {
            addCriterion("to_player_id <=", value, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdIn(List<Long> values) {
            addCriterion("to_player_id in", values, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdNotIn(List<Long> values) {
            addCriterion("to_player_id not in", values, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdBetween(Long value1, Long value2) {
            addCriterion("to_player_id between", value1, value2, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andToPlayerIdNotBetween(Long value1, Long value2) {
            addCriterion("to_player_id not between", value1, value2, "toPlayerId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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