package extend_lesson.managebook.service;

import java.util.Scanner;
//T:type
public interface IActionCommon2 <T> {
    void insert(T object);
    void update(Scanner scanner, int id);
    void delete(int id);
}