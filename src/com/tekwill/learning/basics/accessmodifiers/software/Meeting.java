package com.tekwill.learning.basics.accessmodifiers.software;

public class Meeting {
    Employee employee;

    public void checkPublic() {
        employee.publicfirstName = "Marius";
        employee.publicdoWork();
    }

    public void checkProtected() {
        employee.protectedfirsName = "Marius";
        employee.protecteddoWork();
    }

    public void checkDefault() {
        employee.defaultfirstName = "Marius";
        employee.defaultdoWork();
    }

    public void checkPrivate() {
        // employee.privatefirstName = "Marius";
        // employee.privatedoWork();
    }
}
