package me.xitowzys.usecase.usecase;

import me.xitowzys.usecase.Usecase;
import me.xitowzys.usecase.ports.input.TestInput;
import me.xitowzys.usecase.ports.output.TestOutput;

public class TestUsecase extends Usecase<TestInput, TestOutput> {
    @Override
    public TestOutput execute(TestInput input) {
        return null;
    }
}
