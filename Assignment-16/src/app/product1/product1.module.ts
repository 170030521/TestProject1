import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductRoutingModule } from './product1-routing.module';
import { Product1Component } from './product1.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SharedModule } from '../shared/shared/shared.module';


@NgModule({
  declarations: [
    Product1Component
  ],
  imports: [
    CommonModule,
    ProductRoutingModule,
    HttpClientModule,
    FormsModule,
    SharedModule
  ]
})
export class Product1Module { }
