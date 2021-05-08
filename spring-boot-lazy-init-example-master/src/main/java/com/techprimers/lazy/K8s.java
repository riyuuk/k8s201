package com.techprimers.lazy;

public class K8s {

	private int id;

	private String name;

	public K8s() {

	}

	public K8s(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "K8s [id=" + id + ", name=" + name + "]";
	}

}
