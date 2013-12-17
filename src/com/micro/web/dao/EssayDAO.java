package com.micro.web.dao;

import com.micro.web.entities.Essay;
import com.micro.web.entities.EssayExample;
import java.util.List;

public interface EssayDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essay
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    void insert(Essay record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essay
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    List selectByExample(EssayExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essay
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    List selectByExample(EssayExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table essay
     *
     * @abatorgenerated Sun Mar 24 18:16:18 CST 2013
     */
    int deleteByExample(EssayExample example);
}