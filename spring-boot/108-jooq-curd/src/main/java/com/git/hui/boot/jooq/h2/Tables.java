/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.h2;


import com.git.hui.boot.jooq.h2.tables.PoetTB;
import com.git.hui.boot.jooq.h2.tables.PoetryTB;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.POET</code>.
     */
    public static final PoetTB POET = PoetTB.POET;

    /**
     * The table <code>PUBLIC.POETRY</code>.
     */
    public static final PoetryTB POETRY = PoetryTB.POETRY;
}
