import { Component, OnInit } from '@angular/core';
import quizz_questions from "../../../assets/data/quizz_questions.json";

@Component({
  selector: 'app-quizz',
  standalone: true,
  imports: [],
  templateUrl: './quizz.component.html',
  styleUrl: './quizz.component.css'
})
export class QuizzComponent implements OnInit {

  title: string = ""

  questions: any[] = []
  questionSelected: any

  questionIndex: number = 0
  questionMaxIndex: number = 0

  answers: string[] = []
  answerSelected: string = ""

  finished: boolean = false

  constructor() {

  }

  ngOnInit(): void {
    if (quizz_questions) {
      this.finished = false;
      this.title = quizz_questions.title

      this.questions = quizz_questions.questions
      this.questionSelected = this.questions[this.questionIndex]

      this.questionIndex = 0
      this.questionMaxIndex = this.questions.length

    }
  }

  playerChoose(alias: string) {
    this.answers.push(alias)
    this.nextStep()
  }

  nextStep() {
    this.questionIndex++

    if (this.questionMaxIndex > this.questionIndex) {
      this.questionSelected = this.questions[this.questionIndex]
    } else {
      this.finished = true
      const finalAnswer = this.answers.filter(a => a == "A").length > this.answers.filter(a => a == "B").length ? "A" : "B"
      this.answerSelected = quizz_questions.results[finalAnswer as keyof typeof quizz_questions.results]
    }
  }

}
