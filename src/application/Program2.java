package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department FindById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department FindAll ===");
        List<Department> departments = departmentDao.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: Department Insert ===");
        Department newDep = new Department(null, "Security");
        departmentDao.insert(newDep);
        System.out.println("Done!");

        System.out.println("\n=== TEST 4: Department DELETE ===");
        departmentDao.deleteById(11);
        System.out.println("Done!");

        System.out.println("\n=== TEST 5: Department UPDATE ===");
        newDep = departmentDao.findById(9);
        newDep.setName("Logistics");
        departmentDao.update(newDep);
        System.out.println("Done!");
    }
}
