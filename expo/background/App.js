import { StatusBar } from 'expo-status-bar';
import { StyleSheet, View } from 'react-native';
//adicionar componente botão
import Button from './components/Button';
import ImageViewer from './components/ImageViewer';

const PlaceholderImage = require('./assets/images/background-image.png');

export default function App() {
  return (
    <View style={styles.container}>
      <View style={styles.imageContainer}>
        <ImageViewer placeholderImageSource={PlaceholderImage} />
      </View>
      //adicionando os botões
      <View style={styles.footerContainer}>
        <Button theme="primary" label="Escolha a Foto" />
        <Button label="Use esta foto" />
      </View>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#25292e',
    alignItems: 'center',
  },
  imageContainer: {
    flex:1, 
    paddingTop: 58
  },
  //adicionando o css do botão
  footerContainer: {
    flex: 1 / 3,
    alignItems: 'center',
  },
});
