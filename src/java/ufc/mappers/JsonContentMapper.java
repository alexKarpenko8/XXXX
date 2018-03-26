/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ufc.model.Content;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *

 */
public class JsonContentMapper {
    
    public static String toJSON(Content content)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(content);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonContentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Content> content)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(content);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonContentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Content fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Content content = mapper.readValue(json, Content.class);
            return content;
        } catch (IOException ex) {
            Logger.getLogger(JsonContentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
