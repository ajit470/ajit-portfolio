package com.as.portfolio.model;

import java.util.List;

public class Profile {
    private String fullName;
    private String headline;
    private String location;
    private String email;
    private String phone;
    private String linkedInUrl;
    private String githubUrl;
    private String resumeUrl;
    private String summary;
    private List<String> highlights;
    private List<String> backendSkills;
    private List<String> frontendSkills;
    private List<String> databaseSkills;
    private List<String> devopsSkills;
    private List<String> practices;

    // Corrected 15-parameter constructor
    public Profile(String fullName, String headline, String location, String email, 
                   String phone, String linkedInUrl, String githubUrl, String resumeUrl, 
                   String summary, List<String> highlights, List<String> backendSkills, 
                   List<String> frontendSkills, List<String> databaseSkills, 
                   List<String> devopsSkills, List<String> practices) {
        this.fullName = fullName;
        this.headline = headline;
        this.location = location;
        this.email = email;
        this.phone = phone;
        this.linkedInUrl = linkedInUrl;
        this.githubUrl = githubUrl;
        this.resumeUrl = resumeUrl;
        this.summary = summary;
        this.highlights = highlights;
        this.backendSkills = backendSkills;
        this.frontendSkills = frontendSkills;
        this.databaseSkills = databaseSkills;
        this.devopsSkills = devopsSkills;
        this.practices = practices;
    }

    // Getters - Essential for Thymeleaf
    public String getFullName() { return fullName; }
    public String getHeadline() { return headline; }
    public String getLocation() { return location; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getLinkedInUrl() { return linkedInUrl; }
    public String getGithubUrl() { return githubUrl; }
    public String getResumeUrl() { return resumeUrl; }
    public String getSummary() { return summary; }
    public List<String> getHighlights() { return highlights; }
    public List<String> getBackendSkills() { return backendSkills; }
    public List<String> getFrontendSkills() { return frontendSkills; }
    public List<String> getDatabaseSkills() { return databaseSkills; }
    public List<String> getDevopsSkills() { return devopsSkills; }
    public List<String> getPractices() { return practices; }
}