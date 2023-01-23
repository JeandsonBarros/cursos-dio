import React, { Fragment } from 'react';
import Buttons from './components/Buttons';
import CounterClass from './components/CounterClass';
import CounterFunction from './components/CounterFunction';
import ErrorBoundariesExemplo from './components/ErrorBoundariesExemplo';
import FragmentExemple from './components/FragmentExemplo';
import PetShop from './components/PetShop';
import RefsExemplo from './components/RefsExemplo';

function App() {
  return (
    <>

      {/* Por que trabalhar com Fragments */}
      {/* <FragmentExemple/> */}

      <hr />

      {/* Error Boundaries */}
      {/* <ErrorBoundariesExemplo/> */}

      <hr />

      {/* Render Props */}
      {/* <CounterClass
        render={({ decrement, increment, count }) => (
          <Buttons
            decrement={decrement}
            increment={increment}
            count={count} />
        )}
      /> */}
      {/*  <CounterFunction
        render={({ decrement, increment, count }) => (
          <Buttons
            decrement={decrement}
            increment={increment}
            count={count} />
        )}
      /> */}

      <hr />

      {/* Typechecking com PropTypes */}
      {/* <PetShop
        dogs={2}
        customerName="Jeu Barros"
        click={()=>console.log("Iniciar banho...")}
        status="done"
      /> */}

      <hr />

      {/* Refs e DOM */}
      <RefsExemplo/>

    </>
  );
}

export default App;
