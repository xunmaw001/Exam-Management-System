package com.entity.vo;

import com.entity.TongzhigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 通知公告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-06 09:33:44
 */
public class TongzhigonggaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 摘要
	 */
	
	private String zhaiyao;
		
	/**
	 * 相关附件
	 */
	
	private String xiangguanfujian;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：摘要
	 */
	 
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	
	/**
	 * 获取：摘要
	 */
	public String getZhaiyao() {
		return zhaiyao;
	}
				
	
	/**
	 * 设置：相关附件
	 */
	 
	public void setXiangguanfujian(String xiangguanfujian) {
		this.xiangguanfujian = xiangguanfujian;
	}
	
	/**
	 * 获取：相关附件
	 */
	public String getXiangguanfujian() {
		return xiangguanfujian;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
