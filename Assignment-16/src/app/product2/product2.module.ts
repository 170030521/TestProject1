import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Product2RoutingModule } from './product2-routing.module';
import { Product2Component } from './product2.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { Web1Component } from './web1/web1.component';
import { Java1Component } from './java1/java1.component';
import { OopsComponent } from './oops/oops.component';
import { SpringComponent } from './spring/spring.component';
import { MultithreadingComponent } from './multithreading/multithreading.component';
import { HtmlComponent } from './html/html.component';
import { CssComponent } from './css/css.component';
import { AngularComponent } from './angular/angular.component';
import { SharedModule } from '../shared/shared/shared.module';


@NgModule({
  declarations: [
    Product2Component,Web1Component,Java1Component,OopsComponent,SpringComponent,MultithreadingComponent,HtmlComponent,CssComponent,AngularComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,FormsModule,Product2RoutingModule,SharedModule
  ]
})
export class Product2Module { }
