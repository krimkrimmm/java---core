package extend_lesson.lab2.service;

import extend_lesson.lab2.entities.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReaderService {
    private List<Reader> readers = new ArrayList<>();

    // Method to add a new reader
    public void addReader(Reader reader) {
        readers.add(reader);
    }

    // Method to delete a reader by ID
    public void deleteReader(int id) {
        readers.removeIf(reader -> reader.getId() == id);
    }

    // Method to update reader information
    public void updateReader(Reader updatedReader) {
        for (Reader reader : readers) {
            if (reader.getId() == updatedReader.getId()) {
                reader.setName(updatedReader.getName());
                reader.setPhonenumber(updatedReader.getPhonenumber());
                reader.setAddress(updatedReader.getAddress());
                break;
            }
        }
    }

    // Method to get a reader by ID
    public Reader getReaderById(int id) {
        for (Reader reader : readers) {
            if (reader.getId() == id) {
                return reader;
            }
        }
        return null;
    }

    // Method to get all readers
    public List<Reader> getAllReaders() {
        return readers;
    }
}


