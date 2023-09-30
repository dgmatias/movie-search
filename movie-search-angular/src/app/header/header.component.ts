import { Component } from '@angular/core';

@Component({
  selector: 'mov-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  statusSideMenu: boolean = false;

  toggleSideMenu() {
    this.statusSideMenu = !this.statusSideMenu;

    if(this.statusSideMenu) {
      console.log("O side menu foi aberto");
    } else {
      console.log("O side menu fechado")
    }
  }


}
