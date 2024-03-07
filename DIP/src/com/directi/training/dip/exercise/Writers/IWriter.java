package com.directi.training.dip.exercise_refacto.custom_io;

import java.io.IOException;

public interface IWriter {
    public void write(String buff) throws IOException;

    public void close() throws IOException;
}