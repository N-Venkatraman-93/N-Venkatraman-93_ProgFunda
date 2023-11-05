package com.gradedproject.Q1;

public class TechDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete Coding of module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
    public String getTechStackInformation() {
    	return "core java";
    }
    @Override
    public String isTodayAHoliday() {
    	return "Today is Not a Holiday";
}
}
