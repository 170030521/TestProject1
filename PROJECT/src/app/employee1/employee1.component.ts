import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee1',
  templateUrl: './employee1.component.html',
  styleUrls: ['./employee1.component.css']
})
export class Employee1Component implements OnInit {

  filter:any=''
  funnel:any='a-z'
 
 
 
  

  ngOnInit(): void {
  }
  // productdetails =[ 
  //   {
  //   productid:1,
  //   productname:'DairyMilk',
  //   productprice:300,
  //   productdesc:'product contains 10packets of dairymilk chocolates',
  // productimg:'assets/choco.jpg'
  //   },

  
  //     {
  //     productid:2,
  //     productname:'5star',
  //     productprice:100,
  //     productdesc:'product contains 10packets of 5star chocolates',
  //   productimg:'assets/choco1.jpg'
  //     }]   
  employees:any = []

  constructor(private employeesservice:EmployeeService)

  {

    employeesservice.getEmployeesInfo().subscribe(

      data => this.employees=data,
 
      error =>console.log(error)


   )

  }

  }
