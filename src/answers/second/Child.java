package answers.second;

import answers.second.Parent;

public class Child extends Parent {

    @Override
    public String doSmth() { //  сигнатура поменялась, но метод по прежнему считается как @Override
        return "String -- это наследник Object";
    }
}
