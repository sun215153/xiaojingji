package com.micro.web.dao.impl;

import com.micro.web.dao.UserDAO;
import com.micro.web.entities.User;
import com.micro.web.entities.UserExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl extends BaseDao implements UserDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public UserDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public void insert(User record) {
        getSqlMapClientTemplate().insert("user.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public int updateByPrimaryKey(User record) {
        int rows = getSqlMapClientTemplate().update("user.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public int updateByPrimaryKeySelective(User record) {
        int rows = getSqlMapClientTemplate().update("user.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public List selectByExample(UserExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("user.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public List selectByExample(UserExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public User selectByPrimaryKey(Long userid) {
        User key = new User();
        key.setUserid(userid);
        User record = (User) getSqlMapClientTemplate().queryForObject("user.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public int deleteByExample(UserExample example) {
        int rows = getSqlMapClientTemplate().delete("user.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    public int deleteByPrimaryKey(Long userid) {
        User key = new User();
        key.setUserid(userid);
        int rows = getSqlMapClientTemplate().delete("user.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getuseridExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getUserid_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_NULL", "Y");
            } else {
                parms.put("AND_userid_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_NOT_NULL", "Y");
            } else {
                parms.put("AND_userid_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_EQUALS", "Y");
            } else {
                parms.put("AND_userid_EQUALS", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_userid_NOT_EQUALS", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_GT", "Y");
            } else {
                parms.put("AND_userid_GT", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_GE", "Y");
            } else {
                parms.put("AND_userid_GE", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_LT", "Y");
            } else {
                parms.put("AND_userid_LT", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userid_LE", "Y");
            } else {
                parms.put("AND_userid_LE", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getusernameExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getUsername_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_NULL", "Y");
            } else {
                parms.put("AND_username_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_NOT_NULL", "Y");
            } else {
                parms.put("AND_username_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_EQUALS", "Y");
            } else {
                parms.put("AND_username_EQUALS", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_username_NOT_EQUALS", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_GT", "Y");
            } else {
                parms.put("AND_username_GT", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_GE", "Y");
            } else {
                parms.put("AND_username_GE", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_LT", "Y");
            } else {
                parms.put("AND_username_LT", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_LE", "Y");
            } else {
                parms.put("AND_username_LE", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        case UserExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_username_LIKE", "Y");
            } else {
                parms.put("AND_username_LIKE", "Y");
            }
            parms.put("username", example.getUsername());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getpasswordExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getPassword_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_NULL", "Y");
            } else {
                parms.put("AND_password_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_NOT_NULL", "Y");
            } else {
                parms.put("AND_password_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_EQUALS", "Y");
            } else {
                parms.put("AND_password_EQUALS", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_password_NOT_EQUALS", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_GT", "Y");
            } else {
                parms.put("AND_password_GT", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_GE", "Y");
            } else {
                parms.put("AND_password_GE", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_LT", "Y");
            } else {
                parms.put("AND_password_LT", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_LE", "Y");
            } else {
                parms.put("AND_password_LE", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        case UserExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_password_LIKE", "Y");
            } else {
                parms.put("AND_password_LIKE", "Y");
            }
            parms.put("password", example.getPassword());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getemailExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getEmail_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_NULL", "Y");
            } else {
                parms.put("AND_email_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_NOT_NULL", "Y");
            } else {
                parms.put("AND_email_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_EQUALS", "Y");
            } else {
                parms.put("AND_email_EQUALS", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_email_NOT_EQUALS", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_GT", "Y");
            } else {
                parms.put("AND_email_GT", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_GE", "Y");
            } else {
                parms.put("AND_email_GE", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_LT", "Y");
            } else {
                parms.put("AND_email_LT", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_LE", "Y");
            } else {
                parms.put("AND_email_LE", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        case UserExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_email_LIKE", "Y");
            } else {
                parms.put("AND_email_LIKE", "Y");
            }
            parms.put("email", example.getEmail());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getusertypeExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getUsertype_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_NULL", "Y");
            } else {
                parms.put("AND_usertype_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_NOT_NULL", "Y");
            } else {
                parms.put("AND_usertype_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_EQUALS", "Y");
            } else {
                parms.put("AND_usertype_EQUALS", "Y");
            }
            parms.put("usertype", example.getUsertype());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_usertype_NOT_EQUALS", "Y");
            }
            parms.put("usertype", example.getUsertype());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_GT", "Y");
            } else {
                parms.put("AND_usertype_GT", "Y");
            }
            parms.put("usertype", example.getUsertype());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_GE", "Y");
            } else {
                parms.put("AND_usertype_GE", "Y");
            }
            parms.put("usertype", example.getUsertype());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_LT", "Y");
            } else {
                parms.put("AND_usertype_LT", "Y");
            }
            parms.put("usertype", example.getUsertype());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_usertype_LE", "Y");
            } else {
                parms.put("AND_usertype_LE", "Y");
            }
            parms.put("usertype", example.getUsertype());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getphoneExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getPhone_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_NULL", "Y");
            } else {
                parms.put("AND_phone_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_NOT_NULL", "Y");
            } else {
                parms.put("AND_phone_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_EQUALS", "Y");
            } else {
                parms.put("AND_phone_EQUALS", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_phone_NOT_EQUALS", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_GT", "Y");
            } else {
                parms.put("AND_phone_GT", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_GE", "Y");
            } else {
                parms.put("AND_phone_GE", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_LT", "Y");
            } else {
                parms.put("AND_phone_LT", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_LE", "Y");
            } else {
                parms.put("AND_phone_LE", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        case UserExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_phone_LIKE", "Y");
            } else {
                parms.put("AND_phone_LIKE", "Y");
            }
            parms.put("phone", example.getPhone());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getinsert_timeExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getInsertTime_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_NULL", "Y");
            } else {
                parms.put("AND_insert_time_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_NOT_NULL", "Y");
            } else {
                parms.put("AND_insert_time_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_EQUALS", "Y");
            } else {
                parms.put("AND_insert_time_EQUALS", "Y");
            }
            parms.put("insertTime", example.getInsertTime());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_insert_time_NOT_EQUALS", "Y");
            }
            parms.put("insertTime", example.getInsertTime());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_GT", "Y");
            } else {
                parms.put("AND_insert_time_GT", "Y");
            }
            parms.put("insertTime", example.getInsertTime());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_GE", "Y");
            } else {
                parms.put("AND_insert_time_GE", "Y");
            }
            parms.put("insertTime", example.getInsertTime());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_LT", "Y");
            } else {
                parms.put("AND_insert_time_LT", "Y");
            }
            parms.put("insertTime", example.getInsertTime());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_insert_time_LE", "Y");
            } else {
                parms.put("AND_insert_time_LE", "Y");
            }
            parms.put("insertTime", example.getInsertTime());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getupdate_timeExampleParms(UserExample example) {
        Map parms = new HashMap();
        switch (example.getUpdateTime_Indicator()) {
        case UserExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_NULL", "Y");
            } else {
                parms.put("AND_update_time_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_NOT_NULL", "Y");
            } else {
                parms.put("AND_update_time_NOT_NULL", "Y");
            }
            break;
        case UserExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_EQUALS", "Y");
            } else {
                parms.put("AND_update_time_EQUALS", "Y");
            }
            parms.put("updateTime", example.getUpdateTime());
            break;
        case UserExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_update_time_NOT_EQUALS", "Y");
            }
            parms.put("updateTime", example.getUpdateTime());
            break;
        case UserExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_GT", "Y");
            } else {
                parms.put("AND_update_time_GT", "Y");
            }
            parms.put("updateTime", example.getUpdateTime());
            break;
        case UserExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_GE", "Y");
            } else {
                parms.put("AND_update_time_GE", "Y");
            }
            parms.put("updateTime", example.getUpdateTime());
            break;
        case UserExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_LT", "Y");
            } else {
                parms.put("AND_update_time_LT", "Y");
            }
            parms.put("updateTime", example.getUpdateTime());
            break;
        case UserExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_update_time_LE", "Y");
            } else {
                parms.put("AND_update_time_LE", "Y");
            }
            parms.put("updateTime", example.getUpdateTime());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user
     *
     * @abatorgenerated Fri Dec 20 11:10:55 CST 2013
     */
    private Map getExampleParms(UserExample example) {
        Map parms = new HashMap();
        parms.putAll(getuseridExampleParms(example));
        parms.putAll(getusernameExampleParms(example));
        parms.putAll(getpasswordExampleParms(example));
        parms.putAll(getemailExampleParms(example));
        parms.putAll(getusertypeExampleParms(example));
        parms.putAll(getphoneExampleParms(example));
        parms.putAll(getinsert_timeExampleParms(example));
        parms.putAll(getupdate_timeExampleParms(example));
        return parms;
    }

	@Override
	public User selectByUserName(String username, String password) {
		User key = new User();
		key.setUsername(username);
		key.setPassword(password);
		User record = (User) getSqlMapClientTemplate().queryForObject("user.selectByUserName", key);
		return record;
	}
}