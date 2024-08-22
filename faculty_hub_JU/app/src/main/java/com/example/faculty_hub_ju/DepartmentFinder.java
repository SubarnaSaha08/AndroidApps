package com.example.faculty_hub_ju;
import java.util.ArrayList;
import java.util.List;
public class DepartmentFinder {
    List<String> getDepartments(String faculty) {
        List<String> Departments = new ArrayList<>();
        if (faculty.equals("Faculty of Arts and Humanities")) {
            Departments.add("1. Department of International Relations");
            Departments.add("2. Department of English");
            Departments.add("3. Department of History");
            Departments.add("4. Department of Philosophy");
            Departments.add("5. Department of Drama & Dramatics");
            Departments.add("6. Department of Archaeology");
            Departments.add("7. Department of Bangla");
            Departments.add("8. Department of Journalism and Media Studies");
            Departments.add("9. Department of Fine Art");
        } else if (faculty.equals("Faculty of Mathematical and Physical Sciences")) {
            Departments.add("1. Department of Computer Science and Engineering");
            Departments.add("2. Department of Mathematics");
            Departments.add("3. Department of Physics");
            Departments.add("4. Department of Environmental Sciences");
            Departments.add("5. Department of Statistics and Data Science");
            Departments.add("6. Department of Geological Sciences");
            Departments.add("7. Department of Chemistry");
        } else if (faculty.equals("Faculty of Social Sciences")) {
            Departments.add("1. Department of Economics");
            Departments.add("2. Department of Urban & Regional Planning");
            Departments.add("3. Department of Anthropology");
            Departments.add("4. Department of Geography & Environment");
            Departments.add("5. Department of Government & Politics");
            Departments.add("6. Department of Public Administration");
        } else if (faculty.equals("Faculty of Biological Sciences")) {
            Departments.add("1. Department of Botany");
            Departments.add("2. Department of Biochemistry & Molecular Biology");
            Departments.add("3. Department of Zoology");
            Departments.add("4. Department of Pharmacy");
            Departments.add("5. Department of Microbiology");
            Departments.add("6. Department of Biotechnology & Genetic Engineering");
            Departments.add("7. Department of Public Health and Informatics");
        } else if (faculty.equals("Faculty of Business Studies")) {
            Departments.add("1. Department of Finance & Banking");
            Departments.add("2. Department of Marketing");
            Departments.add("3. Department of Accounting and Information Systems");
            Departments.add("4. Department of Management Studies");
        } else if (faculty.equals("Faculty of Law")) {
            Departments.add("1. Department of Law & Justice");
        }
        return Departments;
    }
}
