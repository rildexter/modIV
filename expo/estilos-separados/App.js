import React, { useState } from "react";
import { View, StyleSheet, Text, Image, Button } from "react-native";

export default function App() {
  return ( 
      <View style={styles.container}>

      <Text style={styles.paragraph}>
      Titulo do Aplicativo:
      </Text>

      <Button title="Aperte" />
        <Image 
          style={styles.foto}
          source={{uri: 'https://cdn-icons-png.flaticon.com/128/2991/2991148.png'}}
        />
        <Image
          style={{width: 66, height: 58}}
          source={require('./assets/chrome.png')}
        />
    </View>
  );
}

const styles = StyleSheet.create({
  container:{
  flex: 1, 
  justifyContent: "center", 
  alignItems: "center",
  },
    foto: {
    justifyContent: 'center',
    margin: 20,
    width: 50, 
    height: 50,
  },
  paragraph: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
  },
});