package com.softvision.qa.automation.groupc;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lucia", "QA Engineer");
        employee1.setFirstName("Lucia");
        employee1.setLastName("Ropotica");
        employee1.setEmail("lucia.ropotica@softvision.ro");
        employee1.setPhoneNumber("0742945482");
        employee1.setJobTitle("QA Engineer");
        employee1.setTechnicalLevel("Junior");
        employee1.setSkill("Functional testing");
        employee1.setManager("Mihaela Cretu");
        employee1.setSite("Iasi");
        employee1.setBuilding("Aria");
        employee1.setOffice(304);
        employee1.setDesk(3);

        System.out.println(employee1);

    }
}
