package org.politics.terms;

import org.politics.penalties.EvaluationException;

import java.lang.reflect.Field;
import java.util.List;
import java.util.NoSuchElementException;

public interface Mandate {

    Object applyLaws();

    void fieldDealer(String fieldName) throws EvaluationException;

    List<String> getFieldsUnderLaw();

    String getFieldType(Field field);

    Field getSingleField(String fieldName) throws NoSuchElementException;

    Field[] getFields();

    void setBean(Object bean);

}
