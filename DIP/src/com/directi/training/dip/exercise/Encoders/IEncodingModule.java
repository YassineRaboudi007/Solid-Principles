package com.directi.training.isp.exercise;

public interface IEncodingModule
{
    void encode(IReader reader,IWriter writer) throws IOException;
}
