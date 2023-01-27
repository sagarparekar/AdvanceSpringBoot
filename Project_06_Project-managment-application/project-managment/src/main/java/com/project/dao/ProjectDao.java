package com.project.dao;

import com.project.entities.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectDao {

    public List<Project> getAllprojects();

    public Project saveProject(Project project);

    public Project updateProject( Project project);

    public void deleteProjectById(long projectId);

    public Optional<Project> getProjectById(long projectId);

    public List<Project> getDataByAnyInput(Project project);

}
