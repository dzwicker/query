package com.ctp.cdi.query.criteria.selection.temporal;

import java.sql.Timestamp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Selection;

import com.ctp.cdi.query.criteria.QuerySelection;

public class CurrentTimestamp<P> implements QuerySelection<P, Timestamp> {

    @Override
    public <R> Selection<Timestamp> toSelection(CriteriaQuery<R> query, CriteriaBuilder builder, Path<? extends P> path) {
        return builder.currentTimestamp();
    }

}
