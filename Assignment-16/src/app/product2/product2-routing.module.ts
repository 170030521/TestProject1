import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AngularComponent } from './angular/angular.component';
import { CssComponent } from './css/css.component';
import { HtmlComponent } from './html/html.component';
import { Java1Component } from './java1/java1.component';
import { MultithreadingComponent } from './multithreading/multithreading.component';
import { OopsComponent } from './oops/oops.component';
import { Product2Component } from './product2.component';
import { SpringComponent } from './spring/spring.component';
import { Web1Component } from './web1/web1.component';
const routes: Routes = [{ path: '', component: Product2Component },
{path:'java',component:Java1Component,
children:[{path:'oops',component:OopsComponent},
{path:'spring',component:SpringComponent},
{path:'multithreading',component:MultithreadingComponent}]},

{path:'web',component:Web1Component,
children:[{path:'html',component:HtmlComponent},
{path:'css',component:CssComponent},
{path:'angular',component:AngularComponent}]}]
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class Product2RoutingModule { }