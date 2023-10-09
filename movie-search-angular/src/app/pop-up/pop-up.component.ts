import { Component, Input } from '@angular/core';

@Component({
  selector: 'mov-pop-up',
  templateUrl: './pop-up.component.html',
  styleUrls: ['./pop-up.component.css']
})
export class PopUpComponent {

  @Input() status!: boolean;
  @Input() text!: string;

  constructor() {}

  close() {
    this.status = false;
  }

}
