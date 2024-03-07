package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {

        IEncodingModule encodingModule = new Base64EncoderModule();

        CustomFileReader fileReader = new CustomFileReader(beforeEncryptionFile);
        CustomFileWriter fileWriter = new CustomFileWriter(afterEncryptionFile);

        encodingModule.encode(fileReader, fileWriter);

        NetworkReader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        DatabaseWriter dbWriter = new DatabaseWriter();

        encodingModule.encode(networkReader, dbWriter);
    }
}
