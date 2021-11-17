/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.h2;


import com.git.hui.boot.jooq.h2.tables.PoetTB;
import com.git.hui.boot.jooq.h2.tables.PoetryTB;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PRIMARY_KEY_2 = Indexes0.PRIMARY_KEY_2;
    public static final Index PRIMARY_KEY_8 = Indexes0.PRIMARY_KEY_8;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PRIMARY_KEY_2 = Internal.createIndex("PRIMARY_KEY_2", PoetTB.POET, new OrderField[] { PoetTB.POET.ID }, true);
        public static Index PRIMARY_KEY_8 = Internal.createIndex("PRIMARY_KEY_8", PoetryTB.POETRY, new OrderField[] { PoetryTB.POETRY.ID }, true);
    }
}
