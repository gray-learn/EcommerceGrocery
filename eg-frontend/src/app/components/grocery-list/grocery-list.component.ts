import { Component, OnInit } from '@angular/core';
import { Grocery } from 'src/app/common/grocery';
import { GroceryService } from 'src/app/services/grocery.service';

@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list-table.component.html',
  //templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {
  constructor(private groceryService: GroceryService) {// inject
  }

  grocerys: Grocery[] =[];

  ngOnInit(): void {// like @PostConstruct
    this.listGrocery();
  }
  listGrocery() {
    this.groceryService.getGroceryList().subscribe(// once subscribe invoke the method
        data => {
          this.grocerys = data;
        }

      )
  }

}
