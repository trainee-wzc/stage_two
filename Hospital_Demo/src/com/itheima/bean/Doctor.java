package com.itheima.bean;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    private String doctorId;
    private String name;
    private String departmentName;
    private String gender;
    private int age;
    private String specialty;
    private LocalDate joinDate;
    private ArrayList<Schedule> schedules = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(String doctorId, String name, String departmentName, String gender, int age, String specialty, LocalDate joinDate, ArrayList<Schedule> schedules) {
        this.doctorId = doctorId;
        this.name = name;
        this.departmentName = departmentName;
        this.gender = gender;
        this.age = age;
        this.specialty = specialty;
        this.joinDate = joinDate;
        this.schedules = schedules;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
}
