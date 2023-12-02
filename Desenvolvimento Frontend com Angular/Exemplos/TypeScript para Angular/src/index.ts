// isso printa um hero
/* type Hero = {
    name: string;
    vulgo: string;
}

function printHeros(hero: Hero): void {
    console.log(hero);
}

printHeros({ name: "Tony", vulgo: "Iron Man" }); */

// generics em funções
/*
function concatArrays<T>(...itens: T[]): T[] {
    return new Array().concat(...itens);
}

const numArray = concatArrays<number[]>([1, 2, 3], [4, 5])
console.log("numArray: ", numArray);

const strArray = concatArrays<string[]>(["a", "b", "c"], ["d", "e"])
console.log("srtArray: ",strArray); */

// decorators
function ExibirNome(target: any) {
    console.log(target);
}

@ExibirNome
class Funcionario { }

function ApiVersion(version: string) {
    return (target: any) => {
        Object.assign(target.prototype, { __version: version })
    }
}

function minLength(length: number) {
    return (target: any, key: string) => {
        let _value = target[key];

        const getter = () => _value

        const setter = (value: string) => {
            if (value.length >= length) {
                _value = value
            } else {
                throw new Error(`Valor informado é menor que ${length}`)
            }
        }

        Object.defineProperty(target, key, {
            get: getter,
            set: setter
        })

    }
}

@ApiVersion("2.0.0")
class Api {

    @minLength(10)
    name: string;

    constructor(name: string) {
        this.name = name
    }

}

const api = new Api("Api testes");
console.log(api.__version);

console.log(api.name);





