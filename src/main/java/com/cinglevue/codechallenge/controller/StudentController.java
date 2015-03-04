package com.cinglevue.codechallenge.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.cinglevue.codechallenge.model.Student;
import com.cinglevue.codechallenge.repository.PersonService;
import com.cinglevue.codechallenge.repository.StudentRepository;
 
@Controller
@RequestMapping("/students")
public class StudentController { 
	
	@Autowired
    private StudentRepository studentRepository;
     
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Student> getAll() {
    	List<Student> list = studentRepository.findAll();
        return list;
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public @ResponseBody Student getOne(@PathVariable String id) {
    	Student student = studentRepository.findOne(id);
        return student;
    }
    
    @RequestMapping(method = RequestMethod.POST, consumes="application/json")
    public @ResponseBody Student add(@RequestBody Student student) {
    	return studentRepository.save(student);
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public @ResponseBody String remove(@PathVariable String id) {
    	studentRepository.delete(id);
        return "";
    }
    
    // todo check response status ### created 201, deleted: ???
}