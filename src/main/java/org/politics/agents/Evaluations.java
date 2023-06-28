package org.politics.agents;

import org.politics.penalties.EvaluationException;

public interface Evaluations {

    void evaluate(Object value) throws EvaluationException;

    void evaluate(long value) throws EvaluationException;

    void evaluate(double value) throws EvaluationException;

}
