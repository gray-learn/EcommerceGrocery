import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { GroceryListComponent } from './components/grocery-list/grocery-list.component';
import { GroceryService } from './services/grocery.service';

@NgModule({
  declarations: [
    AppComponent,
    GroceryListComponent
  ],
  imports: [
  BrowserModule,
    HttpClientModule
  ],
  providers: [
    GroceryService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
