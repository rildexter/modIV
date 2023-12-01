import {StatusBar} from 'expo-status-bar';
import {StyleSheet,Image,Text,View} from 'react-native';

const PlaceholderImage = require('./assets/background-image.png');

export default function App(){
  return(
<View style={styles.container}>
  <View style={styles.imageContainer}>
<Image source ={PlaceholderImage} style={styles.image}/>
  </View>

<StatusBar style="auto"/>
</View>
  );
}

const styles = StyleSheet.create({
  container:{
    flex:1,
    alignItems:'center',
    justifyContent:'center',
    backgroundColor:'gray'
  },
  imageContainer:{
    flex:1,
    paddingTop:50,
  },
  image:{
    width:320,
    height:440,
    borderRadius:18,
  },
  paragrafo:{
    color:'white',
    fontSize:16,
  }
})