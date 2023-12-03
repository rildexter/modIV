import React, { useState, useEffect } from 'react';
import {View,Text,TextInput,TouchableOpacity,FlatList,StyleSheet} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

const TODO_LIST_KEY = '@TodoList';

const App = () => {
  const [todos, setTodos] = useState([]);
  const [newTodo, setNewTodo] = useState('');

  useEffect(() => {
    loadTodos();
  }, []);

  const saveTodos = async (updatedTodos) => {
    try {
      const jsonTodos = JSON.stringify(updatedTodos);
      await AsyncStorage.setItem(TODO_LIST_KEY, jsonTodos);
      setTodos(updatedTodos);
    } catch (error) {
      console.error('Erro ao salvar os dados:', error);
    }
  };

  const loadTodos = async () => {
    try {
      const storedTodos = await AsyncStorage.getItem(TODO_LIST_KEY);

      if (storedTodos) {
        setTodos(JSON.parse(storedTodos));
      }
    } catch (error) {
      console.error('Erro ao carregar os dados:', error);
    }
  };

  const addTodo = () => {
    if (newTodo.trim() !== '') {
      const updatedTodos = [...todos, { id: Date.now(), text: newTodo, completed: false }];
      saveTodos(updatedTodos);
      setNewTodo('');
    }
  };

  const removeTodo = (id) => {
    const updatedTodos = todos.filter((todo) => todo.id !== id);
    saveTodos(updatedTodos);
  };

  const toggleTodo = (id) => {
    const updatedTodos = todos.map((todo) =>
      todo.id === id ? { ...todo, completed: !todo.completed } : todo
    );
    saveTodos(updatedTodos);
  };

  const renderItem = ({ item }) => (
    <View style={styles.todoItem}>
      <TouchableOpacity onPress={() => toggleTodo(item.id)}>
        <Text style={item.completed ? styles.completedText : styles.todoText}>
          {item.text}
        </Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={() => removeTodo(item.id)}>
        <Text style={styles.removeButton}>Remover</Text>
      </TouchableOpacity>
    </View>
  );

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        placeholder="Nova tarefa"
        value={newTodo}
        onChangeText={(text) => setNewTodo(text)}
      />
      <TouchableOpacity style={styles.addButton} onPress={addTodo}>
        <Text style={styles.addButtonText}>Adicionar</Text>
      </TouchableOpacity>
      <FlatList
        data={todos}
        renderItem={renderItem}
        keyExtractor={(item) => item.id.toString()}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 16,
  },
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    marginBottom: 8,
    paddingHorizontal: 8,
  },
  addButton: {
    backgroundColor: 'blue',
    padding: 8,
    borderRadius: 4,
    alignItems: 'center',
  },
  addButtonText: {
    color: 'white',
    fontWeight: 'bold',
  },
  todoItem: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    backgroundColor: '#eee',
    padding: 8,
    marginBottom: 8,
    borderRadius: 4,
  },
  todoText: {
    fontSize: 16,
  },
  completedText: {
    fontSize: 16,
    textDecorationLine: 'line-through',
    color: 'gray',
  },
  removeButton: {
    color: 'red',
  },
});

export default App;
