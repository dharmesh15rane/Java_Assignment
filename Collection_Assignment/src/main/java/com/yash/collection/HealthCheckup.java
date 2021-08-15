package com.yash.collection;

public class HealthCheckup {
      
	public int patient_id;
	public String patient_name;
	public int age;
	public HealthCheckup(int patient_id, String patient_name, int age) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "HealthCheckup [patient_id=" + patient_id + ", patient_name=" + patient_name + ", age=" + age + "]";
	}
	
	
}
