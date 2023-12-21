import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PostCustomerComponent } from './components/post-customer/post-customer.component';
import { GetAllCustomersComponent } from './components/get-all-customers/get-all-customers.component';

const routes: Routes = [
  {path: 'customer', component:PostCustomerComponent},
  {path: 'getcust', component:GetAllCustomersComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
