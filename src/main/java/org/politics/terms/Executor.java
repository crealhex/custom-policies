package org.politics.terms;

import org.politics.agents.Evaluations;
import org.politics.penalties.EvaluationException;

import java.lang.reflect.Field;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class Executor implements Mandate {

    protected Class<?> beanClass;
    protected Object beanObject;
    protected Evaluations agent;
    protected List<String> suspectList;

    public Object applyLaws() {
        return null;
    }

    public void fieldDealer(String fieldName) throws EvaluationException {

    }

    public List<String> getFieldsUnderLaw() {
        return null;
    }

    public String getFieldType(Field field) {
        return null;
    }

    public Field getSingleField(String fieldName) throws NoSuchElementException {
        return null;
    }

    public Field[] getFields() {
        return new Field[0];
    }

    public void setBean(Object bean) {

    }
}
