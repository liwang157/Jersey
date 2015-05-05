/**
* @author liwang
* @date 2015年3月20日 上午11:10:11 
*/
package com.jersey.entity;

import javax.xml.bind.annotation.XmlRootElement;



/** 
 * @Description:
 * @author liwang
 * @date 2015年3月20日 上午11:10:11 
 *  
 */
@XmlRootElement
public class Student {
	private int id;
	private String sname;
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
