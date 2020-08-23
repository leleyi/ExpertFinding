package com.company.project.model;

public class Paper2Search {

    private String name;

    private String authors;

    private String paparAbstract;

    public Paper2Search(String name, String authors, String paparAbstract) {
        this.name = name;
        this.authors = authors;
        this.paparAbstract = paparAbstract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPaparAbstract() {
        return paparAbstract;
    }

    public void setPaparAbstract(String paparAbstract) {
        this.paparAbstract = paparAbstract;
    }

}

