package com.uestc.domain;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.id
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.name
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.gender
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.telephone
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customer.address
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.id
     *
     * @return the value of t_customer.id
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.id
     *
     * @param id the value for t_customer.id
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.name
     *
     * @return the value of t_customer.name
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.name
     *
     * @param name the value for t_customer.name
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.gender
     *
     * @return the value of t_customer.gender
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.gender
     *
     * @param gender the value for t_customer.gender
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.telephone
     *
     * @return the value of t_customer.telephone
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.telephone
     *
     * @param telephone the value for t_customer.telephone
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customer.address
     *
     * @return the value of t_customer.address
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customer.address
     *
     * @param address the value for t_customer.address
     *
     * @mbg.generated Mon Dec 16 21:36:48 GMT+08:00 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}