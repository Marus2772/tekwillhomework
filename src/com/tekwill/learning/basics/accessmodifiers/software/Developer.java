package com.tekwill.learning.basics.accessmodifiers.software;

public class Developer extends Employee {
    public Employee employee;

    public void checkPublic() {
        publicfirstName = "Marius";
        publicdoWork();

        // with reference
        employee.publicfirstName = "Marius";
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
        //privatefirstName = "Marius";
        // privatedoWork();

        // employee.privatefirstName = "Marius";
        // employee.privatedoWork();
    }
}
