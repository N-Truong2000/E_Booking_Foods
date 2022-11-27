package com.demo.models;
// Generated Jan 28, 2022 6:36:54 PM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Photo generated by hbm2java
 */
@Entity
@Table(name = "photo", catalog = "sem_project")
public class Photo implements java.io.Serializable {

	private Integer id;
	private Menu menu;
	private Tables tables;
	private String name;

	public Photo() {
	}

	public Photo(String name) {
		this.name = name;
	}

	public Photo(Menu menu, Tables tables, String name) {
		this.menu = menu;
		this.tables = tables;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id")
	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "table_id")
	public Tables getTables() {
		return this.tables;
	}

	public void setTables(Tables tables) {
		this.tables = tables;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}