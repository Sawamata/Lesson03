package com.seiken_soft.dao;

import com.seiken_soft.lesson03.entity.TDuty;
import com.seiken_soft.lesson03.entity.TDutyExample;
import com.seiken_soft.lesson03.entity.TDutyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDutyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    long countByExample(TDutyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int deleteByExample(TDutyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int deleteByPrimaryKey(TDutyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int insert(TDuty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int insertSelective(TDuty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    List<TDuty> selectByExample(TDutyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    TDuty selectByPrimaryKey(TDutyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int updateByExampleSelective(@Param("record") TDuty record, @Param("example") TDutyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int updateByExample(@Param("record") TDuty record, @Param("example") TDutyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int updateByPrimaryKeySelective(TDuty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Mon Feb 07 23:04:39 GMT+09:00 2022
     */
    int updateByPrimaryKey(TDuty record);
}