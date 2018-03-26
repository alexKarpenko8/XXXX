/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 
 */
public class Content {
    private int id;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private byte[] image;
    private int id_category;
    
     public Content() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public byte[] getImage() {
        return image;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.title);
        hash = 61 * hash + Objects.hashCode(this.shortDescription);
        hash = 61 * hash + Objects.hashCode(this.fullDescription);
        hash = 61 * hash + Arrays.hashCode(this.image);
        hash = 61 * hash + this.id_category;
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
        final Content other = (Content) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_category != other.id_category) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.shortDescription, other.shortDescription)) {
            return false;
        }
        if (!Objects.equals(this.fullDescription, other.fullDescription)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Content{" + "id=" + id + ", title=" + title + ", shortDescription=" + shortDescription + ", fullDescription=" + fullDescription + ", image=" + image + ", id_category=" + id_category + '}';
    }

    
}
