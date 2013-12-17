package com.micro.web.dao.impl;

import com.micro.web.dao.EssaycommentsDAO;
import com.micro.web.entities.Essaycomments;
import com.micro.web.entities.EssaycommentsExample;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class EssaycommentsDAOImpl extends BaseDao implements EssaycommentsDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public EssaycommentsDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public void insert(Essaycomments record) {
        getSqlMapClientTemplate().insert("essaycomments.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public int updateByPrimaryKey(Essaycomments record) {
        int rows = getSqlMapClientTemplate().update("essaycomments.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public int updateByPrimaryKeySelective(Essaycomments record) {
        int rows = getSqlMapClientTemplate().update("essaycomments.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public List selectByExample(EssaycommentsExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("essaycomments.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public List selectByExample(EssaycommentsExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public Essaycomments selectByPrimaryKey(String essaycommentsid) {
        Essaycomments key = new Essaycomments();
        key.setEssaycommentsid(essaycommentsid);
        Essaycomments record = (Essaycomments) getSqlMapClientTemplate().queryForObject("essaycomments.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public int deleteByExample(EssaycommentsExample example) {
        int rows = getSqlMapClientTemplate().delete("essaycomments.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    public int deleteByPrimaryKey(String essaycommentsid) {
        Essaycomments key = new Essaycomments();
        key.setEssaycommentsid(essaycommentsid);
        int rows = getSqlMapClientTemplate().delete("essaycomments.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getessayCommentsIdExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        switch (example.getEssaycommentsid_Indicator()) {
        case EssaycommentsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_NULL", "Y");
            } else {
                parms.put("AND_essayCommentsId_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_NOT_NULL", "Y");
            } else {
                parms.put("AND_essayCommentsId_NOT_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_EQUALS", "Y");
            } else {
                parms.put("AND_essayCommentsId_EQUALS", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        case EssaycommentsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_essayCommentsId_NOT_EQUALS", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_GT", "Y");
            } else {
                parms.put("AND_essayCommentsId_GT", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_GE", "Y");
            } else {
                parms.put("AND_essayCommentsId_GE", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_LT", "Y");
            } else {
                parms.put("AND_essayCommentsId_LT", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_LE", "Y");
            } else {
                parms.put("AND_essayCommentsId_LE", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        case EssaycommentsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayCommentsId_LIKE", "Y");
            } else {
                parms.put("AND_essayCommentsId_LIKE", "Y");
            }
            parms.put("essaycommentsid", example.getEssaycommentsid());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getuserIdExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        switch (example.getUserid_Indicator()) {
        case EssaycommentsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_NULL", "Y");
            } else {
                parms.put("AND_userId_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_NOT_NULL", "Y");
            } else {
                parms.put("AND_userId_NOT_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_EQUALS", "Y");
            } else {
                parms.put("AND_userId_EQUALS", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case EssaycommentsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_userId_NOT_EQUALS", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_GT", "Y");
            } else {
                parms.put("AND_userId_GT", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_GE", "Y");
            } else {
                parms.put("AND_userId_GE", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_LT", "Y");
            } else {
                parms.put("AND_userId_LT", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_LE", "Y");
            } else {
                parms.put("AND_userId_LE", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        case EssaycommentsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_userId_LIKE", "Y");
            } else {
                parms.put("AND_userId_LIKE", "Y");
            }
            parms.put("userid", example.getUserid());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getessayComments_essayIdExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        switch (example.getEssaycommentsEssayid_Indicator()) {
        case EssaycommentsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_NULL", "Y");
            } else {
                parms.put("AND_essayComments_essayId_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_NOT_NULL", "Y");
            } else {
                parms.put("AND_essayComments_essayId_NOT_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_EQUALS", "Y");
            } else {
                parms.put("AND_essayComments_essayId_EQUALS", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        case EssaycommentsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_essayComments_essayId_NOT_EQUALS", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_GT", "Y");
            } else {
                parms.put("AND_essayComments_essayId_GT", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_GE", "Y");
            } else {
                parms.put("AND_essayComments_essayId_GE", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_LT", "Y");
            } else {
                parms.put("AND_essayComments_essayId_LT", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_LE", "Y");
            } else {
                parms.put("AND_essayComments_essayId_LE", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        case EssaycommentsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_essayId_LIKE", "Y");
            } else {
                parms.put("AND_essayComments_essayId_LIKE", "Y");
            }
            parms.put("essaycommentsEssayid", example.getEssaycommentsEssayid());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getessayComments_userIdExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        switch (example.getEssaycommentsUserid_Indicator()) {
        case EssaycommentsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_NULL", "Y");
            } else {
                parms.put("AND_essayComments_userId_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_NOT_NULL", "Y");
            } else {
                parms.put("AND_essayComments_userId_NOT_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_EQUALS", "Y");
            } else {
                parms.put("AND_essayComments_userId_EQUALS", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        case EssaycommentsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_essayComments_userId_NOT_EQUALS", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_GT", "Y");
            } else {
                parms.put("AND_essayComments_userId_GT", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_GE", "Y");
            } else {
                parms.put("AND_essayComments_userId_GE", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_LT", "Y");
            } else {
                parms.put("AND_essayComments_userId_LT", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_LE", "Y");
            } else {
                parms.put("AND_essayComments_userId_LE", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        case EssaycommentsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_essayComments_userId_LIKE", "Y");
            } else {
                parms.put("AND_essayComments_userId_LIKE", "Y");
            }
            parms.put("essaycommentsUserid", example.getEssaycommentsUserid());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getcontentExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        switch (example.getContent_Indicator()) {
        case EssaycommentsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_NULL", "Y");
            } else {
                parms.put("AND_content_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_NOT_NULL", "Y");
            } else {
                parms.put("AND_content_NOT_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_EQUALS", "Y");
            } else {
                parms.put("AND_content_EQUALS", "Y");
            }
            parms.put("content", example.getContent());
            break;
        case EssaycommentsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_content_NOT_EQUALS", "Y");
            }
            parms.put("content", example.getContent());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_GT", "Y");
            } else {
                parms.put("AND_content_GT", "Y");
            }
            parms.put("content", example.getContent());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_GE", "Y");
            } else {
                parms.put("AND_content_GE", "Y");
            }
            parms.put("content", example.getContent());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_LT", "Y");
            } else {
                parms.put("AND_content_LT", "Y");
            }
            parms.put("content", example.getContent());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_LE", "Y");
            } else {
                parms.put("AND_content_LE", "Y");
            }
            parms.put("content", example.getContent());
            break;
        case EssaycommentsExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_content_LIKE", "Y");
            } else {
                parms.put("AND_content_LIKE", "Y");
            }
            parms.put("content", example.getContent());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getregisterTimeExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        switch (example.getRegistertime_Indicator()) {
        case EssaycommentsExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_NULL", "Y");
            } else {
                parms.put("AND_registerTime_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_NOT_NULL", "Y");
            } else {
                parms.put("AND_registerTime_NOT_NULL", "Y");
            }
            break;
        case EssaycommentsExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_EQUALS", "Y");
            } else {
                parms.put("AND_registerTime_EQUALS", "Y");
            }
            parms.put("registertime", example.getRegistertime());
            break;
        case EssaycommentsExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_registerTime_NOT_EQUALS", "Y");
            }
            parms.put("registertime", example.getRegistertime());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_GT", "Y");
            } else {
                parms.put("AND_registerTime_GT", "Y");
            }
            parms.put("registertime", example.getRegistertime());
            break;
        case EssaycommentsExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_GE", "Y");
            } else {
                parms.put("AND_registerTime_GE", "Y");
            }
            parms.put("registertime", example.getRegistertime());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_LT", "Y");
            } else {
                parms.put("AND_registerTime_LT", "Y");
            }
            parms.put("registertime", example.getRegistertime());
            break;
        case EssaycommentsExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_registerTime_LE", "Y");
            } else {
                parms.put("AND_registerTime_LE", "Y");
            }
            parms.put("registertime", example.getRegistertime());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essaycomments
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    private Map getExampleParms(EssaycommentsExample example) {
        Map parms = new HashMap();
        parms.putAll(getessayCommentsIdExampleParms(example));
        parms.putAll(getuserIdExampleParms(example));
        parms.putAll(getessayComments_essayIdExampleParms(example));
        parms.putAll(getessayComments_userIdExampleParms(example));
        parms.putAll(getcontentExampleParms(example));
        parms.putAll(getregisterTimeExampleParms(example));
        return parms;
    }
}