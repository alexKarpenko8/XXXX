/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 
 */
public class Category {
    private int id;
    private String name;
    private List<Content> content;

    public Category() {
    }

    public Category(int id, String name, List<Content> content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        content = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.content);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        // todo error equals
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", content=" + content + '}';
    }
    
    
}
