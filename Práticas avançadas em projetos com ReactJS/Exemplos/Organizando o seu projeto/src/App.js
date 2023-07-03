import {DumbComponents, SmartComponents} from './components/'
//import { routes } from './routes';

function App() {
  return (
    <div >

      <h1> Dumb Components </h1>
      {/* 
        Dumb Components (Presentational Components)
        Características:
        Não estão diretamente ligados aos requisitos funcionais da sua aplicação;
        Definem a aparência da aplicação e a interface de usuário (UI);
        Não são conectados a store do Redux (não recebem o state e nem disparam actions);
        Recebem dados e callbacks via props;
        Geralmente são stateless function components, mas não necessariamente;
        Serve apenas para exibição;
      */}
      <DumbComponents />

      <hr />

      <h1>Smart Components </h1>
      {/* Características:
        Definem o comportamento da aplicação;
        Geralmente estão diretamente ligados aos requisitos funcionais (funcionalidades);
        São conectados a store do Redux (conhecem o state e disparam actions);
        Passam os dados e callbacks para os dumbs components;
        Geralmente são stateful class components, mas não necessariamente; 
      */}
      <SmartComponents />

      {/* Exemplo de rotoas */}
      {/* {routes.map()} */}

    </div>
  );
}

export default App;
