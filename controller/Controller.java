package controller;

import java.util.List;

import model.Student;
import model.Teacher;
import service.StudyGroupService;

public class Controller {
    private StudyGroupService service = new StudyGroupService();

    public StudyGroupService getService() {
        return service;
    }

    public void setService(StudyGroupService service) {
        this.service = service;
    }
    public void createStudyGroup(Teacher teacher, List<Student> studentList){
        service.createGroup(null, null);
    }
}
