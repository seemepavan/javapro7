package com.dxc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="javab12")
public class Employee {
	@Id
	@Column(name="empcode", length=10)
	     private int empcode;
	@Column(name="empname", length=10)
	     private String empname;
	@Column(name="designation", length=20)
	     private String designation;
	@Column(name="basic", length=10)
	     private String basic;
		public int getEmpcode() {
			return empcode;
		}
		public void setEmpcode(int empcode) {
			this.empcode = empcode;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getBasic() {
			return basic;
		}
		public void setBasic(String basic) {
			this.basic = basic;
		}

}
