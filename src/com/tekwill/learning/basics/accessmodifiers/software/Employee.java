package com.tekwill.learning.basics.accessmodifiers.software;

public class Employee {
    public String publicfirstName;
    public Employee employee;
    //
    protected String protectedfirsName;
    //
    String defaultfirstName;
    //
    private String privatefirstName;

    //
    public Employee publicdoWork() {
        return new Employee();
    }

    //
    protected Employee protecteddoWork() {
        return new Employee();
    }

    //
    Employee defaultdoWork() {
        return new Employee();
    }

    //
    private Employee privatedoWork() {
        return new Employee();
    }

    public void checkPublic() {
        publicfirstName = "Marius";
        publicdoWork();

        employee.publicfirstName = "Marius";   // with reference
        employee.publicdoWork();
    }

    public void checkProtected() {
        protectedfirsName = "Marius";
        protecteddoWork();

        employee.protectedfirsName = "Marius";
        employee.protecteddoWork();
    }

    public void checkDefault() {
        defaultfirstName = "Marius";
        defaultdoWork();

        employee.defaultfirstName = "Marius";
        employee.defaultdoWork();
    }

    public void checkPrivate() {
        privatefirstName = "Marius";
        privatedoWork();

        employee.privatefirstName = "Marius";
        employee.privatedoWork();
    }
}
