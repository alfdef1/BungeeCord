package net.md_5.mendax.datainput;

import java.io.DataInput;
import java.io.IOException;

public class UnsignedByteByte extends Instruction {

    @Override
    void read(DataInput in) throws IOException {
        int size = in.readUnsignedByte();
        skip(in, size);
    }
}
