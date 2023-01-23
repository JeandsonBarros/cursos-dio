import { useEffect, useState } from 'react';
import './App.css';
import TwitterClass from './components/TwitterClass';
import TwitterFunction from './components/TwitterFunction';
import { ThemeContext, themes } from './components/Theme';
import Card from './components/Card';

function App() {

  const [loading, setLoanding] = useState(false)
  const [actived, setActived] = useState(true)

  const [token, setToken] = useState()

  useEffect(()=>{
    setTimeout(()=>{
      setToken("aspdhd983-2q983-2382u-0hdusaoa")
    },3000)
  },[setToken])

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

      <h3>Context API</h3>
      <ThemeContext.Provider value={{...themes.primary, token}}>
        <Card/>
      </ThemeContext.Provider>
      
    </div>
  );

}

export default App;
