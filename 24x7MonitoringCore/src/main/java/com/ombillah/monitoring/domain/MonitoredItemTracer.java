package com.ombillah.monitoring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Domain class to represent a method tracer.
 * 
 * @author Oussama M Billah
 * 
 */
@Entity
@Table(name="MONITORED_ITEM_TRACER")
public class MonitoredItemTracer extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column
	private String type;
	
	@Column
	private double average;
	
	@Column
	private double max;
	
	@Column
	private double min;
	
	@Column
	private double count;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;

	public MonitoredItemTracer() {
		// default constructor();
	}
	
	public MonitoredItemTracer(String itemName, String type, double average, double max,
			double min, double count, Date creationDate) {

		this.itemName = itemName;
		this.type = type;
		this.average = average;
		this.max = max;
		this.min = min;
		this.count = count;
		this.creationDate = creationDate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof MonitoredItemTracer)) {
			return false;
		}

		return EqualsBuilder.reflectionEquals(this, object);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.DEFAULT_STYLE);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}