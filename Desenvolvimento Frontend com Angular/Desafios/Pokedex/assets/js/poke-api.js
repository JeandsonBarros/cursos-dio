const baseURL = "https://pokeapi.co/api/v2/pokemon"
const pokeApi = {}

pokeApi.getPokemons = async (offset = 0, limit = 10) => {
    const url = baseURL + `?limit=${limit}&offset=${offset}`

    try {
        const response = await fetch(url)
        const jsonBody = await response.json()

        const pokemons = await Promise.all(jsonBody.results.map(async pokemon => {

            const pokemonDetail = await fetch(pokemon.url)
            const pokemonDetailJson = await pokemonDetail.json()

            return new Pokemon(
                pokemonDetailJson.name,
                pokemonDetailJson.id,
                pokemonDetailJson.sprites.other.dream_world.front_default,
                pokemonDetailJson.types[0].type.name,
                pokemonDetailJson.types.map(typeSlot => typeSlot.type.name)
            )

        }))

        return pokemons;

    } catch (error) {
        console.log(error);
        return error
    }
}