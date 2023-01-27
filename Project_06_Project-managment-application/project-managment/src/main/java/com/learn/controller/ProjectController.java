package com.learn.controller;

import com.learn.entities.Project;
import com.learn.exception.RecordNotFoundException;
import com.learn.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectServiceImpl projectServiceImpl;

    @GetMapping("/getallproject")
    public ResponseEntity<List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectServiceImpl.getAllprojects());
    }

    @PostMapping("/saveData")
    public ResponseEntity<Project> saveProject(@RequestBody Project project) {
        return ResponseEntity.ok(projectServiceImpl.saveProject(project));
    }

    @PutMapping("/updateProject/{projectId}")
    public ResponseEntity<Project> updateProject(@PathVariable int projectId, @RequestBody Project project) throws RecordNotFoundException {
        Project project1 = projectServiceImpl.getProjectById(projectId).orElseThrow(() -> new RecordNotFoundException("Project Id does not exist"));
        project1.setName(project.getName());
        project1.setStage(project.getStage());
        project1.setDescription(project.getDescription());

        return ResponseEntity.ok(projectServiceImpl.saveProject(project));

    }

    @GetMapping("/getProjectById/{projectId}")
    public ResponseEntity<Optional<Project>> getProjectById(@PathVariable long projectId) {
        return ResponseEntity.ok(projectServiceImpl.getProjectById(projectId));
    }

    @DeleteMapping("/deleteProjectById/{projectId}")
    public ResponseEntity<String> deleteProjectById(@PathVariable long projectId) {
        projectServiceImpl.deleteProjectById(projectId);
        return ResponseEntity.ok("Project deleted successfully.....ProjectId =  " + projectId);
    }
}
