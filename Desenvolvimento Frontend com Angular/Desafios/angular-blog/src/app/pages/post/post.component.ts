import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import Post from '../../models/Post';
import { dataFake } from '../../data/dataFake';

@Component({
  selector: 'app-post',
  standalone: true,
  imports: [],
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css', './post.responsive.component.css']
})
export class PostComponent implements OnInit {

  post!: Post

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const id = Number(params.get("id"));
      const postFind = dataFake.find(post => post.id === id);

      if (postFind) {
        this.post = postFind
      }
      else {
        this.router.navigate(["page-not-found"])
      }
      
    })
  }

}
