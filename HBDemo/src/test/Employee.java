package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_master")
public class Employee {
@Id
@Column(name="empid")
int eid;
@Column(name="empname")
String ename;
@Column(name="empsalary")
double salary;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
