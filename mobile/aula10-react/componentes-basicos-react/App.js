import React, { useState } from "react";
import { View, Text, Image, Button } from "react-native";

export default function App() {
//aqui fica o codigo
//temos uma função que retorna o container
  return (
    
    <View style={{flex: 1, justifyContent: "center", alignItems: "center"}}>
      <Text>Titulo do Aplicativo:</Text>
      <Button title="Aperte" />
        <Image 
          style={{width: 50, height: 50}}
          source={{uri: 'https://cdn-icons-png.flaticon.com/128/2991/2991148.png'}}
        />
        <Image
          style={{width: 66, height: 58}}
          source={require('./assets/chrome.png')}
        />
    </View>
  );
}

//aqui teremos nosso css
/*const styles = StyleSheet.create({
  paragraph: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
  },
});*/