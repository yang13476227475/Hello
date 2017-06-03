package com.jbit.entity;

import java.util.Date;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Long id;
	private String goodname;
	private Integer billstatus;
	private Integer goodsdistrict;
	private Integer goodprice;
	private Integer goodscount;
	private Date createtime;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(String goodname, Integer billstatus, Integer goodsdistrict,
			Integer goodprice, Integer goodscount, Date createtime) {
		this.goodname = goodname;
		this.billstatus = billstatus;
		this.goodsdistrict = goodsdistrict;
		this.goodprice = goodprice;
		this.goodscount = goodscount;
		this.createtime = createtime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodname() {
		return this.goodname;
	}

	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}

	public Integer getBillstatus() {
		return this.billstatus;
	}

	public void setBillstatus(Integer billstatus) {
		this.billstatus = billstatus;
	}

	public Integer getGoodsdistrict() {
		return this.goodsdistrict;
	}

	public void setGoodsdistrict(Integer goodsdistrict) {
		this.goodsdistrict = goodsdistrict;
	}

	public Integer getGoodprice() {
		return this.goodprice;
	}

	public void setGoodprice(Integer goodprice) {
		this.goodprice = goodprice;
	}

	public Integer getGoodscount() {
		return this.goodscount;
	}

	public void setGoodscount(Integer goodscount) {
		this.goodscount = goodscount;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}