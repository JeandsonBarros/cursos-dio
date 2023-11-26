class Pokemon {
    name;
    id;
    urlImage;
    type;
    types = [];

    constructor(name, id, urlImage, type, types) {
        this.name = name;
        this.id = id;
        this.urlImage = urlImage;
        this.type = type;
        this.types = types;
    }
}