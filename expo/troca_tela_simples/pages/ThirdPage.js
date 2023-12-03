import React, { useState } from 'react';
import { View, Text, TextInput, TouchableOpacity, StyleSheet } from 'react-native';
import { useNavigation } from '@react-navigation/native';
// Componente funcional para a Primeira Página
const ThirdPage = () => {
  // Hook useNavigation permite a navegação entre as páginas
  const navigation = useNavigation();
  return (
    <View style={styles.container}>

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
});
// Exportação padrão do componente
export default ThirdPage;
