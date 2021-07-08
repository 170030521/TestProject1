import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-product1',
  templateUrl: './product1.component.html',
  styleUrls: ['./product1.component.css']
})
export class Product1Component  {

  filter:any=''
  funnel:any='a-z'

  products:any = []
  constructor(private productservice:ProductService)
  {
   productservice.getProductsInfo().subscribe(
     data => {this.products=data
    console.log(data)},
     error =>console.log(error)

   )
  }


  ngOnInit(): void {

  }

}
