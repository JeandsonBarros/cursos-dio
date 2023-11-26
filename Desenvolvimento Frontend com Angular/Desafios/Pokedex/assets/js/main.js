const pokemonList = document.getElementById("pokemonList")
const buttonPagination = document.getElementById("showMore")

const maxRecords = 11
const limit = 5
let offset = 0

function loadPokemonItems(offset, limit) {
    pokeApi.getPokemons(offset, limit)
        .then((pokemons = []) => {
            pokemonList.innerHTML += pokemons.map(pokemon => (
                `<li class="pokemon ${pokemon.type}">

                <span class="number">#${pokemon.id}</span>
                <span class="name">${pokemon.name}</span>
            
                <div class="detail">

                    <ol class="types">
                        ${pokemon.types.map(type => "<li class='type'>" + type + "</li>").join("")}
                    </ol>

                    <img src="${pokemon.urlImage}"
                    alt="${pokemon.name}">

                </div>
 
            </li>`
            )).join('')
        })
        .catch(console.error)
}

loadPokemonItems(offset, limit)

document.addEventListener("click", () => {
    offset += limit
    const qtdRecordsWithNextPage = offset + limit

    if (qtdRecordsWithNextPage >= maxRecords) {
        const newLimit = maxRecords - offset
        loadPokemonItems(offset, newLimit)
        buttonPagination.parentElement.remove(buttonPagination)
    } else {
        loadPokemonItems(offset, limit)
    }
})