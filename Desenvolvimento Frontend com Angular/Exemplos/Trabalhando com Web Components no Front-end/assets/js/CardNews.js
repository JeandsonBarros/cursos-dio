/* class CardNews extends HTMLElement {
    constructor(){
        super()

        const shadow = this.attachShadow({mode: "open"})
        shadow.innerHTML = "<h2>Card News</h2>"
    }
}

customElements.define("card-news", CardNews) */

class CardNews extends HTMLElement {
    constructor() {
        super()
        const shadow = this.attachShadow({ mode: "open" })
        shadow.appendChild(this.build())
        shadow.appendChild(this.styles())
    }

    build() {
        const componentRoot = document.createElement("div")
        componentRoot.setAttribute("class", "card")

        const cardLeft = document.createElement("div")
        cardLeft.setAttribute("class", "card__left")

        const autor = document.createElement("span")
        autor.textContent = "By " + this.getAttribute("autor") || "anonymous"

        const linkTitle = document.createElement("a")
        linkTitle.textContent = this.getAttribute("title")
        linkTitle.href = this.getAttribute("link")

        const newsContent = document.createElement("p")
        newsContent.textContent = this.getAttribute("content")

        cardLeft.appendChild(autor)
        cardLeft.appendChild(linkTitle)
        cardLeft.appendChild(newsContent)

        const cardRight = document.createElement("div")
        cardRight.setAttribute("class", "card__right")

        const newsImage = document.createElement("img")
        newsImage.src = this.getAttribute("photo") || "/assets/img/default-photo.jpg"
        newsImage.width = 300
        newsImage.height = 200
        newsImage.alt = "Foto dos pokemons fantasmas"

        cardRight.appendChild(newsImage)

        componentRoot.appendChild(cardLeft)
        componentRoot.appendChild(cardRight)

        return componentRoot
    }

    styles() {

        const style = document.createElement("style")

        style.textContent = `
        .card {
            width: 720px;
            border: 1px solid gray;
            display: flex;
            flex-direction: row;
            -webkit-box-shadow: 10px 10px 5px -4px rgba(0, 0, 0, 0.07);
            -moz-box-shadow: 10px 10px 5px -4px rgba(0, 0, 0, 0.07);
            box-shadow: 10px 10px 5px -4px rgba(0, 0, 0, 0.07);
        }
        
        .card__left {
            display: flex;
            flex-direction: column;
            justify-content: center;
            padding-left: 10px;
        }
        
        .card__left>span {
            font-weight: 400;
        }
        
        .card__left>a {
            color: black;
            text-decoration: none;
            margin-top: 15px;
            font-size: 25px;
            font-weight: bold;
        }
        
        .card__left>p {
            color: gray;
        }
        
        .card__left>p {
            color: gray;
        }
        `

        return style
    }

}

customElements.define("card-news", CardNews)