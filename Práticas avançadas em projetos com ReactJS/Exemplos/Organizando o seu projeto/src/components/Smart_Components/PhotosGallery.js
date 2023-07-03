import { memo, useState } from "react";
import Button from "../Dumb_Components/Button";
import PropTypes from 'prop-types'

function PhotosGallery({ photos }) {

    const [phtosGallery, setPhtosGallery] = useState(photos)

    const handleRomove = (index) => {
        let newGallery = phtosGallery.filter((img, indexImg) => indexImg !== index)
        setPhtosGallery(newGallery)
    }

    return (
        <div>

            {phtosGallery.map((imgItem, index) => {
                return (
                    <div key={index}>
                        <img width={290} src={imgItem} alt="" />
                        <Button onClick={() => handleRomove(index)}>
                            Remover {index}
                        </Button>
                    </div>

                )
            })}

        </div>);
}

PhotosGallery.propTypes = {
    photos: PropTypes.array.isRequired
}

export default memo(PhotosGallery);