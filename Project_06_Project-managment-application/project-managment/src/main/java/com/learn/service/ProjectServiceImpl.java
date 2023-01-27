package com.learn.service;

import com.learn.dao.ProjectDaoImpl;
import com.learn.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    ProjectDaoImpl projectDaoImpl;


    @Override
    public List<Project> getAllprojects() {
        return projectDaoImpl.getAllprojects();
    }

    @Override
    public Project saveProject(Project project) {
        return projectDaoImpl.saveProject(project);
    }

    @Override
    public Project updateProject(int projectId) {
        return projectDaoImpl.updateProject(projectId);
    }

    @Override
    public void deleteProjectById(long projectId) {
            projectDaoImpl.deleteProjectById(projectId);
    }

    @Override
    public Optional<Project> getProjectById(long projectId) {
        return projectDaoImpl.getProjectById(projectId);
    }
}
