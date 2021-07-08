import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [{ path: 'product1', loadChildren: () => import('./product1/product1.module').then(m => m.Product1Module) }, { path: 'product2', loadChildren: () => import('./product2/product2.module').then(m => m.Product2Module) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
