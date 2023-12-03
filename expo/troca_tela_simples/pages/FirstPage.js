import React, { useState } from 'react';
import { View, Text, TextInput, TouchableOpacity, StyleSheet } from 'react-native';
import { useNavigation } from '@react-navigation/native';

// Componente funcional para a Primeira Página
const FirstPage = () => {
  // Hook useNavigation permite a navegação entre as páginas
  const navigation = useNavigation();
  // Função para navegar para a Segunda Página ao pressionar o botão correspondente
  const goToSecondPage = () => {
    navigation.navigate('Segunda');
  };
  // Função para navegar para a Terceira Página ao pressionar o botão correspondente
  const goToThirdPage = () => {
    navigation.navigate('Terceira');
  };
  // Retorno do componente
  return (
    <View style={styles.container}>
     {/* Botões para navegar para as outras páginas */}
      <TouchableOpacity style={styles.button} onPress={goToSecondPage}>
        <Text style={styles.buttonText}>segunda</Text>
      </TouchableOpacity>
      <TouchableOpacity style={styles.button} onPress={goToThirdPage}>
        <Text style={styles.buttonText}>terceira</Text>
      </TouchableOpacity>
    </View>
  );
};

// Estilos CSS para o componente
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#ecf0f1',
  },
    button: {
    backgroundColor: '#3498db',
    padding: 10,
    borderRadius: 5,
    marginTop: 10,
  },
});

// Exportação padrão do componente
export default FirstPage;
