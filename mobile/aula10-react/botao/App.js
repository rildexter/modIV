import React, { useState } from "react";
import { View, Text, image, Button } from "react-native";

export default function App() {
  //aqui fica o codigo
  const [contador, setContador] = useState(0);

  const aumentarContador = () => {
    setContador(contador + 1);
  };

  const diminuirContador = () => {
    setContador(contador - 1);
  };
//aqui o retorno para montar a view
  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
      <Text>Contador: {contador}</Text>
      <Button title="Aumentar" onPress={aumentarContador} />
      <Button title="Diminuir" onPress={diminuirContador} />
    </View>
  );
}

