package com.project.service;

import com.project.entities.Project;
import com.project.exception.DuplicateProjectNameException;
import com.project.exception.RecordNotFoundException;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    public List<Project> getAllprojects();

    public Project saveProject(Project project) throws DuplicateProjectNameException;

    public Project updateProject(int projectId, Project project) throws RecordNotFoundException;

    public void deleteProjectById(long projectId);

    public Optional<Project> getProjectById(long projectId);

    public List<Project> getDataByAnyInput(Project project);
}
