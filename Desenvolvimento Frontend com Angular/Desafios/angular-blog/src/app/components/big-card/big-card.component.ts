import { Component, DoCheck, Input, SimpleChanges } from '@angular/core';
import { RouterLink } from '@angular/router';
import Post from '../../models/Post';

@Component({
  selector: 'app-big-card',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './big-card.component.html',
  styleUrl: './big-card.component.css'
})
export class BigCardComponent implements DoCheck{

  @Input({ required: true })
  post!: Post
  titleToUrl = ""

  constructor() { }

  ngDoCheck(): void {
    if(this.post){
      this.titleToUrl = this.post.title.replace(/\W/g, '-').toLowerCase()
    }
  }

}
