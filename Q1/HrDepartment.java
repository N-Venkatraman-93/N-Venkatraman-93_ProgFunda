package com.gradedproject.Q1;

public class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "HR Department";
    }

    public String doActivity() {
    	return"Team Lunch";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today's Timesheet and mark your attendance";
    }
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
    @Override
    public String isTodayAHoliday() {
    	return "Today is Not a Holiday";
}
}

