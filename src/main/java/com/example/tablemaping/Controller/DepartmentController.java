package com.example.tablemaping.Controller;

import com.example.tablemaping.Entity.Depatment;
import com.example.tablemaping.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/adddepartment")

    public Depatment addDepartment(@RequestBody Depatment depatment)
    {
        return departmentService.saveDepartment(depatment);
    }
    @PostMapping("/adddepartments")

    public List<Depatment> addDepartments( @RequestBody List<Depatment>depatments)
    {
        return departmentService.saveDepartments(depatments);
    }

@GetMapping("/departments")
    public List<Depatment> findDepartments()
    {
        return departmentService.getDepartments();
    }
@GetMapping("/departmet/{id}")
    public Depatment findDepartmentById( @PathVariable int id)
    {
        return departmentService.getDepartmentByID(id);
    }
    @GetMapping("/departmet/{name}")
    public Depatment findDepartmentByName(@PathVariable String name)
    {
        return departmentService.getDepartmentByName(name);
    }

    @PostMapping("/update")
    public Depatment updateTheDepartment(@RequestBody Depatment depatment)
    {
        return departmentService.updateDepartment(depatment);
    }

    @PutMapping("/update/{name}")
    public  Depatment updateTheDepartmentByName(@RequestBody Depatment depatment)
    {
        return departmentService.updateDepartmentByName(depatment);
    }


    @DeleteMapping("/delete")
    public String deleteTheDepartmentById(@PathVariable int id)
    {
        return  departmentService.deleteDepartment(id);

    }

    @DeleteMapping("/delete/{name}")
    public String deleteTheDepartmentByName(@PathVariable String name)
    {
        return departmentService.deleteDepartmentByName(name);
    }











}
