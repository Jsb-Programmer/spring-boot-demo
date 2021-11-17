/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.h2.tables;


import com.git.hui.boot.jooq.h2.Indexes;
import com.git.hui.boot.jooq.h2.Keys;
import com.git.hui.boot.jooq.h2.Public;
import com.git.hui.boot.jooq.h2.tables.records.PoetRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Poet extends TableImpl<PoetRecord> {

    private static final long serialVersionUID = 1392883025;

    /**
     * The reference instance of <code>PUBLIC.POET</code>
     */
    public static final Poet POET = new Poet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoetRecord> getRecordType() {
        return PoetRecord.class;
    }

    /**
     * The column <code>PUBLIC.POET.ID</code>.
     */
    public final TableField<PoetRecord, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.POET.NAME</code>.
     */
    public final TableField<PoetRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>PUBLIC.POET</code> table reference
     */
    public Poet() {
        this(DSL.name("POET"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.POET</code> table reference
     */
    public Poet(String alias) {
        this(DSL.name(alias), POET);
    }

    /**
     * Create an aliased <code>PUBLIC.POET</code> table reference
     */
    public Poet(Name alias) {
        this(alias, POET);
    }

    private Poet(Name alias, Table<PoetRecord> aliased) {
        this(alias, aliased, null);
    }

    private Poet(Name alias, Table<PoetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Poet(Table<O> child, ForeignKey<O, PoetRecord> key) {
        super(child, key, POET);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_2);
    }

    @Override
    public UniqueKey<PoetRecord> getPrimaryKey() {
        return Keys.PK_T_POET;
    }

    @Override
    public List<UniqueKey<PoetRecord>> getKeys() {
        return Arrays.<UniqueKey<PoetRecord>>asList(Keys.PK_T_POET);
    }

    @Override
    public Poet as(String alias) {
        return new Poet(DSL.name(alias), this);
    }

    @Override
    public Poet as(Name alias) {
        return new Poet(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Poet rename(String name) {
        return new Poet(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Poet rename(Name name) {
        return new Poet(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
