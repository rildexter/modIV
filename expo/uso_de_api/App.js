import React, { useState, useEffect } from 'react';
import { View, Text, TextInput, StyleSheet, Picker, Image } from 'react-native';
import { styles } from './components/style'; // Importe os estilos do arquivo styles.js

export default function App() {
  const [amount, setAmount] = useState('');
  const [result, setResult] = useState('O resultado aparecerá aqui');
  const [fromCurrency, setFromCurrency] = useState('BRL'); // Moeda de origem padrão: Real Brasileiro
  const [toCurrency, setToCurrency] = useState('USD'); // Moeda de destino padrão: Dólar Americano
  const [exchangeRate, setExchangeRate] = useState(null);

  // Obter a taxa de câmbio ao iniciar o aplicativo
  useEffect(() => {
    fetchExchangeRate();
  }, []);

  // Atualizar o resultado quando as moedas ou o valor mudarem
  useEffect(() => {
    convertCurrency();
  }, [fromCurrency, toCurrency, amount, exchangeRate]);

  // Função para obter a taxa de câmbio atual
  const fetchExchangeRate = () => {
    const apiUrl = 'https://api.exchangerate-api.com/v4/latest/USD';

    fetch(apiUrl)
      .then(response => response.json())
      .then(data => {
        setExchangeRate(data.rates.BRL); // Configura a taxa de câmbio para a moeda de destino padrão (BRL)
      })
      .catch(error => console.error('Erro ao obter a taxa de câmbio:', error));
  };

  // Função para realizar a conversão
  const convertCurrency = () => {
    if (exchangeRate === null) {
      // Se a taxa de câmbio ainda não foi carregada, aguarde até que esteja disponível
      return;
    }

    // Calcule o valor convertido
    const convertedAmount = (parseFloat(amount) * exchangeRate).toFixed(2);

    // Exiba o resultado
    setResult(`${amount} ${fromCurrency} = ${convertedAmount} ${toCurrency}`);
  };

  return (
    <View style={styles.container}>
      {/* Imagem de fundo */}
      <Image
        source={require('./assets/background.jpg')} // Substitua pelo caminho correto da imagem
        style={styles.backgroundImage}      />

      {/* Conteúdo da aplicação */}
      <View style={styles.contentContainer}>
        {/* Cabeçalho */}
        <View style={styles.headerContainer}>
          <Text style={styles.header}>Conversor de Moedas</Text>
        </View>
        {/* Seleção da moeda de origem */}
        <Text style={styles.label}>Moeda de Origem:</Text>
        <Picker
          selectedValue={fromCurrency}
          onValueChange={(itemValue) => setFromCurrency(itemValue)}
          style={styles.picker}
        >
          {/* Opções de moeda de origem */}
          <Picker.Item label="Real Brasileiro (BRL)" value="BRL" />
          <Picker.Item label="Dólar Americano (USD)" value="USD" />
          <Picker.Item label="Euro (EUR)" value="EUR" />
          <Picker.Item label="Libra Esterlina (GBP)" value="GBP" />
          <Picker.Item label="Franco Suíço (CHF)" value="CHF" />
          <Picker.Item label="Dólar Canadense (CAD)" value="CAD" />
          <Picker.Item label="Coroa Sueca (SEK)" value="SEK" />
          <Picker.Item label="Coroa Norueguesa (NOK)" value="NOK" />
          <Picker.Item label="Iene Japonês (JPY)" value="JPY" />
          <Picker.Item label="Dólar Australiano (AUD)" value="AUD" />
          <Picker.Item label="Dólar Neozelandês (NZD)" value="NZD" />
          {/* Adicione mais opções conforme necessário */}
        </Picker>
        {/* Seleção da moeda de destino */}
        <Text style={styles.label}>Moeda de Destino:</Text>
        <Picker
          selectedValue={toCurrency}
          onValueChange={(itemValue) => setToCurrency(itemValue)}
          style={styles.picker}
        >
          {/* Opções de moeda de destino */}
          <Picker.Item label="Real Brasileiro (BRL)" value="BRL" />
          <Picker.Item label="Dólar Americano (USD)" value="USD" />
          <Picker.Item label="Euro (EUR)" value="EUR" />
          <Picker.Item label="Libra Esterlina (GBP)" value="GBP" />
          <Picker.Item label="Franco Suíço (CHF)" value="CHF" />
          <Picker.Item label="Dólar Canadense (CAD)" value="CAD" />
          <Picker.Item label="Coroa Sueca (SEK)" value="SEK" />
          <Picker.Item label="Coroa Norueguesa (NOK)" value="NOK" />
          <Picker.Item label="Iene Japonês (JPY)" value="JPY" />
          <Picker.Item label="Dólar Australiano (AUD)" value="AUD" />
          <Picker.Item label="Dólar Neozelandês (NZD)" value="NZD" />
          {/* Adicione mais opções conforme necessário */}
        </Picker>
        {/* Entrada de valor */}
        <TextInput
          placeholder="Digite o valor"
          keyboardType="numeric"
          value={amount}
          onChangeText={(text) => setAmount(text)}
          style={styles.input}
        />
        {/* Exiba o resultado da conversão */}
        <Text style={styles.result}>{result}</Text>
        {/* Rodapé */}
        <Text style={styles.footer}>Cotação do Dólar: 1 USD = {exchangeRate} BRL</Text>
      </View>
    </View>
  );
}
