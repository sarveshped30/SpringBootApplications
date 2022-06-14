package com.example.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eId;
    private String eName;
    @Autowired
    private DepartmentBean dept;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void showDetails() {
        logger.debug("employeeId: " + eId);
        logger.debug("employeeName: " + eName);
        dept.setDeptName("Information Technology");
        logger.debug("deptName: " + dept.getDeptName());
    }
}
