import React, { useState } from 'react';

function App() {
  // Estados para os números de entrada e o resultado
  const [num1, setNum1] = useState('');
  const [num2, setNum2] = useState('');
  const [resultado, setResultado] = useState('');

  // Função que usa um closure para somar dois números
  function calcularSoma(num1) {
    return function (num2) {
      return new Promise(function (resolve, reject) {
        if (isNaN(num1) || isNaN(num2)) {
          reject("Por favor, insira números válidos.");
        } else {
          resolve(num1 + num2);
        }
      });
    };
  }

  // Manipular o estado quando os números são inseridos e a soma é calculada
  const handleNum1Change = (event) => {
    setNum1(event.target.value);
  };

  const handleNum2Change = (event) => {
    setNum2(event.target.value);
  };

  const handleCalcularClick = () => {
    // Chamando a função com closures e usando Promises
    const soma = calcularSoma(parseFloat(num1))(parseFloat(num2));

    soma
      .then(function (resultado) {
        setResultado(`Resultado: ${resultado}`);
      })
      .catch(function (erro) {
        setResultado(`Erro: ${erro}`);
      });
  };

  return (
    <div className="App">
      <h1>Calculadora Assíncrona</h1>
      <input type="number" value={num1} onChange={handleNum1Change} placeholder="Número 1" />
      <input type="number" value={num2} onChange={handleNum2Change} placeholder="Número 2" />
      <button onClick={handleCalcularClick}>Calcular Soma</button>
      <p>{resultado}</p>
    </div>
  );
}

export default App;
