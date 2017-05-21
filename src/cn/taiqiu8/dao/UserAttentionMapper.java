package cn.taiqiu8.dao;

import cn.taiqiu8.model.UserAttention;
import cn.taiqiu8.model.UserAttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttentionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int countByExample(UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int deleteByExample(UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int insert(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int insertSelective(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    List<UserAttention> selectByExample(UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    UserAttention selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserAttention record, @Param("example") UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserAttention record, @Param("example") UserAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_attention
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserAttention record);
}