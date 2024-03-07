package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base32;

public class EncodingModuleBase32 implements IEncodingModule
{
    public void encode(IReader reader,IWriter writer) throws IOException
    {
        try{
            reader.read();
            String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
            writer.write(encodedLine);
        }catch(Exception ex){
            // Do stuff 
        }finally{
            reader.close();
            writer.close();
        }
    }
}

