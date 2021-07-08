import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { Product1Component } from './product1/product1.component';
import { SearchPipe } from './shared/shared/search.pipe';
import { SharedModule } from './shared/shared/shared.module';
import { SortPipe } from './shared/shared/sort.pipe';


@NgModule({
  declarations: [
    AppComponent,
    ProductComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    SharedModule
    

  ],
  providers: [],
  bootstrap: [AppComponent],
  exports:[SearchPipe,SortPipe]
})
export class AppModule { }
