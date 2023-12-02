import { FormsModule } from '@angular/forms';
import { PokapiService } from './services/pokapi.service';
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';

type Carro = {
  marca: string;
  modelos: string[];
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, RouterLink, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  title = 'life-clycles';
  isLoading = false;
  status = "error";
  
  carros: Carro[] = [
    { marca: "Ford", modelos: ["Mustang", "GT"] },
    { marca: "Chevrolet", modelos: ["Camaro", "Corvette"] },
    { marca: "Ferrari", modelos: ["LaFerrari"] },
    { marca: "Porsche ", modelos: ["Macan", "Panamera", "Taycan"] },
    { marca: "Lamborghini", modelos: ["Urus", "Huracán", "Aventador"] },
    { marca: "Pagani ", modelos: ["Huayra", "Zonda", "UTOPIA"] }
  ];

  constructor(private pokapiService: PokapiService){
    pokapiService.getPokemons().subscribe(data =>{
      console.log(data);
    })
  }

}
