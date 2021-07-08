import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SearchPipe } from './search.pipe';
import { SortPipe } from './sort.pipe';
import { NgcolorDirective } from './directive/ngcolor.directive';



@NgModule({
  declarations: [SearchPipe,SortPipe,NgcolorDirective],
  imports: [
    CommonModule
  ],
exports: [SearchPipe,SortPipe,NgcolorDirective]
})
export class SharedModule { }
