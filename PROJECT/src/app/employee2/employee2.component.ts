import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee2',
  templateUrl: './employee2.component.html',
  styleUrls: ['./employee2.component.css']
})
export class Employee2Component implements OnInit {
  filter:any=''
  funnel:any='a-z'
 
 
 
  

  ngOnInit(): void {
  }
  employees:any = []

  constructor(private employeesservice:EmployeeService)

  {

    employeesservice.getEmployeesInfo().subscribe(

      data => this.employees=data,
 
      error =>console.log(error)


   )

  }

  }

