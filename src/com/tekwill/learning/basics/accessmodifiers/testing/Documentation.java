package com.tekwill.learning.basics.accessmodifiers.testing;

import com.tekwill.learning.basics.accessmodifiers.software.Employee;

public class Documentation {
    Employee employee;

    public void checkPublic() {
        employee.publicfirstName = "Marius";
        employee.publicdoWork();

        // without reference doesn't work
        //publicfirstName = "Marius";
        //publicdoWork()

    }

    public void checkProtected() {
        // employee.protectedfirsName = "Marius";
        // employee.protecteddoWork();
    }

    public void checkDefault() {
        // employee.defaultfirstName = "Marius";
        // employee.defaultdoWork();
    }

    public void checkPrivate() {
        // employee.privatefirstName = "Marius";
        // employee.privatedoWork();
    }

}