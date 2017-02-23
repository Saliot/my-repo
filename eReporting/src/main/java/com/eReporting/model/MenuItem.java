package com.eReporting.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ER_MENUITEM")
public class MenuItem {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="MENUITEMKEY",unique = true, nullable = false)
	private Long menuitemKey;
	
	@Column (name="MENUITEMDESCRIPTION",nullable = false,length=30)
	private String menuitemDescription;
	
	@Column (name="MENUITEMPATH",nullable = true,length=255)
	private String menuitemPath ;
	
	@Column (name="MENUITEMICON",nullable = true,length=255)
	private String menuitemIcon;
	
	@Column (name="MENUITEMORDER")
	private int menuitemOrder;
	
	@ManyToOne(cascade={CascadeType.ALL} , fetch=FetchType.LAZY)
	@JoinColumn(name="MENUITEMPARENTKEY")
	private MenuItem parentMenuitem;
	
	@OneToMany(mappedBy="parentMenuitem", fetch=FetchType.LAZY)
	private List<MenuItem> childreenMenuitems = new ArrayList<MenuItem>();
	

	public Long getMenuitemKey() {
		return menuitemKey;
	}

	public void setMenuitemKey(Long menuitemKey) {
		this.menuitemKey = menuitemKey;
	}

	public String getMenuitemDescription() {
		return menuitemDescription;
	}

	public void setMenuitemDescription(String menuitemDescription) {
		this.menuitemDescription = menuitemDescription;
	}

	public String getMenuitemPath() {
		return menuitemPath;
	}

	public void setMenuitemPath(String menuitemPath) {
		this.menuitemPath = menuitemPath;
	}

	public String getMenuitemIcon() {
		return menuitemIcon;
	}

	public void setMenuitemIcon(String menuitemIcon) {
		this.menuitemIcon = menuitemIcon;
	}

	public int getMenuitemOrder() {
		return menuitemOrder;
	}

	public void setMenuitemOrder(int menuitemOrder) {
		this.menuitemOrder = menuitemOrder;
	}

	/*
	public MenuItem getParentMenuitem() {
		return parentMenuitem;
	}

	public void setParentMenuitem(MenuItem parentMenuitem) {
		this.parentMenuitem = parentMenuitem;
	}*/
	
	public List<MenuItem> getChildreenMenuitems() {
		return childreenMenuitems;
	}

	public void setChildreenMenuitems(List<MenuItem> childreenMenuitems) {
		this.childreenMenuitems = childreenMenuitems;
	}
	
}
