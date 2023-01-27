package com.learn.dao;

import com.learn.entities.Project;
import com.learn.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    ProjectRepo projectRepoImpl;


    @Override
    public List<Project> getAllprojects() {
        return projectRepoImpl.findAll();
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepoImpl.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepoImpl.save(project);
    }

    @Override
    public void deleteProjectById(long projectId) {
        projectRepoImpl.deleteById(projectId);

    }

    @Override
    public Optional<Project> getProjectById(long projectId) {
        return projectRepoImpl.findById(projectId);
    }

    @Override
    public List<Project> getDataByAnyInput(Project project) {

        List<Project> projectList = new ArrayList<>();

        for (Project proj : projectRepoImpl.findAll()) {
            if (proj.getProjectId() == project.getProjectId()
                    || proj.getProjectName().equals(project.getProjectName())
                    || proj.getStage().equals(project.getStage())
                    || proj.getDescription().equals(project.getDescription())) {
                projectList.add(proj);
            }
        }

        return projectList;
    }
}
