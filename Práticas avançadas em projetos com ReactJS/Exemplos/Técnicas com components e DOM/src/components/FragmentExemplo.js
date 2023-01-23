import { Fragment } from "react";

const store = ['', '', ''];

function Column({ index }) {
    return (
        <tr>
            {/* <td>#{index.type.name} - </td> */}
            <td>Roupa</td>
            <td>Tênis</td>
        </tr>
    );
}

function FragmentExemple() {
    return (
        <table>
            <thead></thead>
            <tbody>
                {store.map((item, index) => {
                    return (
                        <Fragment key={`column-${index}`}>
                            <Column index={index} />
                        </Fragment>
                    )
                })}
            </tbody>
        </table>
    );
}

export default FragmentExemple;