/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.controllers;

import java.util.List;
import ufc.DAL.ContentDal;
import ufc.model.Content;
/**
 *

 */
public class ContentController {
    protected ContentDal contentDal;
    public ContentController() 
    {
        contentDal = new ContentDal();
    }
    
    public List<Content> getAllContent()
    {
        return contentDal.selectAll();
    }
    
    public Content getContent(int id)
    {
        return contentDal.selectById(id);
    }
     
    public int insertContent(Content content)
    {
        return contentDal.insert(content);
    }
      
    public int updateContent(Content content)
    {
        return contentDal.update(content);
    }
    
    public int deleteContentById(int id)
    {
        return contentDal.delete(id);
    }

    public int deleteContent(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
