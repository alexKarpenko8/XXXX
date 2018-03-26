
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.DAL;

import java.util.List;
import ufc.model.Content;
import org.apache.ibatis.session.SqlSession;

/**
 *
 
 */
public class ContentDal extends BaseDal {
    
    public ContentDal() {
        super();
    }
    
    public List<Content> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Content> list = session.selectList("content.selectAll");
         session.close();
         return list;
    }
    
    public Content selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Content content = session.selectOne("content.selectById",id);
         session.close();
         return content;
    }
    
    public int update(Content content)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("content.update",content);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Content content)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("content.insert",content);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("content.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
    
   
}
