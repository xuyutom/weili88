package cn.taiqiu8.dao;

import cn.taiqiu8.model.UserCustomer;
import cn.taiqiu8.model.UserCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int countByExample(UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int deleteByExample(UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int insert(UserCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int insertSelective(UserCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    List<UserCustomer> selectByExample(UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    UserCustomer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserCustomer record, @Param("example") UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserCustomer record, @Param("example") UserCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_customer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserCustomer record);
}