package com.example.tablemaping.Service;

import com.example.tablemaping.Entity.Depatment;
import com.example.tablemaping.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentService {
@Autowired
    private DepartmentRepo departmentRepo;

public Depatment saveDepartment(Depatment depatment)
{
   return departmentRepo.save(depatment);
}

public List<Depatment> saveDepartments(List<Depatment> depatments)
{
    return departmentRepo.saveAll(depatments);
}

public  List<Depatment> getDepartments()
{
    return departmentRepo.findAll();
}
public Depatment getDepartmentByID( int id)
{
    return departmentRepo.findById(id).orElse(null);
}

    public Depatment getDepartmentByName( String name)
    {
        return departmentRepo.findByName(name);
    }

 public String deleteDepartment(int id)
 {
     departmentRepo.deleteById(id);
     return "deleted" + id;
 }

 public String deleteDepartmentByName(String name)
 {
     departmentRepo.deleteByName(name);
     return "deleted"+ name;

 }

 public  Depatment updateDepartment(Depatment depatment)
 {
     Depatment existingDepatment = departmentRepo.findById(depatment.getDepartment_id()).orElse(null);
     existingDepatment.setDepartment_name(depatment.getDepartment_name());
     existingDepatment.setDepartment_number(depatment.getDepartment_number());
     return departmentRepo.save(existingDepatment);
 }


    public  Depatment updateDepartmentByName(Depatment depatment)
    {
        Depatment existingDepatment = departmentRepo.findByName(depatment.getDepartment_name());
        existingDepatment.setDepartment_name(depatment.getDepartment_name());
        existingDepatment.setDepartment_number(depatment.getDepartment_number());
        return departmentRepo.save(existingDepatment);
    }





}
;