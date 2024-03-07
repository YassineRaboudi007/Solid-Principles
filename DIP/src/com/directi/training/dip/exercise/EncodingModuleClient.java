package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {

        IEncodingModule encodingModule = new Base64EncoderModule();

        IReader fileReader = new CustomFileReader(beforeEncryptionFile);
        IWriter fileWriter = new CustomFileWriter(afterEncryptionFile);

        encodingModule.encode(fileReader, fileWriter);

        IReader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        IWriter dbWriter = new DatabaseWriter();

        encodingModule.encode(networkReader, dbWriter);
    }
}
