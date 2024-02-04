import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list-table.component.html',
  //templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  constructor(private productService: ProductService) {// inject

  }

  products: Product[] =[];


  ngOnInit(): void {// like @PostConstruct
    this.listProduct();
  }
  listProduct() {

    this.productService.getProductList().subscribe(// once subscribe invoke the method
        data => {
          this.products = data;
        }

      )
  }

}
