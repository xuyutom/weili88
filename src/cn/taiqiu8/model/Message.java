package cn.taiqiu8.model;

import java.util.Date;

public class Message {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.sender
     *
     * @mbggenerated
     */
    private Integer sender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.receiver
     *
     * @mbggenerated
     */
    private Integer receiver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.send_time
     *
     * @mbggenerated
     */
    private Date sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.read_time
     *
     * @mbggenerated
     */
    private Date readTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public Message(Integer id, Integer type, String title, String content, Integer sender, Integer receiver, Date sendTime, Date readTime, Short status) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
        this.sendTime = sendTime;
        this.readTime = readTime;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public Message() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.id
     *
     * @return the value of message.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.id
     *
     * @param id the value for message.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.type
     *
     * @return the value of message.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.type
     *
     * @param type the value for message.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.title
     *
     * @return the value of message.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.title
     *
     * @param title the value for message.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.content
     *
     * @return the value of message.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.content
     *
     * @param content the value for message.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.sender
     *
     * @return the value of message.sender
     *
     * @mbggenerated
     */
    public Integer getSender() {
        return sender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.sender
     *
     * @param sender the value for message.sender
     *
     * @mbggenerated
     */
    public void setSender(Integer sender) {
        this.sender = sender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.receiver
     *
     * @return the value of message.receiver
     *
     * @mbggenerated
     */
    public Integer getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.receiver
     *
     * @param receiver the value for message.receiver
     *
     * @mbggenerated
     */
    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.send_time
     *
     * @return the value of message.send_time
     *
     * @mbggenerated
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.send_time
     *
     * @param sendTime the value for message.send_time
     *
     * @mbggenerated
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.read_time
     *
     * @return the value of message.read_time
     *
     * @mbggenerated
     */
    public Date getReadTime() {
        return readTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.read_time
     *
     * @param readTime the value for message.read_time
     *
     * @mbggenerated
     */
    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.status
     *
     * @return the value of message.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.status
     *
     * @param status the value for message.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}