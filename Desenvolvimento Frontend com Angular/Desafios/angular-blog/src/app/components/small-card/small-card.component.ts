import { Component, Input, DoCheck } from '@angular/core';
import { RouterLink } from '@angular/router';
import Post from '../../models/Post';

@Component({
  selector: 'app-small-card',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './small-card.component.html',
  styleUrls: [
    './small-card.component.css',
    './small-card.responsive.component.css'
  ]
})
export class SmallCardComponent implements DoCheck{

  @Input({ required: true })
  post!: Post
  titleToUrl = ""

  ngDoCheck(): void {
    if(this.post){
      this.titleToUrl = this.post.title.replace(/\W/g, '-').toLowerCase()
    }
  }
}
