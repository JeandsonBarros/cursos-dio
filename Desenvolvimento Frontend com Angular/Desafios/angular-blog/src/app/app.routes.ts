import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { PostComponent } from './pages/post/post.component';
import { Error404Component } from './pages/error404/error404.component';

export const routes: Routes = [
    {
        path: "",
        component: HomeComponent,
        pathMatch: "full" 
    },
    {
        path: "post/:id/:title",
        component: PostComponent
    },
    {
        path: "**",
        redirectTo: "page-not-found",
    },
    {
        path: "page-not-found",
        component: Error404Component
    }
];
