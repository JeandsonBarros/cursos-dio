import { useEffect, useState } from 'react';
import './App.css';
import TwitterClass from './components/Aprofundando sobre o Ciclo de Vida do React/TwitterClass';
import TwitterFunction from './components/Aprofundando sobre o Ciclo de Vida do React/TwitterFunction';

function App() {

  const [loading, setLoanding] = useState(false)
  const [actived, setActived] = useState(true)

  useEffect(() => {
    setTimeout(() => {
      setLoanding(true)
    }, 3000)
  }, [])

  const onRemove = () => {
    setActived(false)
  }

  const posts = [
    { title: "title 1", description: "description 1" },
    { title: "title 2", description: "description 2" }
  ];

  return (
    <div>

      {/* <h3>Ciclo de Vida e suas fases</h3>
      <button onClick={onRemove}>Remover componente</button>
      {actived && <TwitterClass posts={posts} loading={loading} />}

      <hr /> */}

      {/* <h3>O que são Hooks e como ele pode otimizar o código</h3>
      <button onClick={onRemove}>Remover componente</button>
      {actived && <TwitterFunction posts={posts} loading={loading} />}

      <hr /> */}

      

      
    </div>
  );

}

export default App;
