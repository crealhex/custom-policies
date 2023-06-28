package org.politics.agents;

import org.politics.penalties.EvaluationException;
import org.politics.penalties.NonNullException;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public class NonNullAgent implements Evaluations {

    public void evaluate(Object value) throws EvaluationException {
        if (value == null) {
            throw new NonNullException();
        }
    }

    public void evaluate(long value) throws EvaluationException {
    }

    public void evaluate(double value) throws EvaluationException {
    }
}
