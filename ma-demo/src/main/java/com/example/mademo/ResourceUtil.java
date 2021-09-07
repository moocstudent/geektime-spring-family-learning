package com.example.mademo;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.Reader;

public class ResourceUtil {

    static String getContent(Resource resource){
        try {
            return getContent(resource, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    static String getContent(Resource resource,String encoding) throws IOException {
        EncodedResource encodedResource = new EncodedResource(resource, encoding);
        //字符输入流
        try (Reader reader = encodedResource.getReader()) {
            return IOUtils.toString(reader);
        }
    }
}
