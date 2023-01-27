package com.learn.service;

import com.learn.dao.ProjectDaoImpl;
import com.learn.entities.Project;
import com.learn.exception.DuplicateProjectNameException;
import com.learn.exception.RecordNotFoundException;
import com.learn.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    ProjectDaoImpl projectDaoImpl;

    @Autowired
    ProjectRepo projectRepo;


    @Override
    public List<Project> getAllprojects() {
        return projectDaoImpl.getAllprojects();
    }

    @Override
    public Project saveProject(Project project) throws DuplicateProjectNameException {
        Project project1=projectRepo.getProjectByprojectName(project.getProjectName());
        if(Objects.nonNull(project1)){
            throw new DuplicateProjectNameException("Duplicate field name found Project Name = "+project.getProjectName());
        }
        return projectDaoImpl.saveProject(project);
    }

    @Override
    public Project updateProject(int projectId, Project project) throws RecordNotFoundException {
        Project project1 = projectDaoImpl.getProjectById(projectId).orElseThrow(() -> new RecordNotFoundException("Project Id does not exist"));
        project1.setProjectName(project.getProjectName());
        project1.setStage(project.getStage());
        project1.setDescription(project.getDescription());

        return projectDaoImpl.updateProject(project1);
    }

    @Override
    public void deleteProjectById(long projectId) {
            projectDaoImpl.deleteProjectById(projectId);
    }

    @Override
    public Optional<Project> getProjectById(long projectId) {
        return projectDaoImpl.getProjectById(projectId);
    }

    @Override
    public List<Project> getDataByAnyInput(Project project) {
        return projectDaoImpl.getDataByAnyInput(project);
    }
}
