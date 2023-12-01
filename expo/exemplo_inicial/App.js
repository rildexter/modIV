import React,{useState} from "react";
import {View,Text,Button,Image} from "react-native";

export default function App() {
  //teremos codigo aqui
  return(
  <View style={{flex:1, justifyContent:"center", alignItems:"center"}}>
  <Text>Aplicativo da Aula</Text>
  <Button title="Aperte"/>
  <Image style={{width: 50, height:50}}
  source={{uri:
  'https://cdn4.iconfinder.com/data/icons/logos-brands-7/512/google_logo-google_icongoogle-512.png'}}
  />
  <Image style={{width: 50, height:50}}
  source={require('./assets/google.png')}
  />
  </View>
  )
}


