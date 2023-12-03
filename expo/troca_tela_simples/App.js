import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import FirstPage from './pages/FirstPage';
import SecondPage from './pages/SecondPage';
import ThirdPage from './pages/ThirdPage';
// Criação do navegador stack
const Stack = createNativeStackNavigator();
// Componente principal
const App = () => {
  return (
    <NavigationContainer>
      {/* Configuração das rotas */}
      <Stack.Navigator
        initialRouteName="Primeira"
        screenOptions={{
          headerStyle: {
            backgroundColor: '#3498db',
          },
          headerTintColor: '#fff',
          headerTitleStyle: {
            fontWeight: 'bold',
          },
        }}
      > 
        <Stack.Screen name="Primeira" component={FirstPage} options={{ title: 'Página Inicial' }} />
        <Stack.Screen name="Segunda" component={SecondPage} options={{ title: 'Segunda Página' }} />
        <Stack.Screen name="Terceira" component={ThirdPage} options={{ title: 'Terceira Página' }} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};
export default App;
