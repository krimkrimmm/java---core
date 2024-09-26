package extend_lesson.managebook.service;

import java.util.Scanner;

public interface IActionCommon {
    void insert(Scanner scanner);
    void update(Scanner scanner, int id);
    void delete(int id);
}