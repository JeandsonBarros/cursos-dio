import PhotosGallery from "./PhotosGallery";

function SmartComponents() {

    const photos = [
        'https://i0.wp.com/www.printmag.com/wp-content/uploads/2021/02/4cbe8d_f1ed2800a49649848102c68fc5a66e53mv2.gif?fit=476%2C280&ssl=1',
        'https://media2.giphy.com/media/7SF5scGB2AFrgsXP63/giphy.gif?cid=790b76119d0cd0a83286ba18b0b4120f084d7ae50e466a20&rid=giphy.gif&ct=g',
        'https://media1.giphy.com/media/3ohs7KViF6rA4aan5u/giphy.gif?cid=790b761186c430ca01768d4632db159616ddda6f8e03bf60&rid=giphy.gif&ct=g'
    ]

    return (
        <>
            <h3>Galeria de fotos</h3>
            <PhotosGallery
                photos={photos}
            />
        </>
    );
}

export default SmartComponents;