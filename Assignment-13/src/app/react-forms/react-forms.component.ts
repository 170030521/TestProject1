import { Component} from '@angular/core';
import { FormBuilder, Validators,FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-react-forms',
  templateUrl: './react-forms.component.html',
  styleUrls: ['./react-forms.component.css']
})
export class ReactFormsComponent  {

  // productForm = new FormGroup({
  //   productName: new FormControl('', [
  //     Validators.required,
  //     Validators.pattern('^[a-zA-z]{5,9}$')
  //   ])
  // })

  constructor(private formBuilder:FormBuilder){}
productForm= this.formBuilder.group(
    {
      productName: ['', [Validators.required,Validators.minLength(3), Validators.pattern('^[A-Z][a-z]*$')]],

    productAddess: this.formBuilder.group(
      {
      City:['', [Validators.required, Validators.pattern('^[A-Z][a-z]*$')]],
     PostalCode:['', [Validators.required,Validators.minLength(6), Validators.pattern('^[0-9]{6,6}$')]]
    })
  })

  submitData() {
    console.log(this.productForm
      )
    console.log(this.productForm
      .value)

  }

}