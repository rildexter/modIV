// styles.js
import { StyleSheet } from 'react-native';

export const styles = StyleSheet.create({
  container: {
    flex: 1,
    resizeMode: 'cover',
  },
  backgroundImage: {
    flex: 1,
    resizeMode: 'cover',
    position: 'absolute',
    width: '100%',
    height: '100%',
  },
  contentContainer: {
    flex: 1,
    backgroundColor: 'rgba(255, 255, 255, 0.8)',
    padding: 16,
  },
  headerContainer: {
    backgroundColor: '#d3d3d3',
    padding: 8,
    marginBottom: 16,
    borderBottomWidth: 1,
    borderBottomColor: 'black',
  },
  header: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  label: {
    fontSize: 16,
    marginBottom: 4,
  },
  picker: {
    height: 40,
    width: '100%',
    borderColor: '#333',
    borderWidth: 1,
    marginBottom: 10,
    backgroundColor: '#fff',
  },
  input: {
    height: 40,
    width: '100%',
    borderColor: '#333',
    borderWidth: 1,
    marginBottom: 10,
    paddingLeft: 10,
    backgroundColor: '#fff',
  },
  result: {
    fontSize: 18,
    marginTop: 16,
  },
  footer: {
    marginTop: 16,
  },
});
