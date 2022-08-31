package com.training.assignment.spring.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.training.assignment.spring.model.EmployeeData;

@RestController
public class GetPostTestController {

  public Map<Integer, EmployeeData> empDataMap = new HashMap<Integer, EmployeeData>();

  @PostMapping("/postTest")
  @ResponseBody
  public void postTest(@RequestBody EmployeeData teleData) {
    EmployeeData empData = teleData;

    empDataMap.put(empDataMap.size(), empData);

  }

  @GetMapping("/getTest")
  @ResponseBody
  public EmployeeData getTest(@RequestParam String lastName) {
    EmployeeData empData = new EmployeeData();

    empData.setFirstName("FirstName");
    empData.setLastName(lastName);
    empData.setDeptId(0);
    empData.setId(0);
    empData.setStatCd(0);

    return empData;
  }

  @GetMapping("/getTest/{lastName}")
  @ResponseBody
  public EmployeeData getTest1(@PathVariable("lastName") String lastName) {
    EmployeeData empData = new EmployeeData();

    empData.setFirstName("FirstName");
    empData.setLastName(lastName);
    empData.setDeptId(0);
    empData.setId(0);
    empData.setStatCd(0);

    return empData;
  }

}
