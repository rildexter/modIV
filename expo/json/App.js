import React, { useState, useEffect } from 'react';
import { View, Text, TextInput, Button, StyleSheet, FlatList } from 'react-native';
import data from './assets/data.json'; // Importa diretamente o conteúdo do arquivo JSON
import { styles } from './components/style'; // Importe os estilos do arquivo styles.js

const App = () => {
  const [todos, setTodos] = useState(data.todos);
  const [newTodo, setNewTodo] = useState('');

  const addTodo = () => {
    const newTodos = [...todos, { id: todos.length + 1, text: newTodo }];
    setTodos(newTodos);
    setNewTodo('');
  };

  const deleteTodo = (id) => {
    const updatedTodos = todos.filter(todo => todo.id !== id);
    setTodos(updatedTodos);
  };

  const renderItem = ({ item }) => (
    <View style={styles.todoItem}>
      <Text>{item.text}</Text>
      <Button title="Excluir" onPress={() => deleteTodo(item.id)} />
    </View>
  );

  return (
    <View style={styles.container}>
      <TextInput
        placeholder="Nova tarefa"
        value={newTodo}
        onChangeText={text => setNewTodo(text)}
        style={styles.input}
      />
      <Button title="Adicionar Tarefa" onPress={addTodo} />

      <FlatList
        data={todos}
        keyExtractor={(item) => item.id.toString()}
        renderItem={renderItem}
      />
    </View>
  );
};



export default App;
