package service;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupService {
    public StudyGroup createGroup(Teacher teacher, List<Student> studentList){
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        return studyGroup;
    }
}
