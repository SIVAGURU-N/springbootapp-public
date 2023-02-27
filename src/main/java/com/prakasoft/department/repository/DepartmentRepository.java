package com.prakasoft.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prakasoft.department.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);

}
