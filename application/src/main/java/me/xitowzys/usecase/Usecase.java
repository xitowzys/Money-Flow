package me.xitowzys.usecase;

import me.xitowzys.usecase.ports.InputValues;
import me.xitowzys.usecase.ports.OutputValues;

public abstract class Usecase<I extends InputValues, O extends OutputValues> {
    public abstract O execute(I input);
    
}